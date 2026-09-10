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
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.wc;
import org.telegram.ui.eo;
import org.telegram.ui.h41;
import org.telegram.ui.me;
import org.telegram.ui.z31;
public final class f implements Runnable {
    public final int f16715a = 0;
    public final long f16716b;
    public final Object f16717c;
    public final Object d;
    public final Object e;
    public final Object f16718f;
    public final Object h;
    public final Object f16719n;

    public f(long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.f16717c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f16716b = j3;
        this.e = tLObject;
        this.f16718f = tL_error;
        this.h = atomicBoolean;
        this.f16719n = atomicInteger;
    }

    @Override
    public final void run() {
        TLRPC.VideoSize closestVideoSizeWithSize;
        boolean z10;
        switch (this.f16715a) {
            case 0:
                ((ConferenceCall) this.f16717c).lambda$poll$7((TL_phone.getGroupCallChainBlocks) this.d, this.f16716b, (TLObject) this.e, (TLRPC.TL_error) this.f16718f, (AtomicBoolean) this.h, (AtomicInteger) this.f16719n);
                return;
            case 1:
                a70.n((a70) this.f16717c, (d2) this.d, (Context) this.e, this.f16716b, (TLRPC.TL_chatInviteExported) this.f16718f, (TLRPC.TL_chatInviteImporter) this.h, (TLRPC.ChannelParticipant) this.f16719n);
                return;
            case 2:
                Activity activity = (Activity) this.f16717c;
                f6 f6Var = (f6) this.d;
                byte[] bArr = (byte[]) this.f16718f;
                MessageObject messageObject = (MessageObject) this.f16719n;
                h41 h41Var = new h41(activity, f6Var, this.f16716b, bArr);
                h41Var.O((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.e));
                h41Var.f33274s = new z31((eo) this.h, activity, f6Var, messageObject);
                h41Var.show();
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f16718f;
                eo eoVar = (eo) this.f16717c;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.d;
                String str = (String) this.h;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.f16719n;
                if (tL_error == null) {
                    TLRPC.User user = eoVar.getMessagesController().getUser(Long.valueOf(eoVar.getUserConfig().getClientUserId()));
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f17219id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && fileLocationArr[0] != null) {
                        FileLoader.getInstance(eoVar.getCurrentAccount()).getPathToAttach(fileLocationArr[0], true).renameTo(FileLoader.getInstance(eoVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocationArr[0].volume_id);
                        sb2.append("_");
                        String n10 = a4.a.n(fileLocationArr[0].local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        ImageLoader.getInstance().replaceImageInCache(n10, a4.a.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(eoVar.getCurrentAccount(), user, 1), false);
                    } else {
                        z10 = true;
                    }
                    if (closestVideoSizeWithSize != null && str != null) {
                        new File(str).renameTo(FileLoader.getInstance(eoVar.getCurrentAccount()).getPathToAttach(closestVideoSizeWithSize, "mp4", z10));
                    } else if (closestPhotoSizeWithSize2 != null && fileLocationArr2[0] != null) {
                        FileLoader.getInstance(eoVar.getCurrentAccount()).getPathToAttach(fileLocationArr2[0], true).renameTo(FileLoader.getInstance(eoVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    eoVar.getMessagesController().getDialogPhotos(user.f17342id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    eoVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    MessagesController messagesController = eoVar.getMessagesController();
                    long j3 = this.f16716b;
                    TLRPC.UserFull userFull = messagesController.getUserFull(j3);
                    userFull.profile_photo = tL_photos_photo.photo;
                    eoVar.getMessagesStorage().updateUserInfo(userFull, false);
                    wc.a0(eoVar).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new me(j3, eoVar)), null).j();
                    return;
                }
                return;
        }
    }

    public f(TLObject tLObject, Activity activity, f6 f6Var, long j3, byte[] bArr, eo eoVar, MessageObject messageObject) {
        this.e = tLObject;
        this.f16717c = activity;
        this.d = f6Var;
        this.f16716b = j3;
        this.f16718f = bArr;
        this.h = eoVar;
        this.f16719n = messageObject;
    }

    public f(TLRPC.TL_error tL_error, eo eoVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f16718f = tL_error;
        this.f16717c = eoVar;
        this.e = tLObject;
        this.d = fileLocationArr;
        this.h = str;
        this.f16719n = fileLocationArr2;
        this.f16716b = j3;
    }

    public f(a70 a70Var, d2 d2Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.f16717c = a70Var;
        this.d = d2Var;
        this.e = context;
        this.f16716b = j3;
        this.f16718f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.f16719n = channelParticipant;
    }
}
