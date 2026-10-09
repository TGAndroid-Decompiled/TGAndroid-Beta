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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.t70;
import org.telegram.ui.c41;
import org.telegram.ui.le;
import org.telegram.ui.u31;
import org.telegram.ui.zn;
public final class e implements Runnable {
    public final int f19540a = 0;
    public final long f19541b;
    public final Object f19542c;
    public final Object d;
    public final Object f19543e;
    public final Object f19544f;
    public final Object h;
    public final Object f19545n;

    public e(long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.f19542c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f19541b = j3;
        this.f19543e = tLObject;
        this.f19544f = tL_error;
        this.h = atomicBoolean;
        this.f19545n = atomicInteger;
    }

    @Override
    public final void run() {
        TLRPC.VideoSize closestVideoSizeWithSize;
        boolean z10;
        switch (this.f19540a) {
            case 0:
                ((ConferenceCall) this.f19542c).lambda$poll$7((TL_phone.getGroupCallChainBlocks) this.d, this.f19541b, (TLObject) this.f19543e, (TLRPC.TL_error) this.f19544f, (AtomicBoolean) this.h, (AtomicInteger) this.f19545n);
                return;
            case 1:
                t70.p((t70) this.f19542c, (b2) this.d, (Context) this.f19543e, this.f19541b, (TLRPC.TL_chatInviteExported) this.f19544f, (TLRPC.TL_chatInviteImporter) this.h, (TLRPC.ChannelParticipant) this.f19545n);
                return;
            case 2:
                Activity activity = (Activity) this.f19542c;
                e6 e6Var = (e6) this.d;
                byte[] bArr = (byte[]) this.f19544f;
                MessageObject messageObject = (MessageObject) this.f19545n;
                c41 c41Var = new c41(activity, e6Var, this.f19541b, bArr);
                c41Var.P((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f19543e));
                c41Var.f36516s = new u31((zn) this.h, activity, e6Var, messageObject);
                c41Var.show();
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f19544f;
                zn znVar = (zn) this.f19542c;
                TLObject tLObject = (TLObject) this.f19543e;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.d;
                String str = (String) this.h;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.f19545n;
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f20062id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && fileLocationArr[0] != null) {
                        FileLoader.getInstance(znVar.getCurrentAccount()).getPathToAttach(fileLocationArr[0], true).renameTo(FileLoader.getInstance(znVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocationArr[0].volume_id);
                        sb2.append("_");
                        String o9 = a1.g.o(fileLocationArr[0].local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        ImageLoader.getInstance().replaceImageInCache(o9, a1.g.o(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(znVar.getCurrentAccount(), user, 1), false);
                    } else {
                        z10 = true;
                    }
                    if (closestVideoSizeWithSize != null && str != null) {
                        new File(str).renameTo(FileLoader.getInstance(znVar.getCurrentAccount()).getPathToAttach(closestVideoSizeWithSize, "mp4", z10));
                    } else if (closestPhotoSizeWithSize2 != null && fileLocationArr2[0] != null) {
                        FileLoader.getInstance(znVar.getCurrentAccount()).getPathToAttach(fileLocationArr2[0], true).renameTo(FileLoader.getInstance(znVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    znVar.getMessagesController().getDialogPhotos(user.f20185id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    znVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    MessagesController messagesController = znVar.getMessagesController();
                    long j3 = this.f19541b;
                    TLRPC.UserFull userFull = messagesController.getUserFull(j3);
                    userFull.profile_photo = tL_photos_photo.photo;
                    znVar.getMessagesStorage().updateUserInfo(userFull, false);
                    ad.a0(znVar).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new le(j3, znVar)), null).j();
                    return;
                }
                return;
        }
    }

    public e(TLObject tLObject, Activity activity, e6 e6Var, long j3, byte[] bArr, zn znVar, MessageObject messageObject) {
        this.f19543e = tLObject;
        this.f19542c = activity;
        this.d = e6Var;
        this.f19541b = j3;
        this.f19544f = bArr;
        this.h = znVar;
        this.f19545n = messageObject;
    }

    public e(TLRPC.TL_error tL_error, zn znVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f19544f = tL_error;
        this.f19542c = znVar;
        this.f19543e = tLObject;
        this.d = fileLocationArr;
        this.h = str;
        this.f19545n = fileLocationArr2;
        this.f19541b = j3;
    }

    public e(t70 t70Var, b2 b2Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.f19542c = t70Var;
        this.d = b2Var;
        this.f19543e = context;
        this.f19541b = j3;
        this.f19544f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.f19545n = channelParticipant;
    }
}
