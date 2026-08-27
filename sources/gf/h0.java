package gf;

import android.app.Activity;
import android.content.Context;
import cg.a1;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.mc;
import org.telegram.ui.o21;
import org.telegram.ui.rn;
import org.telegram.ui.x21;

public final class h0 implements Runnable {

    public final int f6999a = 1;

    public final long f7000b;

    public final Object f7001c;
    public final Object d;

    public final Object f7002e;

    public final Object f7003f;
    public final Object h;

    public final Object f7004n;

    public h0(long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.f7002e = conferenceCall;
        this.f7003f = getgroupcallchainblocks;
        this.f7000b = j10;
        this.f7001c = tLObject;
        this.d = tL_error;
        this.h = atomicBoolean;
        this.f7004n = atomicInteger;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f6999a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                rn rnVar = (rn) this.f7002e;
                TLObject tLObject = (TLObject) this.f7001c;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.f7003f;
                String str = (String) this.f7004n;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.h;
                if (tL_error == null) {
                    TLRPC.User user = rnVar.getMessagesController().getUser(Long.valueOf(rnVar.getUserConfig().getClientUserId()));
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 150);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
                    TLRPC.VideoSize closestVideoSizeWithSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : FileLoader.getClosestVideoSizeWithSize(tL_photos_photo.photo.video_sizes, 1000);
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f22404id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize == null || fileLocationArr[0] == null) {
                        z10 = true;
                    } else {
                        FileLoader.getInstance(rnVar.getCurrentAccount()).getPathToAttach(fileLocationArr[0], true).renameTo(FileLoader.getInstance(rnVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocationArr[0].volume_id);
                        sb2.append("_");
                        String strK = a9.p.k(fileLocationArr[0].local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        ImageLoader.getInstance().replaceImageInCache(strK, a9.p.k(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(rnVar.getCurrentAccount(), user, 1), false);
                    }
                    if (closestVideoSizeWithSize != null && str != null) {
                        new File(str).renameTo(FileLoader.getInstance(rnVar.getCurrentAccount()).getPathToAttach(closestVideoSizeWithSize, "mp4", z10));
                    } else if (closestPhotoSizeWithSize2 != null && fileLocationArr2[0] != null) {
                        FileLoader.getInstance(rnVar.getCurrentAccount()).getPathToAttach(fileLocationArr2[0], true).renameTo(FileLoader.getInstance(rnVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    rnVar.getMessagesController().getDialogPhotos(user.f22527id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    rnVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    MessagesController messagesController = rnVar.getMessagesController();
                    long j10 = this.f7000b;
                    TLRPC.UserFull userFull = messagesController.getUserFull(j10);
                    userFull.profile_photo = tL_photos_photo.photo;
                    rnVar.getMessagesStorage().updateUserInfo(userFull, false);
                    mc.a0(rnVar).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new a1(j10, rnVar)), null).j();
                }
                break;
            case 1:
                ((ConferenceCall) this.f7002e).lambda$poll$7((TL_phone.getGroupCallChainBlocks) this.f7003f, this.f7000b, (TLObject) this.f7001c, (TLRPC.TL_error) this.d, (AtomicBoolean) this.h, (AtomicInteger) this.f7004n);
                break;
            case 2:
                f60.n((f60) this.d, (b2) this.f7002e, (Context) this.f7001c, this.f7000b, (TLRPC.TL_chatInviteExported) this.f7003f, (TLRPC.TL_chatInviteImporter) this.h, (TLRPC.ChannelParticipant) this.f7004n);
                break;
            default:
                TLObject tLObject2 = (TLObject) this.f7001c;
                Activity activity = (Activity) this.d;
                c6 c6Var = (c6) this.f7003f;
                byte[] bArr = (byte[]) this.h;
                rn rnVar2 = (rn) this.f7002e;
                MessageObject messageObject = (MessageObject) this.f7004n;
                x21 x21Var = new x21(activity, c6Var, this.f7000b, bArr);
                x21Var.O((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject2);
                x21Var.f44268s = new o21(rnVar2, activity, c6Var, messageObject);
                x21Var.show();
                break;
        }
    }

    public h0(TLObject tLObject, Activity activity, c6 c6Var, long j10, byte[] bArr, rn rnVar, MessageObject messageObject) {
        this.f7001c = tLObject;
        this.d = activity;
        this.f7003f = c6Var;
        this.f7000b = j10;
        this.h = bArr;
        this.f7002e = rnVar;
        this.f7004n = messageObject;
    }

    public h0(TLRPC.TL_error tL_error, rn rnVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.d = tL_error;
        this.f7002e = rnVar;
        this.f7001c = tLObject;
        this.f7003f = fileLocationArr;
        this.f7004n = str;
        this.h = fileLocationArr2;
        this.f7000b = j10;
    }

    public h0(f60 f60Var, b2 b2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.d = f60Var;
        this.f7002e = b2Var;
        this.f7001c = context;
        this.f7000b = j10;
        this.f7003f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.f7004n = channelParticipant;
    }
}
