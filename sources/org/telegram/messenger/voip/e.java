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
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ke;
import org.telegram.ui.m31;
import org.telegram.ui.u31;
import org.telegram.ui.xn;
public final class e implements Runnable {
    public final int f17620a = 0;
    public final long f17621b;
    public final Object f17622c;
    public final Object d;
    public final Object e;
    public final Object f17623f;
    public final Object h;
    public final Object f17624n;

    public e(long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.f17622c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f17621b = j3;
        this.e = tLObject;
        this.f17623f = tL_error;
        this.h = atomicBoolean;
        this.f17624n = atomicInteger;
    }

    @Override
    public final void run() {
        TLRPC.VideoSize closestVideoSizeWithSize;
        boolean z10;
        switch (this.f17620a) {
            case 0:
                ((ConferenceCall) this.f17622c).lambda$poll$7((TL_phone.getGroupCallChainBlocks) this.d, this.f17621b, (TLObject) this.e, (TLRPC.TL_error) this.f17623f, (AtomicBoolean) this.h, (AtomicInteger) this.f17624n);
                return;
            case 1:
                s60.n((s60) this.f17622c, (b2) this.d, (Context) this.e, this.f17621b, (TLRPC.TL_chatInviteExported) this.f17623f, (TLRPC.TL_chatInviteImporter) this.h, (TLRPC.ChannelParticipant) this.f17624n);
                return;
            case 2:
                Activity activity = (Activity) this.f17622c;
                d6 d6Var = (d6) this.d;
                byte[] bArr = (byte[]) this.f17623f;
                MessageObject messageObject = (MessageObject) this.f17624n;
                u31 u31Var = new u31(activity, d6Var, this.f17621b, bArr);
                u31Var.O((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.e));
                u31Var.f37897s = new m31((xn) this.h, activity, d6Var, messageObject);
                u31Var.show();
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f17623f;
                xn xnVar = (xn) this.f17622c;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.d;
                String str = (String) this.h;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.f17624n;
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f18107id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && fileLocationArr[0] != null) {
                        FileLoader.getInstance(xnVar.getCurrentAccount()).getPathToAttach(fileLocationArr[0], true).renameTo(FileLoader.getInstance(xnVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocationArr[0].volume_id);
                        sb2.append("_");
                        String o9 = a4.a.o(fileLocationArr[0].local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        ImageLoader.getInstance().replaceImageInCache(o9, a4.a.o(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(xnVar.getCurrentAccount(), user, 1), false);
                    } else {
                        z10 = true;
                    }
                    if (closestVideoSizeWithSize != null && str != null) {
                        new File(str).renameTo(FileLoader.getInstance(xnVar.getCurrentAccount()).getPathToAttach(closestVideoSizeWithSize, "mp4", z10));
                    } else if (closestPhotoSizeWithSize2 != null && fileLocationArr2[0] != null) {
                        FileLoader.getInstance(xnVar.getCurrentAccount()).getPathToAttach(fileLocationArr2[0], true).renameTo(FileLoader.getInstance(xnVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    xnVar.getMessagesController().getDialogPhotos(user.f18230id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    xnVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    MessagesController messagesController = xnVar.getMessagesController();
                    long j3 = this.f17621b;
                    TLRPC.UserFull userFull = messagesController.getUserFull(j3);
                    userFull.profile_photo = tL_photos_photo.photo;
                    xnVar.getMessagesStorage().updateUserInfo(userFull, false);
                    xc.a0(xnVar).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new ke(j3, xnVar)), null).j();
                    return;
                }
                return;
        }
    }

    public e(TLObject tLObject, Activity activity, d6 d6Var, long j3, byte[] bArr, xn xnVar, MessageObject messageObject) {
        this.e = tLObject;
        this.f17622c = activity;
        this.d = d6Var;
        this.f17621b = j3;
        this.f17623f = bArr;
        this.h = xnVar;
        this.f17624n = messageObject;
    }

    public e(TLRPC.TL_error tL_error, xn xnVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f17623f = tL_error;
        this.f17622c = xnVar;
        this.e = tLObject;
        this.d = fileLocationArr;
        this.h = str;
        this.f17624n = fileLocationArr2;
        this.f17621b = j3;
    }

    public e(s60 s60Var, b2 b2Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.f17622c = s60Var;
        this.d = b2Var;
        this.e = context;
        this.f17621b = j3;
        this.f17623f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.f17624n = channelParticipant;
    }
}
