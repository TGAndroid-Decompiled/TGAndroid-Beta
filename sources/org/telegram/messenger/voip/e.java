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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.zc;
import org.telegram.ui.a41;
import org.telegram.ui.fo;
import org.telegram.ui.i41;
import org.telegram.ui.re;
public final class e implements Runnable {
    public final int f18482a = 0;
    public final long f18483b;
    public final Object f18484c;
    public final Object d;
    public final Object e;
    public final Object f18485f;
    public final Object h;
    public final Object f18486n;

    public e(long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.f18484c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f18483b = j10;
        this.e = tLObject;
        this.f18485f = tL_error;
        this.h = atomicBoolean;
        this.f18486n = atomicInteger;
    }

    @Override
    public final void run() {
        TLRPC.VideoSize closestVideoSizeWithSize;
        boolean z10;
        switch (this.f18482a) {
            case 0:
                ((ConferenceCall) this.f18484c).lambda$poll$7((TL_phone.getGroupCallChainBlocks) this.d, this.f18483b, (TLObject) this.e, (TLRPC.TL_error) this.f18485f, (AtomicBoolean) this.h, (AtomicInteger) this.f18486n);
                return;
            case 1:
                p70.o((p70) this.f18484c, (a2) this.d, (Context) this.e, this.f18483b, (TLRPC.TL_chatInviteExported) this.f18485f, (TLRPC.TL_chatInviteImporter) this.h, (TLRPC.ChannelParticipant) this.f18486n);
                return;
            case 2:
                Activity activity = (Activity) this.f18484c;
                c6 c6Var = (c6) this.d;
                byte[] bArr = (byte[]) this.f18485f;
                MessageObject messageObject = (MessageObject) this.f18486n;
                i41 i41Var = new i41(activity, c6Var, this.f18483b, bArr);
                i41Var.P((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.e));
                i41Var.f36723s = new a41((fo) this.h, activity, c6Var, messageObject);
                i41Var.show();
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f18485f;
                fo foVar = (fo) this.f18484c;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.d;
                String str = (String) this.h;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.f18486n;
                if (tL_error == null) {
                    TLRPC.User user = foVar.getMessagesController().getUser(Long.valueOf(foVar.getUserConfig().getClientUserId()));
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f18940id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && fileLocationArr[0] != null) {
                        FileLoader.getInstance(foVar.getCurrentAccount()).getPathToAttach(fileLocationArr[0], true).renameTo(FileLoader.getInstance(foVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocationArr[0].volume_id);
                        sb2.append("_");
                        String n10 = a1.g.n(fileLocationArr[0].local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(foVar.getCurrentAccount(), user, 1), false);
                    } else {
                        z10 = true;
                    }
                    if (closestVideoSizeWithSize != null && str != null) {
                        new File(str).renameTo(FileLoader.getInstance(foVar.getCurrentAccount()).getPathToAttach(closestVideoSizeWithSize, "mp4", z10));
                    } else if (closestPhotoSizeWithSize2 != null && fileLocationArr2[0] != null) {
                        FileLoader.getInstance(foVar.getCurrentAccount()).getPathToAttach(fileLocationArr2[0], true).renameTo(FileLoader.getInstance(foVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    foVar.getMessagesController().getDialogPhotos(user.f19063id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    foVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    MessagesController messagesController = foVar.getMessagesController();
                    long j10 = this.f18483b;
                    TLRPC.UserFull userFull = messagesController.getUserFull(j10);
                    userFull.profile_photo = tL_photos_photo.photo;
                    foVar.getMessagesStorage().updateUserInfo(userFull, false);
                    zc.a0(foVar).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new re(j10, foVar)), null).j();
                    return;
                }
                return;
        }
    }

    public e(TLObject tLObject, Activity activity, c6 c6Var, long j10, byte[] bArr, fo foVar, MessageObject messageObject) {
        this.e = tLObject;
        this.f18484c = activity;
        this.d = c6Var;
        this.f18483b = j10;
        this.f18485f = bArr;
        this.h = foVar;
        this.f18486n = messageObject;
    }

    public e(TLRPC.TL_error tL_error, fo foVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.f18485f = tL_error;
        this.f18484c = foVar;
        this.e = tLObject;
        this.d = fileLocationArr;
        this.h = str;
        this.f18486n = fileLocationArr2;
        this.f18483b = j10;
    }

    public e(p70 p70Var, a2 a2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.f18484c = p70Var;
        this.d = a2Var;
        this.e = context;
        this.f18483b = j10;
        this.f18485f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.f18486n = channelParticipant;
    }
}
