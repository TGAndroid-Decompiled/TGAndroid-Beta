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
import org.telegram.messenger.rk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.sy;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ih1;
import org.telegram.ui.iy;
import org.telegram.ui.ke;
import org.telegram.ui.kg;
import org.telegram.ui.st;
import org.telegram.ui.uy;
import org.telegram.ui.xo0;
import org.telegram.ui.zn;
public final class u1 implements Runnable {
    public final int f5599a;
    public final boolean f5600b;
    public final Object f5601c;
    public final Object d;
    public final Object e;
    public final Object f5602f;

    public u1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f5599a = i10;
        this.f5601c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f5602f = obj4;
        this.f5600b = z10;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        a3.z a2;
        Object obj;
        boolean z10;
        float f7;
        float f10;
        float f11;
        int i12;
        byte b10;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        double d;
        double d10;
        int i13;
        int i14;
        int i15;
        TLRPC.VideoSize closestVideoSizeWithSize;
        TLRPC.User user;
        boolean z11;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        switch (this.f5599a) {
            case 0:
                w1 w1Var = (w1) this.f5601c;
                TLObject tLObject = (TLObject) this.d;
                boolean z12 = this.f5600b;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = (TLRPC.TL_messages_getInlineBotResults) this.e;
                String str = (String) this.f5602f;
                z1 z1Var = w1Var.f5685s;
                ArrayList arrayList = z1Var.f5858n;
                if (w1Var.f5684r) {
                    if (!(tLObject instanceof TLRPC.messages_BotResults)) {
                        i10 = ((org.telegram.ui.ActionBar.f3) z1Var.f5859r).currentAccount;
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
                    w1Var.f5684r = false;
                    return;
                }
                return;
            case 1:
                oc ocVar = (oc) this.f5601c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z13 = this.f5600b;
                File file = (File) this.e;
                o8 o8Var = (o8) this.f5602f;
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (z13) {
                        i11 = 95;
                    } else {
                        i11 = 99;
                    }
                    bitmap.compress(compressFormat, i11, new FileOutputStream(file));
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new a3.k0(ocVar, o8Var, file, 19));
                return;
            case 2:
                hg.y yVar = (hg.y) this.f5601c;
                boolean z14 = this.f5600b;
                ArrayList arrayList2 = yVar.f10484b;
                arrayList2.clear();
                arrayList2.addAll((ArrayList) this.d);
                int i22 = yVar.f10483a;
                MessagesController.getInstance(i22).putUsers((ArrayList) this.e, true);
                MessagesController.getInstance(i22).putChats((ArrayList) this.f5602f, true);
                NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                yVar.f10485c = false;
                yVar.e(false, z14);
                return;
            case 3:
                ii.j4.f((org.telegram.ui.ActionBar.n2) this.f5601c, (Context) this.d, (org.telegram.ui.ActionBar.f6) this.e, (ii.t3) this.f5602f, this.f5600b);
                return;
            case 4:
                ki.q0 q0Var = (ki.q0) this.f5601c;
                boolean z15 = this.f5600b;
                ki.q qVar = (ki.q) this.d;
                ki.m0 m0Var = (ki.m0) this.e;
                File file2 = (File) this.f5602f;
                q0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    q0Var.f();
                    long j3 = q0Var.D;
                    if (z15) {
                        synchronized (qVar) {
                            qVar.c();
                        }
                        q0Var.f();
                        q0Var.j(m0Var, 1);
                        File file3 = qVar.f13816a;
                        q0Var.c(true);
                        j3 = w7.k.a(file2, q0Var.O, q0Var.F, q0Var.G, true).f203b;
                        q0Var.f13836l.b("resume trim remux completed: requested=" + q0Var.F + ".." + q0Var.G + ", actualStartMs=" + a2.f202a + ", retainedDurationMs=" + j3 + ", outputSize=" + q0Var.O.f13816a.length() + ", elapsedMs=" + ki.q0.e(nanoTime));
                        w7.k.c(file3);
                    }
                    w7.k.c(file2);
                    q0Var.f();
                    q0Var.P = null;
                    if (!z15) {
                        q0Var.f13836l.b("resume prepared without remux: retainedDurationMs=" + j3 + ", elapsedMs=" + ki.q0.e(nanoTime));
                    }
                    q0Var.h.post(new ki.a0(q0Var, j3, 0));
                    return;
                } catch (Exception e7) {
                    q0Var.h.post(new ki.z(q0Var, e7, 1));
                    return;
                }
            case 5:
                ((FactCheckController) this.f5601c).lambda$applyFactCheck$15((TLObject) this.d, (TLRPC.TL_textWithEntities) this.e, this.f5600b, (org.telegram.ui.ActionBar.b2) this.f5602f);
                return;
            case 6:
                ((MediaDataController) this.f5601c).lambda$loadStickersByEmojiOrName$84((TLRPC.TL_error) this.e, (TLObject) this.d, (String) this.f5602f, this.f5600b);
                return;
            case 7:
                ((MessagesController) this.f5601c).lambda$setParticipantBannedRole$91((TLRPC.TL_error) this.d, (org.telegram.ui.ActionBar.n2) this.e, (TLRPC.TL_channels_editBanned) this.f5602f, this.f5600b);
                return;
            case 8:
                ((MessagesStorage) this.f5601c).lambda$putChannelViews$191((a0.i) this.d, (a0.i) this.e, (a0.i) this.f5602f, this.f5600b);
                return;
            case 9:
                ((MessagesStorage) this.f5601c).lambda$replaceMessageIfExists$234((TLRPC.Message) this.d, this.f5600b, (ArrayList) this.e, (ArrayList) this.f5602f);
                return;
            case 10:
                ((SendMessagesHelper) this.f5601c).lambda$sendEditRichMessageRequest$23((TLRPC.TL_messages_editMessage) this.d, (MessageObject) this.e, (org.telegram.ui.ActionBar.n2) this.f5602f, this.f5600b);
                return;
            case 11:
                ((SendMessagesHelper) this.f5601c).lambda$performSendMessageRequest$80((TLRPC.Message) this.e, this.f5600b, (TLObject) this.d, (SendMessagesHelper.DelayedMessage) this.f5602f);
                return;
            case 12:
                ((UnconfirmedAuthController) this.f5601c).lambda$updateList$7((boolean[]) this.d, (ArrayList) this.e, this.f5600b, (Utilities.Callback) this.f5602f);
                return;
            case 13:
                ((CameraController) this.f5601c).lambda$recordVideo$12((CameraController.ICameraView) this.d, (File) this.e, this.f5600b, (Runnable) this.f5602f);
                return;
            case 14:
                ke keVar = (ke) this.f5601c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f5602f;
                boolean z16 = this.f5600b;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    keVar.b0(z16, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 15:
                zn znVar = (zn) this.f5601c;
                TLObject tLObject3 = (TLObject) this.d;
                kg kgVar = (kg) this.f5602f;
                boolean z17 = this.f5600b;
                ((nf.e) this.e).b();
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    znVar.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    znVar.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    int i23 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
                    if (i23 >= 0) {
                        obj = znVar.getMessagesController().getUser(Long.valueOf(peerDialogId));
                    } else if (i23 < 0) {
                        obj = znVar.getMessagesController().getChat(Long.valueOf(-peerDialogId));
                    }
                    kgVar.run(obj, Boolean.valueOf(z17));
                    return;
                }
                obj = null;
                kgVar.run(obj, Boolean.valueOf(z17));
                return;
            case 16:
                org.telegram.ui.Components.na naVar = (org.telegram.ui.Components.na) this.f5601c;
                Bitmap bitmap2 = (Bitmap) this.d;
                boolean z18 = this.f5600b;
                Bitmap bitmap3 = (Bitmap) this.e;
                if (TextUtils.equals(naVar.f26716a, (String) this.f5602f)) {
                    naVar.f26719f = null;
                    Bitmap bitmap4 = naVar.f26717b;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                    }
                    naVar.f26717b = bitmap2;
                    Runnable runnable = naVar.e;
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    bitmap2.recycle();
                }
                if (z18) {
                    bitmap3.recycle();
                    return;
                }
                return;
            case 17:
                boolean z19 = this.f5600b;
                fi.o oVar = (fi.o) this.d;
                String str2 = (String) this.f5602f;
                TextView textView = (TextView) this.e;
                ClipboardManager clipboardManager = (ClipboardManager) ((bu) this.f5601c).getContext().getSystemService("clipboard");
                if (z19 && ((TextUtils.isEmpty(oVar.getText()) || TextUtils.equals(oVar.getText().toString(), str2)) && clipboardManager != null && clipboardManager.hasPrimaryClip())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ViewPropertyAnimator animate = textView.animate();
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f7);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.7f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f10);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.7f;
                }
                rk.s(scaleX.scaleY(f11), qr.h, 300L);
                return;
            case 18:
                sy syVar = (sy) this.f5601c;
                String str3 = (String) this.f5602f;
                boolean z20 = this.f5600b;
                String str4 = (String) this.e;
                TLObject tLObject4 = (TLObject) this.d;
                syVar.f28334a.remove(str4);
                kz kzVar = syVar.f28335b;
                py pyVar = kzVar.f25879j0;
                HashMap hashMap = kzVar.f25885l0;
                if (pyVar.v && pyVar.f27445w.equals(str3)) {
                    kzVar.f25879j0.E(str3, "", false, true, z20, str4, tLObject4);
                    return;
                } else if (z20 && (!(tLObject4 instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject4).results.isEmpty())) {
                    syVar.a(str3, false);
                    return;
                } else if ((tLObject4 instanceof TLRPC.messages_BotResults) && !hashMap.containsKey(str4)) {
                    hashMap.put(str4, (TLRPC.messages_BotResults) tLObject4);
                    return;
                } else {
                    return;
                }
            case 19:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f5601c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.d;
                TLRPC.Document document2 = (TLRPC.Document) this.e;
                zn znVar2 = (zn) this.f5602f;
                boolean z21 = this.f5600b;
                File w10 = o8.w(n2Var.getCurrentAccount(), "webp");
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
                double d11 = (f13 * f12) / f12;
                if (((float) Math.floor(d11)) > f13) {
                    f13 = (float) Math.floor(d11);
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
                mediaEntity.f15860x = 0.5f - ((Math.min(512, 512) / f12) / 2.0f);
                mediaEntity.f15861y = 0.5f - ((Math.min(512, 512) / f12) / 2.0f);
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
                            RLottieNative a10 = RLottieNative.a(pathToAttach.getAbsolutePath(), null, null, null, 0, null);
                            if (a10 != null) {
                                int[] iArr = a10.f22359a;
                                int i24 = iArr[0];
                                int i25 = iArr[1];
                                a10.d();
                                d = 1000.0d;
                                d10 = i24 / i25;
                            } else {
                                d = 1000.0d;
                                d10 = 0.0d;
                            }
                            photoEntry.averageDuration = (long) (d10 * d);
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                } else if (MessageObject.isVideoStickerDocument(document2)) {
                    photoEntry.averageDuration = (long) (MessageObject.getDocumentDuration(document2) * 1000.0d);
                }
                PhotoViewer.t1().J2(n2Var.getParentActivity(), null, n2Var.getResourceProvider());
                PhotoViewer.t1().f2(arrayList3, 0, 11, false, new Object(), znVar2);
                PhotoViewer t12 = PhotoViewer.t1();
                if (z21) {
                    document = document2;
                } else {
                    document = null;
                }
                t12.X0(document2, document, true, null);
                st q6 = st.q();
                if (z21) {
                    tL_messages_stickerSet = tL_messages_stickerSet2;
                } else {
                    tL_messages_stickerSet = null;
                }
                q6.T = tL_messages_stickerSet;
                return;
            case 20:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject5 = (TLObject) this.d;
                String str5 = (String) this.f5602f;
                boolean z22 = this.f5600b;
                uy uyVar = ((iy) this.f5601c).f34722a;
                if (tL_error2 == null) {
                    TLRPC.User user2 = uyVar.getMessagesController().getUser(Long.valueOf(uyVar.getUserConfig().getClientUserId()));
                    if (user2 == null) {
                        user2 = uyVar.getUserConfig().getCurrentUser();
                        if (user2 != null) {
                            uyVar.getMessagesController().putUser(user2, false);
                        } else {
                            return;
                        }
                    } else {
                        uyVar.getUserConfig().setCurrentUser(user2);
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
                    user2.photo = tL_userProfilePhoto;
                    TLRPC.User user3 = user2;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f18367id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && uyVar.f38265b4 != null) {
                        i19 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i19).getPathToAttach(closestPhotoSizeWithSize, true);
                        i20 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                        FileLoader.getInstance(i20).getPathToAttach(uyVar.f38265b4, true).renameTo(pathToAttach2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(uyVar.f38265b4.volume_id);
                        sb2.append("_");
                        String n10 = a4.a.n(uyVar.f38265b4.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String n11 = a4.a.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i21 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                        user = user3;
                        z11 = true;
                        imageLoader.replaceImageInCache(n10, n11, ImageLocation.getForUserOrChat(i21, user, 1), false);
                    } else {
                        user = user3;
                        z11 = true;
                    }
                    if (closestVideoSizeWithSize != null && str5 != null) {
                        i18 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                        new File(str5).renameTo(FileLoader.getInstance(i18).getPathToAttach(closestVideoSizeWithSize, "mp4", z11));
                    } else if (closestPhotoSizeWithSize2 != null && uyVar.f38271c4 != null) {
                        i16 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                        File pathToAttach3 = FileLoader.getInstance(i16).getPathToAttach(closestPhotoSizeWithSize2, true);
                        i17 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                        FileLoader.getInstance(i17).getPathToAttach(uyVar.f38271c4, true).renameTo(pathToAttach3);
                    }
                    uyVar.getMessagesController().getDialogPhotos(user.f18490id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(user);
                    i13 = 0;
                    uyVar.getMessagesStorage().putUsersAndChats(arrayList6, null, false, true);
                    TLRPC.UserFull userFull = uyVar.getMessagesController().getUserFull(uyVar.getUserConfig().getClientUserId());
                    if (userFull != null) {
                        userFull.profile_photo = tL_photos_photo.photo;
                        uyVar.getMessagesStorage().updateUserInfo(userFull, false);
                    }
                } else {
                    i13 = 0;
                }
                uyVar.f38265b4 = null;
                uyVar.f38271c4 = null;
                NotificationCenter notificationCenter = uyVar.getNotificationCenter();
                int i26 = NotificationCenter.updateInterfaces;
                Object[] objArr = new Object[1];
                objArr[i13] = Integer.valueOf(MessagesController.UPDATE_MASK_ALL);
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i26, objArr);
                uyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[i13]);
                uyVar.getUserConfig().saveConfig(true);
                i14 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                MessagesController.getInstance(i14).removeSuggestion(0L, "USERPIC_SETUP");
                uyVar.U4();
                org.telegram.ui.Components.pc pcVar = uyVar.f38276d4;
                if (pcVar != null) {
                    org.telegram.ui.Components.gc gcVar = (org.telegram.ui.Components.gc) pcVar.e;
                    org.telegram.ui.Components.o6 o6Var = gcVar.d;
                    if (z22) {
                        i15 = R.string.YourProfileVideoDone;
                    } else {
                        i15 = R.string.YourProfilePhotoDone;
                    }
                    o6Var.c(LocaleController.getString(i15), true, true);
                    gcVar.setProgress(1.0f);
                    org.telegram.ui.Components.lb button = gcVar.getButton();
                    button.setScaleX(0.6f);
                    button.setScaleY(0.6f);
                    button.setAlpha(0.0f);
                    button.setVisibility(0);
                    rk.s(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), qr.h, 360L);
                    org.telegram.ui.Components.pc pcVar2 = uyVar.f38276d4;
                    pcVar2.f27311j = 5000;
                    pcVar2.i(false);
                    uyVar.f38276d4.i(true);
                    return;
                }
                return;
            case 21:
                xo0.a0((xo0) this.f5601c, this.f5600b, (String) this.f5602f, (String) this.d, (TL_account.updatePasswordSettings) this.e);
                return;
            case 22:
                xo0.i0((xo0) this.f5601c, (TLRPC.TL_error) this.e, this.f5600b, (TLObject) this.d, (String) this.f5602f);
                return;
            case 23:
                ih1.U((ih1) this.f5601c, (TLObject) this.d, this.f5600b, (String) this.f5602f, (TL_account.passwordInputSettings) this.e);
                return;
            default:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) this.f5601c;
                boolean z23 = this.f5600b;
                String str6 = (String) this.f5602f;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.e;
                if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                    tg.i.d(z23, str6, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, n2Var2.getParentActivity(), n2Var2.getResourceProvider());
                    return;
                } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                    tg.i.e(z23, str6, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, n2Var2.getParentActivity(), n2Var2.getResourceProvider());
                    return;
                } else {
                    return;
                }
        }
    }

    public u1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.f5599a = i10;
        this.f5601c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f5600b = z10;
        this.f5602f = obj4;
    }

    public u1(Object obj, Object obj2, TLObject tLObject, Object obj3, boolean z10, int i10) {
        this.f5599a = i10;
        this.f5601c = obj;
        this.e = obj2;
        this.d = tLObject;
        this.f5602f = obj3;
        this.f5600b = z10;
    }

    public u1(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i10) {
        this.f5599a = i10;
        this.f5601c = obj;
        this.d = obj2;
        this.f5600b = z10;
        this.e = obj3;
        this.f5602f = obj4;
    }

    public u1(ki.q0 q0Var, boolean z10, ki.q qVar, ki.m0 m0Var, File file) {
        this.f5599a = 4;
        this.f5601c = q0Var;
        this.f5600b = z10;
        this.d = qVar;
        this.e = m0Var;
        this.f5602f = file;
    }

    public u1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, boolean z10, TLObject tLObject2, Object obj, int i10) {
        this.f5599a = i10;
        this.f5601c = notificationCenterDelegate;
        this.e = tLObject;
        this.f5600b = z10;
        this.d = tLObject2;
        this.f5602f = obj;
    }

    public u1(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j3, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f5599a = 24;
        this.f5601c = payments_giveawayinfo;
        this.f5600b = z10;
        this.f5602f = str;
        this.d = tL_messageMediaGiveaway;
        this.e = n2Var;
    }

    public u1(org.telegram.ui.Components.na naVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.f5599a = 16;
        this.f5601c = naVar;
        this.f5602f = str;
        this.d = bitmap;
        this.f5600b = z10;
        this.e = bitmap2;
    }

    public u1(bu buVar, boolean z10, fi.o oVar, String str, TextView textView) {
        this.f5599a = 17;
        this.f5601c = buVar;
        this.f5600b = z10;
        this.d = oVar;
        this.f5602f = str;
        this.e = textView;
    }

    public u1(sy syVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.f5599a = 18;
        this.f5601c = syVar;
        this.f5602f = str;
        this.f5600b = z10;
        this.e = str2;
        this.d = tLObject;
    }

    public u1(xo0 xo0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f5599a = 21;
        this.f5601c = xo0Var;
        this.f5600b = z10;
        this.f5602f = str;
        this.d = str2;
        this.e = updatepasswordsettings;
    }

    public u1(ih1 ih1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f5599a = 23;
        this.f5601c = ih1Var;
        this.d = tLObject;
        this.f5600b = z10;
        this.f5602f = str;
        this.e = passwordinputsettings;
    }
}
