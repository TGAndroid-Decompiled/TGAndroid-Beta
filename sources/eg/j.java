package eg;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import jh.j7;
import nh.gb;
import nh.o7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.st;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bo0;
import org.telegram.ui.cg1;
import org.telegram.ui.de;
import org.telegram.ui.fy;
import org.telegram.ui.ht;
import org.telegram.ui.sx;
import org.telegram.ui.tn;
import org.telegram.ui.zf;
import th.b4;
import th.m3;
public final class j implements Runnable {
    public final int f6039a;
    public final boolean f6040b;
    public final Object f6041c;
    public final Object d;
    public final Object f6042e;
    public final Object f6043f;

    public j(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f6039a = i10;
        this.d = obj;
        this.f6041c = obj2;
        this.f6042e = obj3;
        this.f6043f = obj4;
        this.f6040b = z10;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        Object obj;
        float f9;
        float f10;
        float f11;
        int i12;
        byte b10;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        double d;
        boolean z10;
        int i13;
        int i14;
        TLRPC.VideoSize closestVideoSizeWithSize;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = this.f6039a;
        boolean z11 = true;
        int i22 = 0;
        boolean z12 = this.f6040b;
        Object obj2 = this.f6042e;
        Object obj3 = this.f6041c;
        Object obj4 = this.d;
        Object obj5 = this.f6043f;
        switch (i21) {
            case 0:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj4;
                String str = (String) obj3;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj5;
                boolean z13 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                boolean z14 = this.f6040b;
                if (z13) {
                    s.d(z14, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, o2Var.getParentActivity(), o2Var.getResourceProvider());
                    return;
                } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                    s.e(z14, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, o2Var.getParentActivity(), o2Var.getResourceProvider());
                    return;
                } else {
                    return;
                }
            case 1:
                nh.r1 r1Var = (nh.r1) obj4;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = (TLRPC.TL_messages_getInlineBotResults) obj5;
                String str2 = (String) obj3;
                nh.t1 t1Var = r1Var.f18505s;
                ArrayList arrayList = t1Var.f18583n;
                if (r1Var.f18504r) {
                    if (!(tLObject instanceof TLRPC.messages_BotResults)) {
                        i10 = ((f3) t1Var.f18584r).currentAccount;
                        r1Var.d = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, new j7(r1Var, str2, z12, 1));
                        return;
                    }
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    r1Var.h = messages_botresults.next_offset;
                    if (z12) {
                        arrayList.clear();
                    }
                    arrayList.size();
                    arrayList.addAll(messages_botresults.results);
                    r1Var.l();
                    t1Var.d.c(false);
                    r1Var.f18504r = false;
                    return;
                }
                return;
            case 2:
                gb gbVar = (gb) obj4;
                Bitmap bitmap = (Bitmap) obj3;
                File file = (File) obj2;
                o7 o7Var = (o7) obj5;
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (z12) {
                        i11 = 95;
                    } else {
                        i11 = 99;
                    }
                    bitmap.compress(compressFormat, i11, new FileOutputStream(file));
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                AndroidUtilities.runOnUIThread(new l3.m(gbVar, o7Var, file, 17));
                return;
            case 3:
                ((FactCheckController) obj4).lambda$applyFactCheck$15((TLObject) obj3, (TLRPC.TL_textWithEntities) obj2, z12, (org.telegram.ui.ActionBar.c2) obj5);
                return;
            case 4:
                ((MediaDataController) obj4).lambda$loadStickersByEmojiOrName$84((TLRPC.TL_error) obj2, (TLObject) obj5, (String) obj3, z12);
                return;
            case 5:
                ((MessagesController) obj4).lambda$setParticipantBannedRole$91((TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.o2) obj5, (TLRPC.TL_channels_editBanned) obj2, z12);
                return;
            case 6:
                ((MessagesStorage) obj4).lambda$putChannelViews$191((a0.h) obj3, (a0.h) obj2, (a0.h) obj5, z12);
                return;
            case 7:
                ((MessagesStorage) obj4).lambda$replaceMessageIfExists$234((TLRPC.Message) obj3, z12, (ArrayList) obj2, (ArrayList) obj5);
                return;
            case 8:
                ((SendMessagesHelper) obj4).lambda$sendEditRichMessageRequest$23((TLRPC.TL_messages_editMessage) obj3, (MessageObject) obj2, (org.telegram.ui.ActionBar.o2) obj5, z12);
                return;
            case 9:
                ((SendMessagesHelper) obj4).lambda$performSendMessageRequest$80((TLRPC.Message) obj3, z12, (TLObject) obj2, (SendMessagesHelper.DelayedMessage) obj5);
                return;
            case 10:
                ((UnconfirmedAuthController) obj4).lambda$updateList$7((boolean[]) obj3, (ArrayList) obj2, z12, (Utilities.Callback) obj5);
                return;
            case 11:
                ((CameraController) obj4).lambda$recordVideo$12((CameraController.ICameraView) obj3, (File) obj2, z12, (Runnable) obj5);
                return;
            case 12:
                de deVar = (de) obj4;
                TLObject tLObject2 = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj5;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.E = password;
                    TwoStepVerificationActivity.m0(password);
                    deVar.b0(z12, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 13:
                tn tnVar = (tn) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                zf zfVar = (zf) obj5;
                ((ye.c) obj3).b();
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    tnVar.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    tnVar.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    int i23 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
                    if (i23 >= 0) {
                        obj = tnVar.getMessagesController().getUser(Long.valueOf(peerDialogId));
                    } else if (i23 < 0) {
                        obj = tnVar.getMessagesController().getChat(Long.valueOf(-peerDialogId));
                    }
                    zfVar.run(obj, Boolean.valueOf(z12));
                    return;
                }
                obj = null;
                zfVar.run(obj, Boolean.valueOf(z12));
                return;
            case 14:
                la laVar = (la) obj4;
                Bitmap bitmap2 = (Bitmap) obj2;
                Bitmap bitmap3 = (Bitmap) obj5;
                if (TextUtils.equals(laVar.f30265a, (String) obj3)) {
                    laVar.f30269f = null;
                    Bitmap bitmap4 = laVar.f30266b;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                    }
                    laVar.f30266b = bitmap2;
                    Runnable runnable = laVar.f30268e;
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    bitmap2.recycle();
                }
                if (z12) {
                    bitmap3.recycle();
                    return;
                }
                return;
            case 15:
                jh.m mVar = (jh.m) obj2;
                String str3 = (String) obj3;
                TextView textView = (TextView) obj5;
                ClipboardManager clipboardManager = (ClipboardManager) ((st) obj4).getContext().getSystemService("clipboard");
                z11 = (z12 && (TextUtils.isEmpty(mVar.getText()) || TextUtils.equals(mVar.getText().toString(), str3)) && clipboardManager != null && clipboardManager.hasPrimaryClip()) ? false : false;
                ViewPropertyAnimator animate = textView.animate();
                if (z11) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f9);
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.7f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f10);
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.7f;
                }
                org.telegram.ui.b.q(scaleX.scaleY(f11), jr.h, 300L);
                return;
            case 16:
                my myVar = (my) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                TLObject tLObject4 = (TLObject) obj5;
                myVar.f30779a.remove(str5);
                fz fzVar = myVar.f30780b;
                jy jyVar = fzVar.f28593f0;
                HashMap hashMap = fzVar.f28599h0;
                boolean z15 = jyVar.v;
                boolean z16 = this.f6040b;
                if (z15 && jyVar.f29851w.equals(str4)) {
                    fzVar.f28593f0.E(str4, "", false, true, z16, str5, tLObject4);
                    return;
                } else if (z16 && (!(tLObject4 instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject4).results.isEmpty())) {
                    myVar.a(str4, false);
                    return;
                } else if ((tLObject4 instanceof TLRPC.messages_BotResults) && !hashMap.containsKey(str5)) {
                    hashMap.put(str5, (TLRPC.messages_BotResults) tLObject4);
                    return;
                } else {
                    return;
                }
            case 17:
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj5;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj4;
                TLRPC.Document document2 = (TLRPC.Document) obj3;
                tn tnVar2 = (tn) obj2;
                File w10 = o7.w(o2Var2.getCurrentAccount(), "webp");
                int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                if (devicePerformanceClass != 0) {
                    if (devicePerformanceClass != 2) {
                        i12 = 2560;
                    } else {
                        i12 = 3840;
                    }
                } else {
                    i12 = 1280;
                }
                float f12 = 512;
                float f13 = i12;
                double d10 = (f13 * f12) / f12;
                if (((float) Math.floor(d10)) > f13) {
                    f13 = (float) Math.floor(d10);
                }
                float f14 = f13;
                Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                try {
                    createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                createBitmap.recycle();
                ArrayList arrayList2 = new ArrayList();
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                arrayList2.add(photoEntry);
                VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                mediaEntity.type = (byte) 0;
                mediaEntity.parentObject = tL_messages_stickerSet2;
                mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document2, true).getAbsolutePath();
                mediaEntity.f19644x = 0.5f - ((Math.min(512, 512) / f12) / 2.0f);
                mediaEntity.f19645y = 0.5f - ((Math.min(512, 512) / f12) / 2.0f);
                mediaEntity.width = Math.min(512, 512) / f12;
                mediaEntity.height = Math.min(512, 512) / f12;
                int floor = (int) Math.floor(f14 * 0.5d);
                mediaEntity.viewWidth = floor;
                mediaEntity.viewHeight = floor;
                mediaEntity.scale = 2.0f;
                mediaEntity.document = document2;
                if (MessageObject.isAnimatedStickerDocument(document2, true) || MessageObject.isVideoStickerDocument(document2)) {
                    boolean isAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(document2, true);
                    byte b11 = mediaEntity.subType;
                    if (isAnimatedStickerDocument) {
                        b10 = 1;
                    } else {
                        b10 = 4;
                    }
                    mediaEntity.subType = (byte) (b10 | b11);
                }
                ArrayList<VideoEditedInfo.MediaEntity> arrayList3 = new ArrayList<>();
                photoEntry.mediaEntities = arrayList3;
                arrayList3.add(mediaEntity);
                photoEntry.averageDuration = 3000L;
                if (MessageObject.isAnimatedStickerDocument(document2, true)) {
                    File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document2, true);
                    if (pathToAttach != null) {
                        try {
                            RLottieNative a2 = RLottieNative.a(pathToAttach.getAbsolutePath(), null, 0, 0, null, false, null, false, 0, null);
                            if (a2 != null) {
                                int[] iArr = a2.f26476a;
                                int i24 = iArr[0];
                                int i25 = iArr[1];
                                a2.d();
                                d = i24 / i25;
                            } else {
                                d = 0.0d;
                            }
                            photoEntry.averageDuration = (long) (d * 1000.0d);
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                    }
                } else if (MessageObject.isVideoStickerDocument(document2)) {
                    photoEntry.averageDuration = (long) (MessageObject.getDocumentDuration(document2) * 1000.0d);
                }
                PhotoViewer.t1().K2(o2Var2.getParentActivity(), null, o2Var2.getResourceProvider());
                PhotoViewer.t1().f2(arrayList2, 0, 11, false, new Object(), tnVar2);
                PhotoViewer t12 = PhotoViewer.t1();
                if (z12) {
                    document = document2;
                } else {
                    document = null;
                }
                t12.X0(document2, document, true, null);
                ht q6 = ht.q();
                if (z12) {
                    tL_messages_stickerSet = tL_messages_stickerSet2;
                } else {
                    tL_messages_stickerSet = null;
                }
                q6.T = tL_messages_stickerSet;
                return;
            case 18:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject5 = (TLObject) obj5;
                String str6 = (String) obj3;
                fy fyVar = ((sx) obj4).f42477a;
                if (tL_error == null) {
                    TLRPC.User user = fyVar.getMessagesController().getUser(Long.valueOf(fyVar.getUserConfig().getClientUserId()));
                    if (user == null) {
                        user = fyVar.getUserConfig().getCurrentUser();
                        if (user != null) {
                            fyVar.getMessagesController().putUser(user, false);
                        } else {
                            return;
                        }
                    } else {
                        fyVar.getUserConfig().setCurrentUser(user);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    ArrayList<TLRPC.PhotoSize> arrayList4 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList4, 150);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList4, 800);
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
                    if (closestPhotoSizeWithSize != null && fyVar.Y3 != null) {
                        i18 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i18).getPathToAttach(closestPhotoSizeWithSize, true);
                        i19 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                        FileLoader.getInstance(i19).getPathToAttach(fyVar.Y3, true).renameTo(pathToAttach2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fyVar.Y3.volume_id);
                        sb2.append("_");
                        String l10 = a4.w.l(fyVar.Y3.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        z10 = z12;
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String l11 = a4.w.l(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i20 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                        imageLoader.replaceImageInCache(l10, l11, ImageLocation.getForUserOrChat(i20, user, 1), false);
                    } else {
                        z10 = z12;
                    }
                    if (closestVideoSizeWithSize != null && str6 != null) {
                        i17 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                        new File(str6).renameTo(FileLoader.getInstance(i17).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
                    } else if (closestPhotoSizeWithSize2 != null && fyVar.Z3 != null) {
                        i15 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                        File pathToAttach3 = FileLoader.getInstance(i15).getPathToAttach(closestPhotoSizeWithSize2, true);
                        i16 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                        FileLoader.getInstance(i16).getPathToAttach(fyVar.Z3, true).renameTo(pathToAttach3);
                    }
                    fyVar.getMessagesController().getDialogPhotos(user.f22539id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(user);
                    i22 = 0;
                    fyVar.getMessagesStorage().putUsersAndChats(arrayList5, null, false, true);
                    TLRPC.UserFull userFull = fyVar.getMessagesController().getUserFull(fyVar.getUserConfig().getClientUserId());
                    if (userFull != null) {
                        userFull.profile_photo = tL_photos_photo.photo;
                        fyVar.getMessagesStorage().updateUserInfo(userFull, false);
                    }
                } else {
                    z10 = z12;
                }
                fyVar.Y3 = null;
                fyVar.Z3 = null;
                NotificationCenter notificationCenter = fyVar.getNotificationCenter();
                int i26 = NotificationCenter.updateInterfaces;
                Object[] objArr = new Object[1];
                objArr[i22] = Integer.valueOf(MessagesController.UPDATE_MASK_ALL);
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i26, objArr);
                fyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[i22]);
                fyVar.getUserConfig().saveConfig(true);
                i13 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                MessagesController.getInstance(i13).removeSuggestion(0L, "USERPIC_SETUP");
                fyVar.U4();
                mc mcVar = fyVar.f38259a4;
                if (mcVar != null) {
                    dc dcVar = (dc) mcVar.f30648e;
                    o6 o6Var = dcVar.d;
                    if (z10) {
                        i14 = R.string.YourProfileVideoDone;
                    } else {
                        i14 = R.string.YourProfilePhotoDone;
                    }
                    o6Var.c(LocaleController.getString(i14), true, true);
                    dcVar.setProgress(1.0f);
                    ib button = dcVar.getButton();
                    button.setScaleX(0.6f);
                    button.setScaleY(0.6f);
                    button.setAlpha(0.0f);
                    button.setVisibility(0);
                    org.telegram.ui.b.q(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), jr.h, 360L);
                    mc mcVar2 = fyVar.f38259a4;
                    mcVar2.f30652j = 5000;
                    mcVar2.i(false);
                    fyVar.f38259a4.i(true);
                    return;
                }
                return;
            case 19:
                bo0.a0((bo0) obj4, z12, (String) obj3, (String) obj2, (TL_account.updatePasswordSettings) obj5);
                return;
            case 20:
                bo0.i0((bo0) obj4, (TLRPC.TL_error) obj2, z12, (TLObject) obj5, (String) obj3);
                return;
            case 21:
                cg1.U((cg1) obj4, (TLObject) obj2, z12, (String) obj3, (TL_account.passwordInputSettings) obj5);
                return;
            case 22:
                sf.u uVar = (sf.u) obj4;
                ArrayList arrayList6 = uVar.f47959b;
                arrayList6.clear();
                arrayList6.addAll((ArrayList) obj3);
                int i27 = uVar.f47958a;
                MessagesController.getInstance(i27).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i27).putChats((ArrayList) obj5, true);
                NotificationCenter.getInstance(i27).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                uVar.f47960c = false;
                uVar.e(false, z12);
                return;
            default:
                b4.f((org.telegram.ui.ActionBar.o2) obj5, (Context) obj4, (c6) obj3, (m3) obj2, z12);
                return;
        }
    }

    public j(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.f6039a = i10;
        this.d = obj;
        this.f6041c = obj2;
        this.f6042e = obj3;
        this.f6040b = z10;
        this.f6043f = obj4;
    }

    public j(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i10) {
        this.f6039a = i10;
        this.d = obj;
        this.f6041c = obj2;
        this.f6040b = z10;
        this.f6042e = obj3;
        this.f6043f = obj4;
    }

    public j(Object obj, TLObject tLObject, boolean z10, TLObject tLObject2, String str, int i10) {
        this.f6039a = i10;
        this.d = obj;
        this.f6042e = tLObject;
        this.f6040b = z10;
        this.f6043f = tLObject2;
        this.f6041c = str;
    }

    public j(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z10, int i10) {
        this.f6039a = i10;
        this.d = obj;
        this.f6042e = tL_error;
        this.f6043f = tLObject;
        this.f6041c = str;
        this.f6040b = z10;
    }

    public j(MessagesController messagesController, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_channels_editBanned tL_channels_editBanned, boolean z10) {
        this.f6039a = 5;
        this.d = messagesController;
        this.f6041c = tL_error;
        this.f6043f = o2Var;
        this.f6042e = tL_channels_editBanned;
        this.f6040b = z10;
    }

    public j(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j10, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f6039a = 0;
        this.d = payments_giveawayinfo;
        this.f6040b = z10;
        this.f6041c = str;
        this.f6042e = tL_messageMediaGiveaway;
        this.f6043f = o2Var;
    }

    public j(org.telegram.ui.ActionBar.o2 o2Var, Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f6039a = i10;
        this.f6043f = o2Var;
        this.d = obj;
        this.f6041c = obj2;
        this.f6042e = obj3;
        this.f6040b = z10;
    }

    public j(st stVar, boolean z10, jh.m mVar, String str, TextView textView) {
        this.f6039a = 15;
        this.d = stVar;
        this.f6040b = z10;
        this.f6042e = mVar;
        this.f6041c = str;
        this.f6043f = textView;
    }

    public j(bo0 bo0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f6039a = 19;
        this.d = bo0Var;
        this.f6040b = z10;
        this.f6041c = str;
        this.f6042e = str2;
        this.f6043f = updatepasswordsettings;
    }

    public j(cg1 cg1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f6039a = 21;
        this.d = cg1Var;
        this.f6042e = tLObject;
        this.f6040b = z10;
        this.f6041c = str;
        this.f6043f = passwordinputsettings;
    }
}
