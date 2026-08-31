package lf;

import android.app.Activity;
import android.content.Context;
import hg.y0;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.u60;
import org.telegram.ui.d31;
import org.telegram.ui.m31;
import org.telegram.ui.xn;
public final class g0 implements Runnable {
    public final int f12449a = 1;
    public final long f12450b;
    public final Object f12451c;
    public final Object d;
    public final Object f12452e;
    public final Object f12453f;
    public final Object h;
    public final Object f12454n;

    public g0(long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.f12452e = conferenceCall;
        this.f12453f = getgroupcallchainblocks;
        this.f12450b = j10;
        this.f12451c = tLObject;
        this.d = tL_error;
        this.h = atomicBoolean;
        this.f12454n = atomicInteger;
    }

    @Override
    public final void run() {
        TLRPC.VideoSize closestVideoSizeWithSize;
        boolean z4;
        switch (this.f12449a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                xn xnVar = (xn) this.f12452e;
                TLObject tLObject = (TLObject) this.f12451c;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.f12453f;
                String str = (String) this.f12454n;
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f20867id;
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
                    xnVar.getMessagesController().getDialogPhotos(user.f20990id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    xnVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    MessagesController messagesController = xnVar.getMessagesController();
                    long j10 = this.f12450b;
                    TLRPC.UserFull userFull = messagesController.getUserFull(j10);
                    userFull.profile_photo = tL_photos_photo.photo;
                    xnVar.getMessagesStorage().updateUserInfo(userFull, false);
                    qc.a0(xnVar).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new y0(j10, xnVar)), null).j();
                    return;
                }
                return;
            case 1:
                ((ConferenceCall) this.f12452e).lambda$poll$7((TL_phone.getGroupCallChainBlocks) this.f12453f, this.f12450b, (TLObject) this.f12451c, (TLRPC.TL_error) this.d, (AtomicBoolean) this.h, (AtomicInteger) this.f12454n);
                return;
            case 2:
                u60.n((u60) this.d, (d2) this.f12452e, (Context) this.f12451c, this.f12450b, (TLRPC.TL_chatInviteExported) this.f12453f, (TLRPC.TL_chatInviteImporter) this.h, (TLRPC.ChannelParticipant) this.f12454n);
                return;
            default:
                Activity activity = (Activity) this.d;
                g6 g6Var = (g6) this.f12453f;
                byte[] bArr = (byte[]) this.h;
                MessageObject messageObject = (MessageObject) this.f12454n;
                m31 m31Var = new m31(activity, g6Var, this.f12450b, bArr);
                m31Var.O((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f12451c));
                m31Var.f38961s = new d31((xn) this.f12452e, activity, g6Var, messageObject);
                m31Var.show();
                return;
        }
    }

    public g0(TLObject tLObject, Activity activity, g6 g6Var, long j10, byte[] bArr, xn xnVar, MessageObject messageObject) {
        this.f12451c = tLObject;
        this.d = activity;
        this.f12453f = g6Var;
        this.f12450b = j10;
        this.h = bArr;
        this.f12452e = xnVar;
        this.f12454n = messageObject;
    }

    public g0(TLRPC.TL_error tL_error, xn xnVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.d = tL_error;
        this.f12452e = xnVar;
        this.f12451c = tLObject;
        this.f12453f = fileLocationArr;
        this.f12454n = str;
        this.h = fileLocationArr2;
        this.f12450b = j10;
    }

    public g0(u60 u60Var, d2 d2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.d = u60Var;
        this.f12452e = d2Var;
        this.f12451c = context;
        this.f12450b = j10;
        this.f12453f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.f12454n = channelParticipant;
    }
}
