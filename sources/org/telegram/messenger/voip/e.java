package org.telegram.messenger.voip;

import android.app.Activity;
import android.content.Context;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.xc;
import org.telegram.ui.g21;
import org.telegram.ui.je;
import org.telegram.ui.o21;
import org.telegram.ui.qn;
public final class e implements Runnable {
    public final int f19847a = 0;
    public final long f19848b;
    public final Object f19849c;
    public final Object d;
    public final Object e;
    public final Object f19850f;
    public final Object h;
    public final Object f19851n;

    public e(long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.f19849c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f19848b = j10;
        this.e = tLObject;
        this.f19850f = tL_error;
        this.h = atomicBoolean;
        this.f19851n = atomicInteger;
    }

    @Override
    public final void run() {
        TLRPC.VideoSize closestVideoSizeWithSize;
        boolean z10;
        switch (this.f19847a) {
            case 0:
                ((ConferenceCall) this.f19849c).lambda$poll$7((TL_phone.getGroupCallChainBlocks) this.d, this.f19848b, (TLObject) this.e, (TLRPC.TL_error) this.f19850f, (AtomicBoolean) this.h, (AtomicInteger) this.f19851n);
                return;
            case 1:
                l70.o((l70) this.f19849c, (b2) this.d, (Context) this.e, this.f19848b, (TLRPC.TL_chatInviteExported) this.f19850f, (TLRPC.TL_chatInviteImporter) this.h, (TLRPC.ChannelParticipant) this.f19851n);
                return;
            case 2:
                Activity activity = (Activity) this.f19849c;
                d6 d6Var = (d6) this.d;
                byte[] bArr = (byte[]) this.f19850f;
                MessageObject messageObject = (MessageObject) this.f19851n;
                o21 o21Var = new o21(activity, d6Var, this.f19848b, bArr);
                o21Var.P((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.e));
                o21Var.f39746s = new g21((qn) this.h, activity, d6Var, messageObject);
                o21Var.show();
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f19850f;
                qn qnVar = (qn) this.f19849c;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.d;
                String str = (String) this.h;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.f19851n;
                if (tL_error == null) {
                    TLRPC.User user = qnVar.getMessagesController().getUser(Long.valueOf(qnVar.getUserConfig().getClientUserId()));
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f20299id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && fileLocationArr[0] != null) {
                        FileLoader.getInstance(qnVar.getCurrentAccount()).getPathToAttach(fileLocationArr[0], true).renameTo(FileLoader.getInstance(qnVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocationArr[0].volume_id);
                        sb2.append("_");
                        String n10 = a1.g.n(fileLocationArr[0].local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(qnVar.getCurrentAccount(), user, 1), false);
                    } else {
                        z10 = true;
                    }
                    if (closestVideoSizeWithSize != null && str != null) {
                        new File(str).renameTo(FileLoader.getInstance(qnVar.getCurrentAccount()).getPathToAttach(closestVideoSizeWithSize, "mp4", z10));
                    } else if (closestPhotoSizeWithSize2 != null && fileLocationArr2[0] != null) {
                        FileLoader.getInstance(qnVar.getCurrentAccount()).getPathToAttach(fileLocationArr2[0], true).renameTo(FileLoader.getInstance(qnVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    qnVar.getMessagesController().getDialogPhotos(user.f20422id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    qnVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    MessagesController messagesController = qnVar.getMessagesController();
                    long j10 = this.f19848b;
                    TLRPC.UserFull userFull = messagesController.getUserFull(j10);
                    userFull.profile_photo = tL_photos_photo.photo;
                    qnVar.getMessagesStorage().updateUserInfo(userFull, false);
                    xc.a0(qnVar).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new je(j10, qnVar)), null).j();
                    return;
                }
                return;
        }
    }

    public e(TLObject tLObject, Activity activity, d6 d6Var, long j10, byte[] bArr, qn qnVar, MessageObject messageObject) {
        this.e = tLObject;
        this.f19849c = activity;
        this.d = d6Var;
        this.f19848b = j10;
        this.f19850f = bArr;
        this.h = qnVar;
        this.f19851n = messageObject;
    }

    public e(TLRPC.TL_error tL_error, qn qnVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.f19850f = tL_error;
        this.f19849c = qnVar;
        this.e = tLObject;
        this.d = fileLocationArr;
        this.h = str;
        this.f19851n = fileLocationArr2;
        this.f19848b = j10;
    }

    public e(l70 l70Var, b2 b2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.f19849c = l70Var;
        this.d = b2Var;
        this.e = context;
        this.f19848b = j10;
        this.f19850f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.f19851n = channelParticipant;
    }
}
