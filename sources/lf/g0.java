package lf;

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
import org.telegram.ui.Components.s60;
import org.telegram.ui.b31;
import org.telegram.ui.k31;
import org.telegram.ui.xn;
public final class g0 implements Runnable {
    public final int f12005a = 1;
    public final long f12006b;
    public final Object f12007c;
    public final Object d;
    public final Object e;
    public final Object f12008f;
    public final Object h;
    public final Object f12009n;

    public g0(long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.e = conferenceCall;
        this.f12008f = getgroupcallchainblocks;
        this.f12006b = j10;
        this.f12007c = tLObject;
        this.d = tL_error;
        this.h = atomicBoolean;
        this.f12009n = atomicInteger;
    }

    @Override
    public final void run() {
        TLRPC.VideoSize closestVideoSizeWithSize;
        boolean z4;
        switch (this.f12005a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                xn xnVar = (xn) this.e;
                TLObject tLObject = (TLObject) this.f12007c;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.f12008f;
                String str = (String) this.f12009n;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.h;
                if (tL_error == null) {
                    TLRPC.User user = xnVar.getMessagesController().getUser(Long.valueOf(xnVar.getUserConfig().getClientUserId()));
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f19208id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && fileLocationArr[0] != null) {
                        FileLoader.getInstance(xnVar.getCurrentAccount()).getPathToAttach(fileLocationArr[0], true).renameTo(FileLoader.getInstance(xnVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb = new StringBuilder();
                        sb.append(fileLocationArr[0].volume_id);
                        sb.append("_");
                        String m9 = android.support.v4.media.a.m(fileLocationArr[0].local_id, "@50_50", sb);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(closestPhotoSizeWithSize.location.volume_id);
                        sb2.append("_");
                        z4 = true;
                        ImageLoader.getInstance().replaceImageInCache(m9, android.support.v4.media.a.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2), ImageLocation.getForUserOrChat(xnVar.getCurrentAccount(), user, 1), false);
                    } else {
                        z4 = true;
                    }
                    if (closestVideoSizeWithSize != null && str != null) {
                        new File(str).renameTo(FileLoader.getInstance(xnVar.getCurrentAccount()).getPathToAttach(closestVideoSizeWithSize, "mp4", z4));
                    } else if (closestPhotoSizeWithSize2 != null && fileLocationArr2[0] != null) {
                        FileLoader.getInstance(xnVar.getCurrentAccount()).getPathToAttach(fileLocationArr2[0], true).renameTo(FileLoader.getInstance(xnVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    xnVar.getMessagesController().getDialogPhotos(user.f19331id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    xnVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    MessagesController messagesController = xnVar.getMessagesController();
                    long j10 = this.f12006b;
                    TLRPC.UserFull userFull = messagesController.getUserFull(j10);
                    userFull.profile_photo = tL_photos_photo.photo;
                    xnVar.getMessagesStorage().updateUserInfo(userFull, false);
                    qc.a0(xnVar).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new y0(j10, xnVar)), null).j();
                    return;
                }
                return;
            case 1:
                ((ConferenceCall) this.e).lambda$poll$7((TL_phone.getGroupCallChainBlocks) this.f12008f, this.f12006b, (TLObject) this.f12007c, (TLRPC.TL_error) this.d, (AtomicBoolean) this.h, (AtomicInteger) this.f12009n);
                return;
            case 2:
                s60.n((s60) this.d, (d2) this.e, (Context) this.f12007c, this.f12006b, (TLRPC.TL_chatInviteExported) this.f12008f, (TLRPC.TL_chatInviteImporter) this.h, (TLRPC.ChannelParticipant) this.f12009n);
                return;
            default:
                Activity activity = (Activity) this.d;
                f6 f6Var = (f6) this.f12008f;
                byte[] bArr = (byte[]) this.h;
                MessageObject messageObject = (MessageObject) this.f12009n;
                k31 k31Var = new k31(activity, f6Var, this.f12006b, bArr);
                k31Var.O((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f12007c));
                k31Var.f35562s = new b31((xn) this.e, activity, f6Var, messageObject);
                k31Var.show();
                return;
        }
    }

    public g0(TLObject tLObject, Activity activity, f6 f6Var, long j10, byte[] bArr, xn xnVar, MessageObject messageObject) {
        this.f12007c = tLObject;
        this.d = activity;
        this.f12008f = f6Var;
        this.f12006b = j10;
        this.h = bArr;
        this.e = xnVar;
        this.f12009n = messageObject;
    }

    public g0(TLRPC.TL_error tL_error, xn xnVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.d = tL_error;
        this.e = xnVar;
        this.f12007c = tLObject;
        this.f12008f = fileLocationArr;
        this.f12009n = str;
        this.h = fileLocationArr2;
        this.f12006b = j10;
    }

    public g0(s60 s60Var, d2 d2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.d = s60Var;
        this.e = d2Var;
        this.f12007c = context;
        this.f12006b = j10;
        this.f12008f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.f12009n = channelParticipant;
    }
}
