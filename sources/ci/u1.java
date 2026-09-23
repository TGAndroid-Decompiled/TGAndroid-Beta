package ci;

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
import org.telegram.messenger.ul;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.ty;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fy;
import org.telegram.ui.je;
import org.telegram.ui.kg;
import org.telegram.ui.pt;
import org.telegram.ui.qo0;
import org.telegram.ui.ry;
import org.telegram.ui.xn;
import org.telegram.ui.zg1;
public final class u1 implements Runnable {
    public final int f5597a;
    public final boolean f5598b;
    public final Object f5599c;
    public final Object d;
    public final Object e;
    public final Object f5600f;

    public u1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f5597a = i10;
        this.f5599c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f5600f = obj4;
        this.f5598b = z10;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        Object obj;
        float f7;
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
        int i21 = this.f5597a;
        boolean z11 = true;
        int i22 = 0;
        boolean z12 = this.f5598b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f5600f;
        Object obj5 = this.f5599c;
        switch (i21) {
            case 0:
                w1 w1Var = (w1) obj5;
                TLObject tLObject = (TLObject) obj3;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = (TLRPC.TL_messages_getInlineBotResults) obj2;
                String str = (String) obj4;
                z1 z1Var = w1Var.f5702s;
                ArrayList arrayList = z1Var.f5905n;
                if (w1Var.f5701r) {
                    if (!(tLObject instanceof TLRPC.messages_BotResults)) {
                        i10 = ((org.telegram.ui.ActionBar.f3) z1Var.f5906r).currentAccount;
                        w1Var.d = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, new v1(w1Var, str, z12, 0));
                        return;
                    }
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    w1Var.h = messages_botresults.next_offset;
                    if (z12) {
                        arrayList.clear();
                    }
                    arrayList.size();
                    arrayList.addAll(messages_botresults.results);
                    w1Var.l();
                    z1Var.d.c(false);
                    w1Var.f5701r = false;
                    return;
                }
                return;
            case 1:
                lc lcVar = (lc) obj5;
                Bitmap bitmap = (Bitmap) obj3;
                File file = (File) obj2;
                l8 l8Var = (l8) obj4;
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (z12) {
                        i11 = 95;
                    } else {
                        i11 = 99;
                    }
                    bitmap.compress(compressFormat, i11, new FileOutputStream(file));
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new a3.k0(lcVar, l8Var, file, 19));
                return;
            case 2:
                hg.a0 a0Var = (hg.a0) obj5;
                ArrayList arrayList2 = a0Var.f10193b;
                arrayList2.clear();
                arrayList2.addAll((ArrayList) obj3);
                int i23 = a0Var.f10192a;
                MessagesController.getInstance(i23).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i23).putChats((ArrayList) obj4, true);
                NotificationCenter.getInstance(i23).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                a0Var.f10194c = false;
                a0Var.e(false, z12);
                return;
            case 3:
                ii.k4.f((org.telegram.ui.ActionBar.n2) obj5, (Context) obj3, (org.telegram.ui.ActionBar.d6) obj2, (ii.u3) obj4, z12);
                return;
            case 4:
                ((FactCheckController) obj5).lambda$applyFactCheck$15((TLObject) obj3, (TLRPC.TL_textWithEntities) obj2, z12, (org.telegram.ui.ActionBar.b2) obj4);
                return;
            case 5:
                ((MediaDataController) obj5).lambda$loadStickersByEmojiOrName$84((TLRPC.TL_error) obj2, (TLObject) obj3, (String) obj4, z12);
                return;
            case 6:
                ((MessagesController) obj5).lambda$setParticipantBannedRole$91((TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.n2) obj2, (TLRPC.TL_channels_editBanned) obj4, z12);
                return;
            case 7:
                ((MessagesStorage) obj5).lambda$putChannelViews$191((a0.i) obj3, (a0.i) obj2, (a0.i) obj4, z12);
                return;
            case 8:
                ((MessagesStorage) obj5).lambda$replaceMessageIfExists$234((TLRPC.Message) obj3, z12, (ArrayList) obj2, (ArrayList) obj4);
                return;
            case 9:
                ((SendMessagesHelper) obj5).lambda$sendEditRichMessageRequest$23((TLRPC.TL_messages_editMessage) obj3, (MessageObject) obj2, (org.telegram.ui.ActionBar.n2) obj4, z12);
                return;
            case 10:
                ((SendMessagesHelper) obj5).lambda$performSendMessageRequest$80((TLRPC.Message) obj2, z12, (TLObject) obj3, (SendMessagesHelper.DelayedMessage) obj4);
                return;
            case 11:
                ((UnconfirmedAuthController) obj5).lambda$updateList$7((boolean[]) obj3, (ArrayList) obj2, z12, (Utilities.Callback) obj4);
                return;
            case 12:
                ((CameraController) obj5).lambda$recordVideo$12((CameraController.ICameraView) obj3, (File) obj2, z12, (Runnable) obj4);
                return;
            case 13:
                je jeVar = (je) obj5;
                TLObject tLObject2 = (TLObject) obj3;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj4;
                if (((TLRPC.TL_error) obj2) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    jeVar.b0(z12, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 14:
                xn xnVar = (xn) obj5;
                TLObject tLObject3 = (TLObject) obj3;
                kg kgVar = (kg) obj4;
                ((nf.e) obj2).b();
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    xnVar.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    xnVar.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    int i24 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
                    if (i24 >= 0) {
                        obj = xnVar.getMessagesController().getUser(Long.valueOf(peerDialogId));
                    } else if (i24 < 0) {
                        obj = xnVar.getMessagesController().getChat(Long.valueOf(-peerDialogId));
                    }
                    kgVar.run(obj, Boolean.valueOf(z12));
                    return;
                }
                obj = null;
                kgVar.run(obj, Boolean.valueOf(z12));
                return;
            case 15:
                org.telegram.ui.Components.oa oaVar = (org.telegram.ui.Components.oa) obj5;
                Bitmap bitmap2 = (Bitmap) obj3;
                Bitmap bitmap3 = (Bitmap) obj2;
                if (TextUtils.equals(oaVar.f26689a, (String) obj4)) {
                    oaVar.f26692f = null;
                    Bitmap bitmap4 = oaVar.f26690b;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                    }
                    oaVar.f26690b = bitmap2;
                    Runnable runnable = oaVar.e;
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
            case 16:
                fi.o oVar = (fi.o) obj3;
                String str2 = (String) obj4;
                TextView textView = (TextView) obj2;
                ClipboardManager clipboardManager = (ClipboardManager) ((cu) obj5).getContext().getSystemService("clipboard");
                z11 = (z12 && (TextUtils.isEmpty(oVar.getText()) || TextUtils.equals(oVar.getText().toString(), str2)) && clipboardManager != null && clipboardManager.hasPrimaryClip()) ? false : false;
                ViewPropertyAnimator animate = textView.animate();
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f7);
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
                ul.r(scaleX.scaleY(f11), rr.h, 300L);
                return;
            case 17:
                ty tyVar = (ty) obj5;
                String str3 = (String) obj4;
                String str4 = (String) obj2;
                TLObject tLObject4 = (TLObject) obj3;
                tyVar.f28334a.remove(str4);
                lz lzVar = tyVar.f28335b;
                qy qyVar = lzVar.f25989j0;
                HashMap hashMap = lzVar.f25995l0;
                boolean z13 = qyVar.v;
                boolean z14 = this.f5598b;
                if (z13 && qyVar.f27485w.equals(str3)) {
                    lzVar.f25989j0.E(str3, "", false, true, z14, str4, tLObject4);
                    return;
                } else if (z14 && (!(tLObject4 instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject4).results.isEmpty())) {
                    tyVar.a(str3, false);
                    return;
                } else if ((tLObject4 instanceof TLRPC.messages_BotResults) && !hashMap.containsKey(str4)) {
                    hashMap.put(str4, (TLRPC.messages_BotResults) tLObject4);
                    return;
                } else {
                    return;
                }
            case 18:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj5;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj3;
                TLRPC.Document document2 = (TLRPC.Document) obj2;
                xn xnVar2 = (xn) obj4;
                File w10 = l8.w(n2Var.getCurrentAccount(), "webp");
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
                ArrayList arrayList3 = new ArrayList();
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                arrayList3.add(photoEntry);
                VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                mediaEntity.type = (byte) 0;
                mediaEntity.parentObject = tL_messages_stickerSet2;
                mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document2, true).getAbsolutePath();
                mediaEntity.f15600x = 0.5f - ((Math.min(512, 512) / f12) / 2.0f);
                mediaEntity.f15601y = 0.5f - ((Math.min(512, 512) / f12) / 2.0f);
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
                ArrayList<VideoEditedInfo.MediaEntity> arrayList4 = new ArrayList<>();
                photoEntry.mediaEntities = arrayList4;
                arrayList4.add(mediaEntity);
                photoEntry.averageDuration = 3000L;
                if (MessageObject.isAnimatedStickerDocument(document2, true)) {
                    File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document2, true);
                    if (pathToAttach != null) {
                        try {
                            RLottieNative a2 = RLottieNative.a(pathToAttach.getAbsolutePath(), null, null, null, 0, null);
                            if (a2 != null) {
                                int[] iArr = a2.f22093a;
                                int i25 = iArr[0];
                                int i26 = iArr[1];
                                a2.d();
                                d = i25 / i26;
                            } else {
                                d = 0.0d;
                            }
                            photoEntry.averageDuration = (long) (d * 1000.0d);
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    }
                } else if (MessageObject.isVideoStickerDocument(document2)) {
                    photoEntry.averageDuration = (long) (MessageObject.getDocumentDuration(document2) * 1000.0d);
                }
                PhotoViewer.t1().J2(n2Var.getParentActivity(), null, n2Var.getResourceProvider());
                PhotoViewer.t1().f2(arrayList3, 0, 11, false, new Object(), xnVar2);
                PhotoViewer t12 = PhotoViewer.t1();
                if (z12) {
                    document = document2;
                } else {
                    document = null;
                }
                t12.X0(document2, document, true, null);
                pt q6 = pt.q();
                if (z12) {
                    tL_messages_stickerSet = tL_messages_stickerSet2;
                } else {
                    tL_messages_stickerSet = null;
                }
                q6.T = tL_messages_stickerSet;
                return;
            case 19:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject5 = (TLObject) obj3;
                String str5 = (String) obj4;
                ry ryVar = ((fy) obj5).f33393a;
                if (tL_error == null) {
                    TLRPC.User user = ryVar.getMessagesController().getUser(Long.valueOf(ryVar.getUserConfig().getClientUserId()));
                    if (user == null) {
                        user = ryVar.getUserConfig().getCurrentUser();
                        if (user != null) {
                            ryVar.getMessagesController().putUser(user, false);
                        } else {
                            return;
                        }
                    } else {
                        ryVar.getUserConfig().setCurrentUser(user);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    ArrayList<TLRPC.PhotoSize> arrayList5 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList5, 150);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList5, 800);
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
                    if (closestPhotoSizeWithSize != null && ryVar.f36966b4 != null) {
                        i18 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i18).getPathToAttach(closestPhotoSizeWithSize, true);
                        i19 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                        FileLoader.getInstance(i19).getPathToAttach(ryVar.f36966b4, true).renameTo(pathToAttach2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(ryVar.f36966b4.volume_id);
                        sb2.append("_");
                        String o9 = a4.a.o(ryVar.f36966b4.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        z10 = z12;
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String o10 = a4.a.o(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i20 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                        imageLoader.replaceImageInCache(o9, o10, ImageLocation.getForUserOrChat(i20, user, 1), false);
                    } else {
                        z10 = z12;
                    }
                    if (closestVideoSizeWithSize != null && str5 != null) {
                        i17 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                        new File(str5).renameTo(FileLoader.getInstance(i17).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
                    } else if (closestPhotoSizeWithSize2 != null && ryVar.f36972c4 != null) {
                        i15 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                        File pathToAttach3 = FileLoader.getInstance(i15).getPathToAttach(closestPhotoSizeWithSize2, true);
                        i16 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                        FileLoader.getInstance(i16).getPathToAttach(ryVar.f36972c4, true).renameTo(pathToAttach3);
                    }
                    ryVar.getMessagesController().getDialogPhotos(user.f18230id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(user);
                    i22 = 0;
                    ryVar.getMessagesStorage().putUsersAndChats(arrayList6, null, false, true);
                    TLRPC.UserFull userFull = ryVar.getMessagesController().getUserFull(ryVar.getUserConfig().getClientUserId());
                    if (userFull != null) {
                        userFull.profile_photo = tL_photos_photo.photo;
                        ryVar.getMessagesStorage().updateUserInfo(userFull, false);
                    }
                } else {
                    z10 = z12;
                }
                ryVar.f36966b4 = null;
                ryVar.f36972c4 = null;
                NotificationCenter notificationCenter = ryVar.getNotificationCenter();
                int i27 = NotificationCenter.updateInterfaces;
                Object[] objArr = new Object[1];
                objArr[i22] = Integer.valueOf(MessagesController.UPDATE_MASK_ALL);
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i27, objArr);
                ryVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[i22]);
                ryVar.getUserConfig().saveConfig(true);
                i13 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                MessagesController.getInstance(i13).removeSuggestion(0L, "USERPIC_SETUP");
                ryVar.U4();
                org.telegram.ui.Components.qc qcVar = ryVar.f36977d4;
                if (qcVar != null) {
                    org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) qcVar.e;
                    org.telegram.ui.Components.p6 p6Var = hcVar.d;
                    if (z10) {
                        i14 = R.string.YourProfileVideoDone;
                    } else {
                        i14 = R.string.YourProfilePhotoDone;
                    }
                    p6Var.c(LocaleController.getString(i14), true, true);
                    hcVar.setProgress(1.0f);
                    org.telegram.ui.Components.mb button = hcVar.getButton();
                    button.setScaleX(0.6f);
                    button.setScaleY(0.6f);
                    button.setAlpha(0.0f);
                    button.setVisibility(0);
                    ul.r(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), rr.h, 360L);
                    org.telegram.ui.Components.qc qcVar2 = ryVar.f36977d4;
                    qcVar2.f27306j = 5000;
                    qcVar2.i(false);
                    ryVar.f36977d4.i(true);
                    return;
                }
                return;
            case 20:
                qo0.a0((qo0) obj5, z12, (String) obj4, (String) obj3, (TL_account.updatePasswordSettings) obj2);
                return;
            case 21:
                qo0.i0((qo0) obj5, (TLRPC.TL_error) obj2, z12, (TLObject) obj3, (String) obj4);
                return;
            case 22:
                zg1.U((zg1) obj5, (TLObject) obj3, z12, (String) obj4, (TL_account.passwordInputSettings) obj2);
                return;
            default:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj5;
                String str6 = (String) obj4;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) obj3;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                boolean z15 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                boolean z16 = this.f5598b;
                if (z15) {
                    tg.k.d(z16, str6, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, n2Var2.getParentActivity(), n2Var2.getResourceProvider());
                    return;
                } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                    tg.k.e(z16, str6, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, n2Var2.getParentActivity(), n2Var2.getResourceProvider());
                    return;
                } else {
                    return;
                }
        }
    }

    public u1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.f5597a = i10;
        this.f5599c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f5598b = z10;
        this.f5600f = obj4;
    }

    public u1(Object obj, Object obj2, TLObject tLObject, Object obj3, boolean z10, int i10) {
        this.f5597a = i10;
        this.f5599c = obj;
        this.e = obj2;
        this.d = tLObject;
        this.f5600f = obj3;
        this.f5598b = z10;
    }

    public u1(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i10) {
        this.f5597a = i10;
        this.f5599c = obj;
        this.d = obj2;
        this.f5598b = z10;
        this.e = obj3;
        this.f5600f = obj4;
    }

    public u1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, boolean z10, TLObject tLObject2, Object obj, int i10) {
        this.f5597a = i10;
        this.f5599c = notificationCenterDelegate;
        this.e = tLObject;
        this.f5598b = z10;
        this.d = tLObject2;
        this.f5600f = obj;
    }

    public u1(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j3, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f5597a = 23;
        this.f5599c = payments_giveawayinfo;
        this.f5598b = z10;
        this.f5600f = str;
        this.d = tL_messageMediaGiveaway;
        this.e = n2Var;
    }

    public u1(org.telegram.ui.Components.oa oaVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.f5597a = 15;
        this.f5599c = oaVar;
        this.f5600f = str;
        this.d = bitmap;
        this.f5598b = z10;
        this.e = bitmap2;
    }

    public u1(cu cuVar, boolean z10, fi.o oVar, String str, TextView textView) {
        this.f5597a = 16;
        this.f5599c = cuVar;
        this.f5598b = z10;
        this.d = oVar;
        this.f5600f = str;
        this.e = textView;
    }

    public u1(ty tyVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.f5597a = 17;
        this.f5599c = tyVar;
        this.f5600f = str;
        this.f5598b = z10;
        this.e = str2;
        this.d = tLObject;
    }

    public u1(qo0 qo0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f5597a = 20;
        this.f5599c = qo0Var;
        this.f5598b = z10;
        this.f5600f = str;
        this.d = str2;
        this.e = updatepasswordsettings;
    }

    public u1(zg1 zg1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f5597a = 22;
        this.f5599c = zg1Var;
        this.d = tLObject;
        this.f5598b = z10;
        this.f5600f = str;
        this.e = passwordinputsettings;
    }
}
