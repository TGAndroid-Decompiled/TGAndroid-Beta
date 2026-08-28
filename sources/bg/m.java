package bg;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import gh.m7;
import ih.h3;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import kh.a8;
import kh.wb;
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
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.ga;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.xb;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ag1;
import org.telegram.ui.bg;
import org.telegram.ui.co0;
import org.telegram.ui.dy;
import org.telegram.ui.fe;
import org.telegram.ui.ht;
import org.telegram.ui.qn;
import org.telegram.ui.qx;
import qh.a4;
import qh.l3;
public final class m implements Runnable {
    public final int f1868a;
    public final boolean f1869b;
    public final Object f1870c;
    public final Object d;
    public final Object f1871e;
    public final Object f1872f;

    public m(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i9) {
        this.f1868a = i9;
        this.d = obj;
        this.f1870c = obj2;
        this.f1871e = obj3;
        this.f1872f = obj4;
        this.f1869b = z10;
    }

    @Override
    public final void run() {
        int i9;
        int i10;
        Object obj;
        float f10;
        float f11;
        float f12;
        int i11;
        byte b10;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        double d;
        boolean z10;
        int i12;
        int i13;
        TLRPC.VideoSize closestVideoSizeWithSize;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = this.f1868a;
        boolean z11 = true;
        int i21 = 0;
        boolean z12 = this.f1869b;
        Object obj2 = this.f1871e;
        Object obj3 = this.f1870c;
        Object obj4 = this.d;
        Object obj5 = this.f1872f;
        switch (i20) {
            case 0:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj4;
                String str = (String) obj3;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj5;
                boolean z13 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                boolean z14 = this.f1869b;
                if (z13) {
                    u.d(z14, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, o2Var.getParentActivity(), o2Var.getResourceProvider());
                    return;
                } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                    u.e(z14, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, o2Var.getParentActivity(), o2Var.getResourceProvider());
                    return;
                } else {
                    return;
                }
            case 1:
                kh.u1 u1Var = (kh.u1) obj4;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = (TLRPC.TL_messages_getInlineBotResults) obj5;
                String str2 = (String) obj3;
                kh.w1 w1Var = u1Var.f16135s;
                ArrayList arrayList = w1Var.f16232n;
                if (u1Var.f16134r) {
                    if (!(tLObject instanceof TLRPC.messages_BotResults)) {
                        i9 = ((org.telegram.ui.ActionBar.f3) w1Var.f16233r).currentAccount;
                        u1Var.d = ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getInlineBotResults, new m7(u1Var, str2, z12, 1));
                        return;
                    }
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    u1Var.h = messages_botresults.next_offset;
                    if (z12) {
                        arrayList.clear();
                    }
                    arrayList.size();
                    arrayList.addAll(messages_botresults.results);
                    u1Var.l();
                    w1Var.d.c(false);
                    u1Var.f16134r = false;
                    return;
                }
                return;
            case 2:
                wb wbVar = (wb) obj4;
                Bitmap bitmap = (Bitmap) obj3;
                File file = (File) obj2;
                a8 a8Var = (a8) obj5;
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (z12) {
                        i10 = 95;
                    } else {
                        i10 = 99;
                    }
                    bitmap.compress(compressFormat, i10, new FileOutputStream(file));
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                AndroidUtilities.runOnUIThread(new h3(wbVar, a8Var, file, 17));
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
                fe feVar = (fe) obj4;
                TLObject tLObject2 = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj5;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.E = password;
                    TwoStepVerificationActivity.l0(password);
                    feVar.b0(z12, twoStepVerificationActivity.k0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 13:
                qn qnVar = (qn) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                bg bgVar = (bg) obj5;
                ((ve.d) obj3).b();
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    qnVar.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    qnVar.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    int i22 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
                    if (i22 >= 0) {
                        obj = qnVar.getMessagesController().getUser(Long.valueOf(peerDialogId));
                    } else if (i22 < 0) {
                        obj = qnVar.getMessagesController().getChat(Long.valueOf(-peerDialogId));
                    }
                    bgVar.run(obj, Boolean.valueOf(z12));
                    return;
                }
                obj = null;
                bgVar.run(obj, Boolean.valueOf(z12));
                return;
            case 14:
                ga gaVar = (ga) obj4;
                Bitmap bitmap2 = (Bitmap) obj2;
                Bitmap bitmap3 = (Bitmap) obj5;
                if (TextUtils.equals(gaVar.f28711a, (String) obj3)) {
                    gaVar.f28715f = null;
                    Bitmap bitmap4 = gaVar.f28712b;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                    }
                    gaVar.f28712b = bitmap2;
                    Runnable runnable = gaVar.f28714e;
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
                gh.o oVar = (gh.o) obj2;
                String str3 = (String) obj3;
                TextView textView = (TextView) obj5;
                ClipboardManager clipboardManager = (ClipboardManager) ((mt) obj4).getContext().getSystemService("clipboard");
                z11 = (z12 && (TextUtils.isEmpty(oVar.getText()) || TextUtils.equals(oVar.getText().toString(), str3)) && clipboardManager != null && clipboardManager.hasPrimaryClip()) ? false : false;
                ViewPropertyAnimator animate = textView.animate();
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f10);
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.7f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (z11) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.7f;
                }
                ll.r(scaleX.scaleY(f12), gr.h, 300L);
                return;
            case 16:
                ey eyVar = (ey) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                TLObject tLObject4 = (TLObject) obj5;
                eyVar.f28216a.remove(str5);
                wy wyVar = eyVar.f28217b;
                ay ayVar = wyVar.f34402f0;
                HashMap hashMap = wyVar.f34408h0;
                boolean z15 = ayVar.v;
                boolean z16 = this.f1869b;
                if (z15 && ayVar.f26923w.equals(str4)) {
                    wyVar.f34402f0.E(str4, "", false, true, z16, str5, tLObject4);
                    return;
                } else if (z16 && (!(tLObject4 instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject4).results.isEmpty())) {
                    eyVar.a(str4, false);
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
                qn qnVar2 = (qn) obj2;
                File w8 = a8.w(o2Var2.getCurrentAccount(), "webp");
                int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                if (devicePerformanceClass != 0) {
                    if (devicePerformanceClass != 2) {
                        i11 = 2560;
                    } else {
                        i11 = 3840;
                    }
                } else {
                    i11 = 1280;
                }
                float f13 = 512;
                float f14 = i11;
                double d9 = (f14 * f13) / f13;
                if (((float) Math.floor(d9)) > f14) {
                    f14 = (float) Math.floor(d9);
                }
                float f15 = f14;
                Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                try {
                    createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w8));
                } catch (Throwable th) {
                    FileLog.e(th);
                }
                createBitmap.recycle();
                ArrayList arrayList2 = new ArrayList();
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w8.getAbsolutePath(), 0, false, 0, 0, 0L);
                arrayList2.add(photoEntry);
                VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                mediaEntity.type = (byte) 0;
                mediaEntity.parentObject = tL_messages_stickerSet2;
                mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document2, true).getAbsolutePath();
                mediaEntity.f19673x = 0.5f - ((Math.min(512, 512) / f13) / 2.0f);
                mediaEntity.f19674y = 0.5f - ((Math.min(512, 512) / f13) / 2.0f);
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
                                int[] iArr = a2.f26465a;
                                int i23 = iArr[0];
                                int i24 = iArr[1];
                                a2.d();
                                d = i23 / i24;
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
                PhotoViewer.t1().f2(arrayList2, 0, 11, false, new Object(), qnVar2);
                PhotoViewer t12 = PhotoViewer.t1();
                if (z12) {
                    document = document2;
                } else {
                    document = null;
                }
                t12.X0(document2, document, true, null);
                ht q10 = ht.q();
                if (z12) {
                    tL_messages_stickerSet = tL_messages_stickerSet2;
                } else {
                    tL_messages_stickerSet = null;
                }
                q10.T = tL_messages_stickerSet;
                return;
            case 18:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject5 = (TLObject) obj5;
                String str6 = (String) obj3;
                dy dyVar = ((qx) obj4).f42216a;
                if (tL_error == null) {
                    TLRPC.User user = dyVar.getMessagesController().getUser(Long.valueOf(dyVar.getUserConfig().getClientUserId()));
                    if (user == null) {
                        user = dyVar.getUserConfig().getCurrentUser();
                        if (user != null) {
                            dyVar.getMessagesController().putUser(user, false);
                        } else {
                            return;
                        }
                    } else {
                        dyVar.getUserConfig().setCurrentUser(user);
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f22404id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && dyVar.Y3 != null) {
                        i17 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i17).getPathToAttach(closestPhotoSizeWithSize, true);
                        i18 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                        FileLoader.getInstance(i18).getPathToAttach(dyVar.Y3, true).renameTo(pathToAttach2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(dyVar.Y3.volume_id);
                        sb2.append("_");
                        String l10 = aa.d.l(dyVar.Y3.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        z10 = z12;
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String l11 = aa.d.l(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i19 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                        imageLoader.replaceImageInCache(l10, l11, ImageLocation.getForUserOrChat(i19, user, 1), false);
                    } else {
                        z10 = z12;
                    }
                    if (closestVideoSizeWithSize != null && str6 != null) {
                        i16 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                        new File(str6).renameTo(FileLoader.getInstance(i16).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
                    } else if (closestPhotoSizeWithSize2 != null && dyVar.Z3 != null) {
                        i14 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                        File pathToAttach3 = FileLoader.getInstance(i14).getPathToAttach(closestPhotoSizeWithSize2, true);
                        i15 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                        FileLoader.getInstance(i15).getPathToAttach(dyVar.Z3, true).renameTo(pathToAttach3);
                    }
                    dyVar.getMessagesController().getDialogPhotos(user.f22527id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(user);
                    i21 = 0;
                    dyVar.getMessagesStorage().putUsersAndChats(arrayList5, null, false, true);
                    TLRPC.UserFull userFull = dyVar.getMessagesController().getUserFull(dyVar.getUserConfig().getClientUserId());
                    if (userFull != null) {
                        userFull.profile_photo = tL_photos_photo.photo;
                        dyVar.getMessagesStorage().updateUserInfo(userFull, false);
                    }
                } else {
                    z10 = z12;
                }
                dyVar.Y3 = null;
                dyVar.Z3 = null;
                NotificationCenter notificationCenter = dyVar.getNotificationCenter();
                int i25 = NotificationCenter.updateInterfaces;
                Object[] objArr = new Object[1];
                objArr[i21] = Integer.valueOf(MessagesController.UPDATE_MASK_ALL);
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i25, objArr);
                dyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[i21]);
                dyVar.getUserConfig().saveConfig(true);
                i12 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                MessagesController.getInstance(i12).removeSuggestion(0L, "USERPIC_SETUP");
                dyVar.U4();
                gc gcVar = dyVar.f37631a4;
                if (gcVar != null) {
                    xb xbVar = (xb) gcVar.f28733e;
                    j6 j6Var = xbVar.d;
                    if (z10) {
                        i13 = R.string.YourProfileVideoDone;
                    } else {
                        i13 = R.string.YourProfilePhotoDone;
                    }
                    j6Var.c(LocaleController.getString(i13), true, true);
                    xbVar.setProgress(1.0f);
                    db button = xbVar.getButton();
                    button.setScaleX(0.6f);
                    button.setScaleY(0.6f);
                    button.setAlpha(0.0f);
                    button.setVisibility(0);
                    ll.r(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), gr.h, 360L);
                    gc gcVar2 = dyVar.f37631a4;
                    gcVar2.f28737j = 5000;
                    gcVar2.i(false);
                    dyVar.f37631a4.i(true);
                    return;
                }
                return;
            case 19:
                co0.Z((co0) obj4, z12, (String) obj3, (String) obj2, (TL_account.updatePasswordSettings) obj5);
                return;
            case 20:
                co0.h0((co0) obj4, (TLRPC.TL_error) obj2, z12, (TLObject) obj5, (String) obj3);
                return;
            case 21:
                ag1.T((ag1) obj4, (TLObject) obj2, z12, (String) obj3, (TL_account.passwordInputSettings) obj5);
                return;
            case 22:
                pf.u uVar = (pf.u) obj4;
                ArrayList arrayList6 = uVar.f45790b;
                arrayList6.clear();
                arrayList6.addAll((ArrayList) obj3);
                int i26 = uVar.f45789a;
                MessagesController.getInstance(i26).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i26).putChats((ArrayList) obj5, true);
                NotificationCenter.getInstance(i26).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                uVar.f45791c = false;
                uVar.e(false, z12);
                return;
            default:
                a4.f((org.telegram.ui.ActionBar.o2) obj5, (Context) obj4, (b6) obj3, (l3) obj2, z12);
                return;
        }
    }

    public m(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i9) {
        this.f1868a = i9;
        this.d = obj;
        this.f1870c = obj2;
        this.f1871e = obj3;
        this.f1869b = z10;
        this.f1872f = obj4;
    }

    public m(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i9) {
        this.f1868a = i9;
        this.d = obj;
        this.f1870c = obj2;
        this.f1869b = z10;
        this.f1871e = obj3;
        this.f1872f = obj4;
    }

    public m(Object obj, TLObject tLObject, boolean z10, TLObject tLObject2, String str, int i9) {
        this.f1868a = i9;
        this.d = obj;
        this.f1871e = tLObject;
        this.f1869b = z10;
        this.f1872f = tLObject2;
        this.f1870c = str;
    }

    public m(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z10, int i9) {
        this.f1868a = i9;
        this.d = obj;
        this.f1871e = tL_error;
        this.f1872f = tLObject;
        this.f1870c = str;
        this.f1869b = z10;
    }

    public m(MessagesController messagesController, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_channels_editBanned tL_channels_editBanned, boolean z10) {
        this.f1868a = 5;
        this.d = messagesController;
        this.f1870c = tL_error;
        this.f1872f = o2Var;
        this.f1871e = tL_channels_editBanned;
        this.f1869b = z10;
    }

    public m(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j10, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f1868a = 0;
        this.d = payments_giveawayinfo;
        this.f1869b = z10;
        this.f1870c = str;
        this.f1871e = tL_messageMediaGiveaway;
        this.f1872f = o2Var;
    }

    public m(org.telegram.ui.ActionBar.o2 o2Var, Object obj, Object obj2, Object obj3, boolean z10, int i9) {
        this.f1868a = i9;
        this.f1872f = o2Var;
        this.d = obj;
        this.f1870c = obj2;
        this.f1871e = obj3;
        this.f1869b = z10;
    }

    public m(mt mtVar, boolean z10, gh.o oVar, String str, TextView textView) {
        this.f1868a = 15;
        this.d = mtVar;
        this.f1869b = z10;
        this.f1871e = oVar;
        this.f1870c = str;
        this.f1872f = textView;
    }

    public m(co0 co0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f1868a = 19;
        this.d = co0Var;
        this.f1869b = z10;
        this.f1870c = str;
        this.f1871e = str2;
        this.f1872f = updatepasswordsettings;
    }

    public m(ag1 ag1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f1868a = 21;
        this.d = ag1Var;
        this.f1871e = tLObject;
        this.f1869b = z10;
        this.f1870c = str;
        this.f1872f = passwordinputsettings;
    }
}
