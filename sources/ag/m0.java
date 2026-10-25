package ag;

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
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.wc;
import org.telegram.ui.n21;
import org.telegram.ui.un;
import org.telegram.ui.v21;
public final class m0 implements Runnable {
    public final int f1339a = 1;
    public final long f1340b;
    public final Object f1341c;
    public final Object d;
    public final Object e;
    public final Object f1342f;
    public final Object h;
    public final Object f1343n;

    public m0(long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.e = conferenceCall;
        this.f1342f = getgroupcallchainblocks;
        this.f1340b = j10;
        this.f1341c = tLObject;
        this.d = tL_error;
        this.h = atomicBoolean;
        this.f1343n = atomicInteger;
    }

    @Override
    public final void run() {
        TLRPC.VideoSize closestVideoSizeWithSize;
        boolean z10;
        switch (this.f1339a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                un unVar = (un) this.e;
                TLObject tLObject = (TLObject) this.f1341c;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.f1342f;
                String str = (String) this.f1343n;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.h;
                if (tL_error == null) {
                    TLRPC.User user = unVar.getMessagesController().getUser(Long.valueOf(unVar.getUserConfig().getClientUserId()));
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f22051id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && fileLocationArr[0] != null) {
                        FileLoader.getInstance(unVar.getCurrentAccount()).getPathToAttach(fileLocationArr[0], true).renameTo(FileLoader.getInstance(unVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocationArr[0].volume_id);
                        sb2.append("_");
                        String n10 = a1.g.n(fileLocationArr[0].local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(unVar.getCurrentAccount(), user, 1), false);
                    } else {
                        z10 = true;
                    }
                    if (closestVideoSizeWithSize != null && str != null) {
                        new File(str).renameTo(FileLoader.getInstance(unVar.getCurrentAccount()).getPathToAttach(closestVideoSizeWithSize, "mp4", z10));
                    } else if (closestPhotoSizeWithSize2 != null && fileLocationArr2[0] != null) {
                        FileLoader.getInstance(unVar.getCurrentAccount()).getPathToAttach(fileLocationArr2[0], true).renameTo(FileLoader.getInstance(unVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    unVar.getMessagesController().getDialogPhotos(user.f22174id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    unVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    MessagesController messagesController = unVar.getMessagesController();
                    long j10 = this.f1340b;
                    TLRPC.UserFull userFull = messagesController.getUserFull(j10);
                    userFull.profile_photo = tL_photos_photo.photo;
                    unVar.getMessagesStorage().updateUserInfo(userFull, false);
                    wc.b0(unVar).W(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new o0(j10, unVar)), null).j();
                    return;
                }
                return;
            case 1:
                ((ConferenceCall) this.e).lambda$poll$7((TL_phone.getGroupCallChainBlocks) this.f1342f, this.f1340b, (TLObject) this.f1341c, (TLRPC.TL_error) this.d, (AtomicBoolean) this.h, (AtomicInteger) this.f1343n);
                return;
            case 2:
                n70.n((n70) this.d, (e2) this.e, (Context) this.f1341c, this.f1340b, (TLRPC.TL_chatInviteExported) this.f1342f, (TLRPC.TL_chatInviteImporter) this.h, (TLRPC.ChannelParticipant) this.f1343n);
                return;
            default:
                Activity activity = (Activity) this.d;
                u6 u6Var = (u6) this.f1342f;
                byte[] bArr = (byte[]) this.h;
                MessageObject messageObject = (MessageObject) this.f1343n;
                v21 v21Var = new v21(activity, u6Var, this.f1340b, bArr);
                v21Var.R((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f1341c));
                v21Var.v = new n21((un) this.e, activity, u6Var, messageObject);
                v21Var.show();
                return;
        }
    }

    public m0(TLObject tLObject, Activity activity, u6 u6Var, long j10, byte[] bArr, un unVar, MessageObject messageObject) {
        this.f1341c = tLObject;
        this.d = activity;
        this.f1342f = u6Var;
        this.f1340b = j10;
        this.h = bArr;
        this.e = unVar;
        this.f1343n = messageObject;
    }

    public m0(TLRPC.TL_error tL_error, un unVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.d = tL_error;
        this.e = unVar;
        this.f1341c = tLObject;
        this.f1342f = fileLocationArr;
        this.f1343n = str;
        this.h = fileLocationArr2;
        this.f1340b = j10;
    }

    public m0(n70 n70Var, e2 e2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.d = n70Var;
        this.e = e2Var;
        this.f1341c = context;
        this.f1340b = j10;
        this.f1342f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.f1343n = channelParticipant;
    }
}
