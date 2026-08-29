package jf;

import android.app.Activity;
import android.content.Context;
import eg.z0;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.tc;
import org.telegram.ui.p21;
import org.telegram.ui.tn;
import org.telegram.ui.y21;
public final class g0 implements Runnable {
    public final int f11613a = 1;
    public final long f11614b;
    public final Object f11615c;
    public final Object d;
    public final Object f11616e;
    public final Object f11617f;
    public final Object h;
    public final Object f11618n;

    public g0(long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.f11616e = conferenceCall;
        this.f11617f = getgroupcallchainblocks;
        this.f11614b = j10;
        this.f11615c = tLObject;
        this.d = tL_error;
        this.h = atomicBoolean;
        this.f11618n = atomicInteger;
    }

    @Override
    public final void run() {
        TLRPC.VideoSize closestVideoSizeWithSize;
        boolean z10;
        switch (this.f11613a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                tn tnVar = (tn) this.f11616e;
                TLObject tLObject = (TLObject) this.f11615c;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.f11617f;
                String str = (String) this.f11618n;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.h;
                if (tL_error == null) {
                    TLRPC.User user = tnVar.getMessagesController().getUser(Long.valueOf(tnVar.getUserConfig().getClientUserId()));
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f22416id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && fileLocationArr[0] != null) {
                        FileLoader.getInstance(tnVar.getCurrentAccount()).getPathToAttach(fileLocationArr[0], true).renameTo(FileLoader.getInstance(tnVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocationArr[0].volume_id);
                        sb2.append("_");
                        String l10 = a4.w.l(fileLocationArr[0].local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        ImageLoader.getInstance().replaceImageInCache(l10, a4.w.l(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(tnVar.getCurrentAccount(), user, 1), false);
                    } else {
                        z10 = true;
                    }
                    if (closestVideoSizeWithSize != null && str != null) {
                        new File(str).renameTo(FileLoader.getInstance(tnVar.getCurrentAccount()).getPathToAttach(closestVideoSizeWithSize, "mp4", z10));
                    } else if (closestPhotoSizeWithSize2 != null && fileLocationArr2[0] != null) {
                        FileLoader.getInstance(tnVar.getCurrentAccount()).getPathToAttach(fileLocationArr2[0], true).renameTo(FileLoader.getInstance(tnVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    tnVar.getMessagesController().getDialogPhotos(user.f22539id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    tnVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    MessagesController messagesController = tnVar.getMessagesController();
                    long j10 = this.f11614b;
                    TLRPC.UserFull userFull = messagesController.getUserFull(j10);
                    userFull.profile_photo = tL_photos_photo.photo;
                    tnVar.getMessagesStorage().updateUserInfo(userFull, false);
                    tc.a0(tnVar).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new z0(j10, tnVar)), null).j();
                    return;
                }
                return;
            case 1:
                ((ConferenceCall) this.f11616e).lambda$poll$7((TL_phone.getGroupCallChainBlocks) this.f11617f, this.f11614b, (TLObject) this.f11615c, (TLRPC.TL_error) this.d, (AtomicBoolean) this.h, (AtomicInteger) this.f11618n);
                return;
            case 2:
                n60.n((n60) this.d, (c2) this.f11616e, (Context) this.f11615c, this.f11614b, (TLRPC.TL_chatInviteExported) this.f11617f, (TLRPC.TL_chatInviteImporter) this.h, (TLRPC.ChannelParticipant) this.f11618n);
                return;
            default:
                Activity activity = (Activity) this.d;
                c6 c6Var = (c6) this.f11617f;
                byte[] bArr = (byte[]) this.h;
                MessageObject messageObject = (MessageObject) this.f11618n;
                y21 y21Var = new y21(activity, c6Var, this.f11614b, bArr);
                y21Var.O((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f11615c));
                y21Var.f44716s = new p21((tn) this.f11616e, activity, c6Var, messageObject);
                y21Var.show();
                return;
        }
    }

    public g0(TLObject tLObject, Activity activity, c6 c6Var, long j10, byte[] bArr, tn tnVar, MessageObject messageObject) {
        this.f11615c = tLObject;
        this.d = activity;
        this.f11617f = c6Var;
        this.f11614b = j10;
        this.h = bArr;
        this.f11616e = tnVar;
        this.f11618n = messageObject;
    }

    public g0(TLRPC.TL_error tL_error, tn tnVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.d = tL_error;
        this.f11616e = tnVar;
        this.f11615c = tLObject;
        this.f11617f = fileLocationArr;
        this.f11618n = str;
        this.h = fileLocationArr2;
        this.f11614b = j10;
    }

    public g0(n60 n60Var, c2 c2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.d = n60Var;
        this.f11616e = c2Var;
        this.f11615c = context;
        this.f11614b = j10;
        this.f11617f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.f11618n = channelParticipant;
    }
}
