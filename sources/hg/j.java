package hg;

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
import mh.k7;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.ga;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Components.zb;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dy;
import org.telegram.ui.fg;
import org.telegram.ui.ke;
import org.telegram.ui.lo0;
import org.telegram.ui.py;
import org.telegram.ui.qg1;
import org.telegram.ui.qt;
import org.telegram.ui.xn;
import qh.ca;
import qh.s6;
import wh.d4;
import wh.o3;
public final class j implements Runnable {
    public final int f7519a;
    public final boolean f7520b;
    public final Object f7521c;
    public final Object d;
    public final Object f7522e;
    public final Object f7523f;

    public j(Object obj, Object obj2, Object obj3, Object obj4, boolean z4, int i10) {
        this.f7519a = i10;
        this.f7521c = obj;
        this.d = obj2;
        this.f7522e = obj3;
        this.f7523f = obj4;
        this.f7520b = z4;
    }

    @Override
    public final void run() {
        Object obj;
        float f10;
        float f11;
        float f12;
        int i10;
        byte b10;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        double d;
        boolean z4;
        int i11;
        int i12;
        TLRPC.VideoSize closestVideoSizeWithSize;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = this.f7519a;
        boolean z10 = true;
        int i22 = 0;
        boolean z11 = this.f7520b;
        Object obj2 = this.f7522e;
        Object obj3 = this.d;
        Object obj4 = this.f7521c;
        Object obj5 = this.f7523f;
        switch (i21) {
            case 0:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj4;
                String str = (String) obj3;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj5;
                boolean z12 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                boolean z13 = this.f7520b;
                if (z12) {
                    r.d(z13, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, p2Var.getParentActivity(), p2Var.getResourceProvider());
                    return;
                } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                    r.e(z13, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, p2Var.getParentActivity(), p2Var.getResourceProvider());
                    return;
                } else {
                    return;
                }
            case 1:
                ((FactCheckController) obj4).lambda$applyFactCheck$15((TLObject) obj3, (TLRPC.TL_textWithEntities) obj2, z11, (org.telegram.ui.ActionBar.d2) obj5);
                return;
            case 2:
                ((MediaDataController) obj4).lambda$loadStickersByEmojiOrName$84((TLRPC.TL_error) obj2, (TLObject) obj5, (String) obj3, z11);
                return;
            case 3:
                ((MessagesController) obj4).lambda$setParticipantBannedRole$91((TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.p2) obj5, (TLRPC.TL_channels_editBanned) obj2, z11);
                return;
            case 4:
                ((MessagesStorage) obj4).lambda$putChannelViews$191((a0.h) obj3, (a0.h) obj2, (a0.h) obj5, z11);
                return;
            case 5:
                ((MessagesStorage) obj4).lambda$replaceMessageIfExists$234((TLRPC.Message) obj3, z11, (ArrayList) obj2, (ArrayList) obj5);
                return;
            case 6:
                ((SendMessagesHelper) obj4).lambda$sendEditRichMessageRequest$23((TLRPC.TL_messages_editMessage) obj3, (MessageObject) obj2, (org.telegram.ui.ActionBar.p2) obj5, z11);
                return;
            case 7:
                ((SendMessagesHelper) obj4).lambda$performSendMessageRequest$80((TLRPC.Message) obj3, z11, (TLObject) obj2, (SendMessagesHelper.DelayedMessage) obj5);
                return;
            case 8:
                ((UnconfirmedAuthController) obj4).lambda$updateList$7((boolean[]) obj3, (ArrayList) obj2, z11, (Utilities.Callback) obj5);
                return;
            case 9:
                ((CameraController) obj4).lambda$recordVideo$12((CameraController.ICameraView) obj3, (File) obj2, z11, (Runnable) obj5);
                return;
            case 10:
                ke keVar = (ke) obj4;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj5;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.F = password;
                    TwoStepVerificationActivity.m0(password);
                    keVar.b0(z11, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 11:
                xn xnVar = (xn) obj4;
                TLObject tLObject2 = (TLObject) obj2;
                fg fgVar = (fg) obj5;
                ((af.f) obj3).b();
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    xnVar.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    xnVar.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    int i23 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
                    if (i23 >= 0) {
                        obj = xnVar.getMessagesController().getUser(Long.valueOf(peerDialogId));
                    } else if (i23 < 0) {
                        obj = xnVar.getMessagesController().getChat(Long.valueOf(-peerDialogId));
                    }
                    fgVar.run(obj, Boolean.valueOf(z11));
                    return;
                }
                obj = null;
                fgVar.run(obj, Boolean.valueOf(z11));
                return;
            case 12:
                ga gaVar = (ga) obj4;
                Bitmap bitmap = (Bitmap) obj2;
                Bitmap bitmap2 = (Bitmap) obj5;
                if (TextUtils.equals(gaVar.f27155a, (String) obj3)) {
                    gaVar.f27159f = null;
                    Bitmap bitmap3 = gaVar.f27156b;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    gaVar.f27156b = bitmap;
                    Runnable runnable = gaVar.f27158e;
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    bitmap.recycle();
                }
                if (z11) {
                    bitmap2.recycle();
                    return;
                }
                return;
            case 13:
                mh.m mVar = (mh.m) obj2;
                String str2 = (String) obj3;
                TextView textView = (TextView) obj5;
                ClipboardManager clipboardManager = (ClipboardManager) ((xt) obj4).getContext().getSystemService("clipboard");
                z10 = (z11 && (TextUtils.isEmpty(mVar.getText()) || TextUtils.equals(mVar.getText().toString(), str2)) && clipboardManager != null && clipboardManager.hasPrimaryClip()) ? false : false;
                ViewPropertyAnimator animate = textView.animate();
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f10);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.7f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.7f;
                }
                org.telegram.ui.b.p(scaleX.scaleY(f12), pr.h, 300L);
                return;
            case 14:
                ty tyVar = (ty) obj4;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                TLObject tLObject3 = (TLObject) obj5;
                tyVar.f31479a.remove(str4);
                mz mzVar = tyVar.f31480b;
                qy qyVar = mzVar.f29285g0;
                HashMap hashMap = mzVar.f29291i0;
                boolean z14 = qyVar.v;
                boolean z15 = this.f7520b;
                if (z14 && qyVar.f30526w.equals(str3)) {
                    mzVar.f29285g0.E(str3, "", false, true, z15, str4, tLObject3);
                    return;
                } else if (z15 && (!(tLObject3 instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject3).results.isEmpty())) {
                    tyVar.a(str3, false);
                    return;
                } else if ((tLObject3 instanceof TLRPC.messages_BotResults) && !hashMap.containsKey(str4)) {
                    hashMap.put(str4, (TLRPC.messages_BotResults) tLObject3);
                    return;
                } else {
                    return;
                }
            case 15:
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj5;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj4;
                TLRPC.Document document2 = (TLRPC.Document) obj3;
                xn xnVar2 = (xn) obj2;
                File w10 = s6.w(p2Var2.getCurrentAccount(), "webp");
                int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                if (devicePerformanceClass != 0) {
                    if (devicePerformanceClass != 2) {
                        i10 = 2560;
                    } else {
                        i10 = 3840;
                    }
                } else {
                    i10 = 1280;
                }
                float f13 = 512;
                float f14 = i10;
                double d10 = (f14 * f13) / f13;
                if (((float) Math.floor(d10)) > f14) {
                    f14 = (float) Math.floor(d10);
                }
                float f15 = f14;
                Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                try {
                    createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                createBitmap.recycle();
                ArrayList arrayList = new ArrayList();
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                arrayList.add(photoEntry);
                VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                mediaEntity.type = (byte) 0;
                mediaEntity.parentObject = tL_messages_stickerSet2;
                mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document2, true).getAbsolutePath();
                mediaEntity.f18079x = 0.5f - ((Math.min(512, 512) / f13) / 2.0f);
                mediaEntity.f18080y = 0.5f - ((Math.min(512, 512) / f13) / 2.0f);
                mediaEntity.width = Math.min(512, 512) / f13;
                mediaEntity.height = Math.min(512, 512) / f13;
                int floor = (int) Math.floor(f15 * 0.5d);
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
                ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = new ArrayList<>();
                photoEntry.mediaEntities = arrayList2;
                arrayList2.add(mediaEntity);
                photoEntry.averageDuration = 3000L;
                if (MessageObject.isAnimatedStickerDocument(document2, true)) {
                    File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document2, true);
                    if (pathToAttach != null) {
                        try {
                            RLottieNative a2 = RLottieNative.a(pathToAttach.getAbsolutePath(), null, 0, 0, null, false, null, false, 0, null);
                            if (a2 != null) {
                                int[] iArr = a2.f24963a;
                                int i24 = iArr[0];
                                int i25 = iArr[1];
                                a2.d();
                                d = i24 / i25;
                            } else {
                                d = 0.0d;
                            }
                            photoEntry.averageDuration = (long) (d * 1000.0d);
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                    }
                } else if (MessageObject.isVideoStickerDocument(document2)) {
                    photoEntry.averageDuration = (long) (MessageObject.getDocumentDuration(document2) * 1000.0d);
                }
                PhotoViewer.t1().K2(p2Var2.getParentActivity(), null, p2Var2.getResourceProvider());
                PhotoViewer.t1().f2(arrayList, 0, 11, false, new Object(), xnVar2);
                PhotoViewer t12 = PhotoViewer.t1();
                if (z11) {
                    document = document2;
                } else {
                    document = null;
                }
                t12.Y0(document2, document, true, null);
                qt q10 = qt.q();
                if (z11) {
                    tL_messages_stickerSet = tL_messages_stickerSet2;
                } else {
                    tL_messages_stickerSet = null;
                }
                q10.T = tL_messages_stickerSet;
                return;
            case 16:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject4 = (TLObject) obj5;
                String str5 = (String) obj3;
                py pyVar = ((dy) obj4).f36328a;
                if (tL_error == null) {
                    TLRPC.User user = pyVar.getMessagesController().getUser(Long.valueOf(pyVar.getUserConfig().getClientUserId()));
                    if (user == null) {
                        user = pyVar.getUserConfig().getCurrentUser();
                        if (user != null) {
                            pyVar.getMessagesController().putUser(user, false);
                        } else {
                            return;
                        }
                    } else {
                        pyVar.getUserConfig().setCurrentUser(user);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject4;
                    ArrayList<TLRPC.PhotoSize> arrayList3 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList3, 150);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList3, 800);
                    if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                        closestVideoSizeWithSize = null;
                    } else {
                        closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(tL_photos_photo.photo.video_sizes, 1000);
                    }
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f20867id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && pyVar.Z3 != null) {
                        i16 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i16).getPathToAttach(closestPhotoSizeWithSize, true);
                        i17 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                        FileLoader.getInstance(i17).getPathToAttach(pyVar.Z3, true).renameTo(pathToAttach2);
                        StringBuilder sb = new StringBuilder();
                        sb.append(pyVar.Z3.volume_id);
                        sb.append("_");
                        String m9 = android.support.v4.media.a.m(pyVar.Z3.local_id, "@50_50", sb);
                        StringBuilder sb2 = new StringBuilder();
                        z4 = z11;
                        sb2.append(closestPhotoSizeWithSize.location.volume_id);
                        sb2.append("_");
                        String m10 = android.support.v4.media.a.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i18 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                        imageLoader.replaceImageInCache(m9, m10, ImageLocation.getForUserOrChat(i18, user, 1), false);
                    } else {
                        z4 = z11;
                    }
                    if (closestVideoSizeWithSize != null && str5 != null) {
                        i15 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                        new File(str5).renameTo(FileLoader.getInstance(i15).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
                    } else if (closestPhotoSizeWithSize2 != null && pyVar.f40183a4 != null) {
                        i13 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                        File pathToAttach3 = FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize2, true);
                        i14 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                        FileLoader.getInstance(i14).getPathToAttach(pyVar.f40183a4, true).renameTo(pathToAttach3);
                    }
                    pyVar.getMessagesController().getDialogPhotos(user.f20990id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(user);
                    i22 = 0;
                    pyVar.getMessagesStorage().putUsersAndChats(arrayList4, null, false, true);
                    TLRPC.UserFull userFull = pyVar.getMessagesController().getUserFull(pyVar.getUserConfig().getClientUserId());
                    if (userFull != null) {
                        userFull.profile_photo = tL_photos_photo.photo;
                        pyVar.getMessagesStorage().updateUserInfo(userFull, false);
                    }
                } else {
                    z4 = z11;
                }
                pyVar.Z3 = null;
                pyVar.f40183a4 = null;
                NotificationCenter notificationCenter = pyVar.getNotificationCenter();
                int i26 = NotificationCenter.updateInterfaces;
                Object[] objArr = new Object[1];
                objArr[i22] = Integer.valueOf(MessagesController.UPDATE_MASK_ALL);
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i26, objArr);
                pyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[i22]);
                pyVar.getUserConfig().saveConfig(true);
                i11 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                MessagesController.getInstance(i11).removeSuggestion(0L, "USERPIC_SETUP");
                pyVar.U4();
                ic icVar = pyVar.f40189b4;
                if (icVar != null) {
                    zb zbVar = (zb) icVar.f27741e;
                    k6 k6Var = zbVar.d;
                    if (z4) {
                        i12 = R.string.YourProfileVideoDone;
                    } else {
                        i12 = R.string.YourProfilePhotoDone;
                    }
                    k6Var.c(LocaleController.getString(i12), true, true);
                    zbVar.setProgress(1.0f);
                    db button = zbVar.getButton();
                    button.setScaleX(0.6f);
                    button.setScaleY(0.6f);
                    button.setAlpha(0.0f);
                    button.setVisibility(0);
                    org.telegram.ui.b.p(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), pr.h, 360L);
                    ic icVar2 = pyVar.f40189b4;
                    icVar2.f27745j = 5000;
                    icVar2.i(false);
                    pyVar.f40189b4.i(true);
                    return;
                }
                return;
            case 17:
                lo0.a0((lo0) obj4, z11, (String) obj3, (String) obj2, (TL_account.updatePasswordSettings) obj5);
                return;
            case 18:
                lo0.i0((lo0) obj4, (TLRPC.TL_error) obj2, z11, (TLObject) obj5, (String) obj3);
                return;
            case 19:
                qg1.U((qg1) obj4, (TLObject) obj2, z11, (String) obj3, (TL_account.passwordInputSettings) obj5);
                return;
            case 20:
                qh.g1 g1Var = (qh.g1) obj4;
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = (TLRPC.TL_messages_getInlineBotResults) obj5;
                String str6 = (String) obj3;
                qh.i1 i1Var = g1Var.f45355s;
                ArrayList arrayList5 = i1Var.f45405n;
                if (g1Var.f45354r) {
                    if (!(tLObject5 instanceof TLRPC.messages_BotResults)) {
                        i19 = ((h3) i1Var.f45406r).currentAccount;
                        g1Var.d = ConnectionsManager.getInstance(i19).sendRequest(tL_messages_getInlineBotResults, new k7(g1Var, str6, z11, 7));
                        return;
                    }
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject5;
                    g1Var.h = messages_botresults.next_offset;
                    if (z11) {
                        arrayList5.clear();
                    }
                    arrayList5.size();
                    arrayList5.addAll(messages_botresults.results);
                    g1Var.l();
                    i1Var.d.c(false);
                    g1Var.f45354r = false;
                    return;
                }
                return;
            case 21:
                ca caVar = (ca) obj4;
                Bitmap bitmap4 = (Bitmap) obj3;
                File file = (File) obj2;
                s6 s6Var = (s6) obj5;
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (z11) {
                        i20 = 95;
                    } else {
                        i20 = 99;
                    }
                    bitmap4.compress(compressFormat, i20, new FileOutputStream(file));
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                AndroidUtilities.runOnUIThread(new o71(caVar, s6Var, file, 19));
                return;
            case 22:
                vf.t tVar = (vf.t) obj4;
                ArrayList arrayList6 = tVar.f49202b;
                arrayList6.clear();
                arrayList6.addAll((ArrayList) obj3);
                int i27 = tVar.f49201a;
                MessagesController.getInstance(i27).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i27).putChats((ArrayList) obj5, true);
                NotificationCenter.getInstance(i27).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                tVar.f49203c = false;
                tVar.e(false, z11);
                return;
            default:
                d4.f((org.telegram.ui.ActionBar.p2) obj5, (Context) obj4, (g6) obj3, (o3) obj2, z11);
                return;
        }
    }

    public j(Object obj, Object obj2, Object obj3, boolean z4, Object obj4, int i10) {
        this.f7519a = i10;
        this.f7521c = obj;
        this.d = obj2;
        this.f7522e = obj3;
        this.f7520b = z4;
        this.f7523f = obj4;
    }

    public j(Object obj, Object obj2, boolean z4, Object obj3, Object obj4, int i10) {
        this.f7519a = i10;
        this.f7521c = obj;
        this.d = obj2;
        this.f7520b = z4;
        this.f7522e = obj3;
        this.f7523f = obj4;
    }

    public j(Object obj, TLObject tLObject, boolean z4, TLObject tLObject2, String str, int i10) {
        this.f7519a = i10;
        this.f7521c = obj;
        this.f7522e = tLObject;
        this.f7520b = z4;
        this.f7523f = tLObject2;
        this.d = str;
    }

    public j(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z4, int i10) {
        this.f7519a = i10;
        this.f7521c = obj;
        this.f7522e = tL_error;
        this.f7523f = tLObject;
        this.d = str;
        this.f7520b = z4;
    }

    public j(MessagesController messagesController, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_channels_editBanned tL_channels_editBanned, boolean z4) {
        this.f7519a = 3;
        this.f7521c = messagesController;
        this.d = tL_error;
        this.f7523f = p2Var;
        this.f7522e = tL_channels_editBanned;
        this.f7520b = z4;
    }

    public j(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z4, String str, long j10, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f7519a = 0;
        this.f7521c = payments_giveawayinfo;
        this.f7520b = z4;
        this.d = str;
        this.f7522e = tL_messageMediaGiveaway;
        this.f7523f = p2Var;
    }

    public j(org.telegram.ui.ActionBar.p2 p2Var, Object obj, Object obj2, Object obj3, boolean z4, int i10) {
        this.f7519a = i10;
        this.f7523f = p2Var;
        this.f7521c = obj;
        this.d = obj2;
        this.f7522e = obj3;
        this.f7520b = z4;
    }

    public j(xt xtVar, boolean z4, mh.m mVar, String str, TextView textView) {
        this.f7519a = 13;
        this.f7521c = xtVar;
        this.f7520b = z4;
        this.f7522e = mVar;
        this.d = str;
        this.f7523f = textView;
    }

    public j(lo0 lo0Var, boolean z4, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f7519a = 17;
        this.f7521c = lo0Var;
        this.f7520b = z4;
        this.d = str;
        this.f7522e = str2;
        this.f7523f = updatepasswordsettings;
    }

    public j(qg1 qg1Var, TLObject tLObject, boolean z4, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f7519a = 19;
        this.f7521c = qg1Var;
        this.f7522e = tLObject;
        this.f7520b = z4;
        this.d = str;
        this.f7523f = passwordinputsettings;
    }
}
