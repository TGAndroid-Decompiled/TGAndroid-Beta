package ff;

import android.app.Activity;
import android.content.Context;
import bg.e1;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.oc;
import org.telegram.ui.p21;
import org.telegram.ui.qn;
import org.telegram.ui.y21;
public final class h0 implements Runnable {
    public final int f6199a = 1;
    public final long f6200b;
    public final Object f6201c;
    public final Object d;
    public final Object f6202e;
    public final Object f6203f;
    public final Object h;
    public final Object f6204n;

    public h0(long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.f6202e = conferenceCall;
        this.f6203f = getgroupcallchainblocks;
        this.f6200b = j10;
        this.f6201c = tLObject;
        this.d = tL_error;
        this.h = atomicBoolean;
        this.f6204n = atomicInteger;
    }

    @Override
    public final void run() {
        TLRPC.VideoSize closestVideoSizeWithSize;
        boolean z10;
        switch (this.f6199a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                qn qnVar = (qn) this.f6202e;
                TLObject tLObject = (TLObject) this.f6201c;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.f6203f;
                String str = (String) this.f6204n;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.h;
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f22404id;
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
                        String l10 = aa.d.l(fileLocationArr[0].local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        ImageLoader.getInstance().replaceImageInCache(l10, aa.d.l(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(qnVar.getCurrentAccount(), user, 1), false);
                    } else {
                        z10 = true;
                    }
                    if (closestVideoSizeWithSize != null && str != null) {
                        new File(str).renameTo(FileLoader.getInstance(qnVar.getCurrentAccount()).getPathToAttach(closestVideoSizeWithSize, "mp4", z10));
                    } else if (closestPhotoSizeWithSize2 != null && fileLocationArr2[0] != null) {
                        FileLoader.getInstance(qnVar.getCurrentAccount()).getPathToAttach(fileLocationArr2[0], true).renameTo(FileLoader.getInstance(qnVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    qnVar.getMessagesController().getDialogPhotos(user.f22527id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    qnVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    MessagesController messagesController = qnVar.getMessagesController();
                    long j10 = this.f6200b;
                    TLRPC.UserFull userFull = messagesController.getUserFull(j10);
                    userFull.profile_photo = tL_photos_photo.photo;
                    qnVar.getMessagesStorage().updateUserInfo(userFull, false);
                    oc.a0(qnVar).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new e1(j10, qnVar)), null).j();
                    return;
                }
                return;
            case 1:
                ((ConferenceCall) this.f6202e).lambda$poll$7((TL_phone.getGroupCallChainBlocks) this.f6203f, this.f6200b, (TLObject) this.f6201c, (TLRPC.TL_error) this.d, (AtomicBoolean) this.h, (AtomicInteger) this.f6204n);
                return;
            case 2:
                a60.n((a60) this.d, (c2) this.f6202e, (Context) this.f6201c, this.f6200b, (TLRPC.TL_chatInviteExported) this.f6203f, (TLRPC.TL_chatInviteImporter) this.h, (TLRPC.ChannelParticipant) this.f6204n);
                return;
            default:
                Activity activity = (Activity) this.d;
                b6 b6Var = (b6) this.f6203f;
                byte[] bArr = (byte[]) this.h;
                MessageObject messageObject = (MessageObject) this.f6204n;
                y21 y21Var = new y21(activity, b6Var, this.f6200b, bArr);
                y21Var.N((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f6201c));
                y21Var.f44697s = new p21((qn) this.f6202e, activity, b6Var, messageObject);
                y21Var.show();
                return;
        }
    }

    public h0(TLObject tLObject, Activity activity, b6 b6Var, long j10, byte[] bArr, qn qnVar, MessageObject messageObject) {
        this.f6201c = tLObject;
        this.d = activity;
        this.f6203f = b6Var;
        this.f6200b = j10;
        this.h = bArr;
        this.f6202e = qnVar;
        this.f6204n = messageObject;
    }

    public h0(TLRPC.TL_error tL_error, qn qnVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.d = tL_error;
        this.f6202e = qnVar;
        this.f6201c = tLObject;
        this.f6203f = fileLocationArr;
        this.f6204n = str;
        this.h = fileLocationArr2;
        this.f6200b = j10;
    }

    public h0(a60 a60Var, c2 c2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.d = a60Var;
        this.f6202e = c2Var;
        this.f6201c = context;
        this.f6200b = j10;
        this.f6203f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.f6204n = channelParticipant;
    }
}
