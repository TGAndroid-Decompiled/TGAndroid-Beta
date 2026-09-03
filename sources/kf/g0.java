package kf;

import android.app.Activity;
import android.content.Context;
import gg.y0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t60;
import org.telegram.ui.i31;
import org.telegram.ui.q31;
import org.telegram.ui.zn;
public final class g0 implements Runnable {
    public final int f10447a = 1;
    public final long f10448b;
    public final Object f10449c;
    public final Object d;
    public final Object e;
    public final Object f10450f;
    public final Object h;
    public final Object f10451n;

    public g0(long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.e = conferenceCall;
        this.f10450f = getgroupcallchainblocks;
        this.f10448b = j10;
        this.f10449c = tLObject;
        this.d = tL_error;
        this.h = atomicBoolean;
        this.f10451n = atomicInteger;
    }

    @Override
    public final void run() {
        TLRPC.VideoSize closestVideoSizeWithSize;
        boolean z4;
        switch (this.f10447a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                zn znVar = (zn) this.e;
                TLObject tLObject = (TLObject) this.f10449c;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.f10450f;
                String str = (String) this.f10451n;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.h;
                if (tL_error == null) {
                    TLRPC.User user = znVar.getMessagesController().getUser(Long.valueOf(znVar.getUserConfig().getClientUserId()));
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 150);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
                    if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                        closestVideoSizeWithSize = null;
                    } else {
                        closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(tL_photos_photo.photo.video_sizes, 1000);
                    }
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f19183id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && fileLocationArr[0] != null) {
                        FileLoader.getInstance(znVar.getCurrentAccount()).getPathToAttach(fileLocationArr[0], true).renameTo(FileLoader.getInstance(znVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb = new StringBuilder();
                        sb.append(fileLocationArr[0].volume_id);
                        sb.append("_");
                        String m9 = android.support.v4.media.a.m(fileLocationArr[0].local_id, "@50_50", sb);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(closestPhotoSizeWithSize.location.volume_id);
                        sb2.append("_");
                        z4 = true;
                        ImageLoader.getInstance().replaceImageInCache(m9, android.support.v4.media.a.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2), ImageLocation.getForUserOrChat(znVar.getCurrentAccount(), user, 1), false);
                    } else {
                        z4 = true;
                    }
                    if (closestVideoSizeWithSize != null && str != null) {
                        new File(str).renameTo(FileLoader.getInstance(znVar.getCurrentAccount()).getPathToAttach(closestVideoSizeWithSize, "mp4", z4));
                    } else if (closestPhotoSizeWithSize2 != null && fileLocationArr2[0] != null) {
                        FileLoader.getInstance(znVar.getCurrentAccount()).getPathToAttach(fileLocationArr2[0], true).renameTo(FileLoader.getInstance(znVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    znVar.getMessagesController().getDialogPhotos(user.f19306id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    znVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    MessagesController messagesController = znVar.getMessagesController();
                    long j10 = this.f10448b;
                    TLRPC.UserFull userFull = messagesController.getUserFull(j10);
                    userFull.profile_photo = tL_photos_photo.photo;
                    znVar.getMessagesStorage().updateUserInfo(userFull, false);
                    qc.a0(znVar).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new y0(j10, znVar)), null).j();
                    return;
                }
                return;
            case 1:
                ((ConferenceCall) this.e).lambda$poll$7((TL_phone.getGroupCallChainBlocks) this.f10450f, this.f10448b, (TLObject) this.f10449c, (TLRPC.TL_error) this.d, (AtomicBoolean) this.h, (AtomicInteger) this.f10451n);
                return;
            case 2:
                t60.n((t60) this.d, (d2) this.e, (Context) this.f10449c, this.f10448b, (TLRPC.TL_chatInviteExported) this.f10450f, (TLRPC.TL_chatInviteImporter) this.h, (TLRPC.ChannelParticipant) this.f10451n);
                return;
            default:
                Activity activity = (Activity) this.d;
                f6 f6Var = (f6) this.f10450f;
                byte[] bArr = (byte[]) this.h;
                MessageObject messageObject = (MessageObject) this.f10451n;
                q31 q31Var = new q31(activity, f6Var, this.f10448b, bArr);
                q31Var.O((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f10449c));
                q31Var.f37293s = new i31((zn) this.e, activity, f6Var, messageObject);
                q31Var.show();
                return;
        }
    }

    public g0(TLObject tLObject, Activity activity, f6 f6Var, long j10, byte[] bArr, zn znVar, MessageObject messageObject) {
        this.f10449c = tLObject;
        this.d = activity;
        this.f10450f = f6Var;
        this.f10448b = j10;
        this.h = bArr;
        this.e = znVar;
        this.f10451n = messageObject;
    }

    public g0(TLRPC.TL_error tL_error, zn znVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.d = tL_error;
        this.e = znVar;
        this.f10449c = tLObject;
        this.f10450f = fileLocationArr;
        this.f10451n = str;
        this.h = fileLocationArr2;
        this.f10448b = j10;
    }

    public g0(t60 t60Var, d2 d2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.d = t60Var;
        this.e = d2Var;
        this.f10449c = context;
        this.f10448b = j10;
        this.f10450f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.f10451n = channelParticipant;
    }
}
