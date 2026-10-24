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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.vc;
import org.telegram.ui.j21;
import org.telegram.ui.je;
import org.telegram.ui.r21;
import org.telegram.ui.sn;
public final class e implements Runnable {
    public final int f19925a = 0;
    public final long f19926b;
    public final Object f19927c;
    public final Object d;
    public final Object e;
    public final Object f19928f;
    public final Object h;
    public final Object f19929n;

    public e(long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.f19927c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f19926b = j10;
        this.e = tLObject;
        this.f19928f = tL_error;
        this.h = atomicBoolean;
        this.f19929n = atomicInteger;
    }

    @Override
    public final void run() {
        TLRPC.VideoSize closestVideoSizeWithSize;
        boolean z10;
        switch (this.f19925a) {
            case 0:
                ((ConferenceCall) this.f19927c).lambda$poll$7((TL_phone.getGroupCallChainBlocks) this.d, this.f19926b, (TLObject) this.e, (TLRPC.TL_error) this.f19928f, (AtomicBoolean) this.h, (AtomicInteger) this.f19929n);
                return;
            case 1:
                k70.n((k70) this.f19927c, (c2) this.d, (Context) this.e, this.f19926b, (TLRPC.TL_chatInviteExported) this.f19928f, (TLRPC.TL_chatInviteImporter) this.h, (TLRPC.ChannelParticipant) this.f19929n);
                return;
            case 2:
                Activity activity = (Activity) this.f19927c;
                g6 g6Var = (g6) this.d;
                byte[] bArr = (byte[]) this.f19928f;
                MessageObject messageObject = (MessageObject) this.f19929n;
                r21 r21Var = new r21(activity, g6Var, this.f19926b, bArr);
                r21Var.R((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.e));
                r21Var.v = new j21((sn) this.h, activity, g6Var, messageObject);
                r21Var.show();
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f19928f;
                sn snVar = (sn) this.f19927c;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.d;
                String str = (String) this.h;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.f19929n;
                if (tL_error == null) {
                    TLRPC.User user = snVar.getMessagesController().getUser(Long.valueOf(snVar.getUserConfig().getClientUserId()));
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f20368id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && fileLocationArr[0] != null) {
                        FileLoader.getInstance(snVar.getCurrentAccount()).getPathToAttach(fileLocationArr[0], true).renameTo(FileLoader.getInstance(snVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocationArr[0].volume_id);
                        sb2.append("_");
                        String n10 = a1.g.n(fileLocationArr[0].local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(snVar.getCurrentAccount(), user, 1), false);
                    } else {
                        z10 = true;
                    }
                    if (closestVideoSizeWithSize != null && str != null) {
                        new File(str).renameTo(FileLoader.getInstance(snVar.getCurrentAccount()).getPathToAttach(closestVideoSizeWithSize, "mp4", z10));
                    } else if (closestPhotoSizeWithSize2 != null && fileLocationArr2[0] != null) {
                        FileLoader.getInstance(snVar.getCurrentAccount()).getPathToAttach(fileLocationArr2[0], true).renameTo(FileLoader.getInstance(snVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    snVar.getMessagesController().getDialogPhotos(user.f20491id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    snVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    MessagesController messagesController = snVar.getMessagesController();
                    long j10 = this.f19926b;
                    TLRPC.UserFull userFull = messagesController.getUserFull(j10);
                    userFull.profile_photo = tL_photos_photo.photo;
                    snVar.getMessagesStorage().updateUserInfo(userFull, false);
                    vc.a0(snVar).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new je(j10, snVar)), null).j();
                    return;
                }
                return;
        }
    }

    public e(TLObject tLObject, Activity activity, g6 g6Var, long j10, byte[] bArr, sn snVar, MessageObject messageObject) {
        this.e = tLObject;
        this.f19927c = activity;
        this.d = g6Var;
        this.f19926b = j10;
        this.f19928f = bArr;
        this.h = snVar;
        this.f19929n = messageObject;
    }

    public e(TLRPC.TL_error tL_error, sn snVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.f19928f = tL_error;
        this.f19927c = snVar;
        this.e = tLObject;
        this.d = fileLocationArr;
        this.h = str;
        this.f19929n = fileLocationArr2;
        this.f19926b = j10;
    }

    public e(k70 k70Var, c2 c2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.f19927c = k70Var;
        this.d = c2Var;
        this.e = context;
        this.f19926b = j10;
        this.f19928f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.f19929n = channelParticipant;
    }
}
