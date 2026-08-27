package cg;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.TextView;
import hh.l7;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import lh.sb;
import lh.z7;
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
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.ea;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cg;
import org.telegram.ui.do0;
import org.telegram.ui.fe;
import org.telegram.ui.gy;
import org.telegram.ui.kt;
import org.telegram.ui.rn;
import org.telegram.ui.tx;
import org.telegram.ui.zf1;
import rh.b4;
import rh.m3;

public final class j implements Runnable {

    public final int f2726a;

    public final boolean f2727b;

    public final Object f2728c;
    public final Object d;

    public final Object f2729e;

    public final Object f2730f;

    public j(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f2726a = i10;
        this.d = obj;
        this.f2728c = obj2;
        this.f2729e = obj3;
        this.f2730f = obj4;
        this.f2727b = z10;
    }

    @Override
    public final void run() {
        Object chat;
        double d;
        int i10 = this.f2726a;
        int i11 = 1;
        int i12 = 0;
        boolean z10 = this.f2727b;
        Object obj = this.f2729e;
        Object obj2 = this.f2728c;
        Object obj3 = this.d;
        Object obj4 = this.f2730f;
        switch (i10) {
            case 0:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj3;
                String str = (String) obj2;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) obj;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj4;
                boolean z11 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                boolean z12 = this.f2727b;
                if (z11) {
                    r.d(z12, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, n2Var.getParentActivity(), n2Var.getResourceProvider());
                } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                    r.e(z12, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, n2Var.getParentActivity(), n2Var.getResourceProvider());
                }
                break;
            case 1:
                lh.s1 s1Var = (lh.s1) obj3;
                TLObject tLObject = (TLObject) obj;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = (TLRPC.TL_messages_getInlineBotResults) obj4;
                String str2 = (String) obj2;
                lh.u1 u1Var = s1Var.f16720s;
                ArrayList arrayList = u1Var.f16900n;
                if (s1Var.f16719r) {
                    if (!(tLObject instanceof TLRPC.messages_BotResults)) {
                        s1Var.d = ConnectionsManager.getInstance(((e3) u1Var.f16901r).currentAccount).sendRequest(tL_messages_getInlineBotResults, new l7(s1Var, str2, z10, i11));
                    } else {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        s1Var.h = messages_botresults.next_offset;
                        if (z10) {
                            arrayList.clear();
                        }
                        arrayList.size();
                        arrayList.addAll(messages_botresults.results);
                        s1Var.l();
                        u1Var.d.c(false);
                        s1Var.f16719r = false;
                    }
                    break;
                }
                break;
            case 2:
                sb sbVar = (sb) obj3;
                File file = (File) obj;
                z7 z7Var = (z7) obj4;
                try {
                    ((Bitmap) obj2).compress(Bitmap.CompressFormat.JPEG, z10 ? 95 : 99, new FileOutputStream(file));
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                AndroidUtilities.runOnUIThread(new j3.m(sbVar, z7Var, file, 17));
                break;
            case 3:
                ((FactCheckController) obj3).lambda$applyFactCheck$15((TLObject) obj2, (TLRPC.TL_textWithEntities) obj, z10, (org.telegram.ui.ActionBar.b2) obj4);
                break;
            case 4:
                ((MediaDataController) obj3).lambda$loadStickersByEmojiOrName$84((TLRPC.TL_error) obj, (TLObject) obj4, (String) obj2, z10);
                break;
            case 5:
                ((MessagesController) obj3).lambda$setParticipantBannedRole$91((TLRPC.TL_error) obj2, (org.telegram.ui.ActionBar.n2) obj4, (TLRPC.TL_channels_editBanned) obj, z10);
                break;
            case 6:
                ((MessagesStorage) obj3).lambda$putChannelViews$191((a0.h) obj2, (a0.h) obj, (a0.h) obj4, z10);
                break;
            case 7:
                ((MessagesStorage) obj3).lambda$replaceMessageIfExists$234((TLRPC.Message) obj2, z10, (ArrayList) obj, (ArrayList) obj4);
                break;
            case 8:
                ((SendMessagesHelper) obj3).lambda$sendEditRichMessageRequest$23((TLRPC.TL_messages_editMessage) obj2, (MessageObject) obj, (org.telegram.ui.ActionBar.n2) obj4, z10);
                break;
            case 9:
                ((SendMessagesHelper) obj3).lambda$performSendMessageRequest$80((TLRPC.Message) obj2, z10, (TLObject) obj, (SendMessagesHelper.DelayedMessage) obj4);
                break;
            case 10:
                ((UnconfirmedAuthController) obj3).lambda$updateList$7((boolean[]) obj2, (ArrayList) obj, z10, (Utilities.Callback) obj4);
                break;
            case 11:
                ((CameraController) obj3).lambda$recordVideo$12((CameraController.ICameraView) obj2, (File) obj, z10, (Runnable) obj4);
                break;
            case 12:
                fe feVar = (fe) obj3;
                TLObject tLObject2 = (TLObject) obj;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj4;
                if (((TLRPC.TL_error) obj2) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.E = password;
                    TwoStepVerificationActivity.m0(password);
                    feVar.b0(z10, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                }
                break;
            case 13:
                rn rnVar = (rn) obj3;
                TLObject tLObject3 = (TLObject) obj;
                cg cgVar = (cg) obj4;
                ((we.d) obj2).b();
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    rnVar.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    rnVar.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        chat = rnVar.getMessagesController().getUser(Long.valueOf(peerDialogId));
                    } else if (peerDialogId < 0) {
                        chat = rnVar.getMessagesController().getChat(Long.valueOf(-peerDialogId));
                    } else {
                        chat = null;
                    }
                } else {
                    chat = null;
                }
                cgVar.run(chat, Boolean.valueOf(z10));
                break;
            case 14:
                ea eaVar = (ea) obj3;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj4;
                if (TextUtils.equals(eaVar.f27998a, (String) obj2)) {
                    eaVar.f28002f = null;
                    Bitmap bitmap3 = eaVar.f27999b;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    eaVar.f27999b = bitmap;
                    Runnable runnable = eaVar.f28001e;
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    bitmap.recycle();
                }
                if (z10) {
                    bitmap2.recycle();
                }
                break;
            case 15:
                hh.o oVar = (hh.o) obj;
                String str3 = (String) obj2;
                TextView textView = (TextView) obj4;
                ClipboardManager clipboardManager = (ClipboardManager) ((lt) obj3).getContext().getSystemService("clipboard");
                i11 = (z10 && (TextUtils.isEmpty(oVar.getText()) || TextUtils.equals(oVar.getText().toString(), str3)) && clipboardManager != null && clipboardManager.hasPrimaryClip()) ? 1 : 0;
                rl.o(textView.animate().alpha(i11 != 0 ? 1.0f : 0.0f).scaleX(i11 != 0 ? 1.0f : 0.7f).scaleY(i11 != 0 ? 1.0f : 0.7f), er.h, 300L);
                break;
            case 16:
                fy fyVar = (fy) obj3;
                String str4 = (String) obj2;
                String str5 = (String) obj;
                TLObject tLObject4 = (TLObject) obj4;
                fyVar.f28465a.remove(str5);
                yy yyVar = fyVar.f28466b;
                cy cyVar = yyVar.f34995f0;
                HashMap map = yyVar.f35001h0;
                boolean z13 = cyVar.v;
                boolean z14 = this.f2727b;
                if (z13 && cyVar.f27568w.equals(str4)) {
                    yyVar.f34995f0.E(str4, "", false, true, z14, str5, tLObject4);
                    break;
                } else if (z14 && (!(tLObject4 instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject4).results.isEmpty())) {
                    fyVar.a(str4, false);
                    break;
                } else if ((tLObject4 instanceof TLRPC.messages_BotResults) && !map.containsKey(str5)) {
                    map.put(str5, (TLRPC.messages_BotResults) tLObject4);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj4;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
                TLRPC.Document document = (TLRPC.Document) obj2;
                rn rnVar2 = (rn) obj;
                File fileW = z7.w(n2Var2.getCurrentAccount(), "webp");
                int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                float f10 = 512;
                float fFloor = devicePerformanceClass != 0 ? devicePerformanceClass != 2 ? 2560 : 3840 : 1280;
                double d10 = (fFloor * f10) / f10;
                if (((float) Math.floor(d10)) > fFloor) {
                    fFloor = (float) Math.floor(d10);
                }
                float f11 = fFloor;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                try {
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(fileW));
                } catch (Throwable th) {
                    FileLog.e(th);
                }
                bitmapCreateBitmap.recycle();
                ArrayList arrayList2 = new ArrayList();
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, fileW.getAbsolutePath(), 0, false, 0, 0, 0L);
                arrayList2.add(photoEntry);
                VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                mediaEntity.type = (byte) 0;
                mediaEntity.parentObject = tL_messages_stickerSet;
                mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true).getAbsolutePath();
                mediaEntity.f19646x = 0.5f - ((Math.min(512, 512) / f10) / 2.0f);
                mediaEntity.f19647y = 0.5f - ((Math.min(512, 512) / f10) / 2.0f);
                mediaEntity.width = Math.min(512, 512) / f10;
                mediaEntity.height = Math.min(512, 512) / f10;
                int iFloor = (int) Math.floor(((double) f11) * 0.5d);
                mediaEntity.viewWidth = iFloor;
                mediaEntity.viewHeight = iFloor;
                mediaEntity.scale = 2.0f;
                mediaEntity.document = document;
                if (MessageObject.isAnimatedStickerDocument(document, true) || MessageObject.isVideoStickerDocument(document)) {
                    mediaEntity.subType = (byte) ((MessageObject.isAnimatedStickerDocument(document, true) ? (byte) 1 : (byte) 4) | mediaEntity.subType);
                }
                ArrayList<VideoEditedInfo.MediaEntity> arrayList3 = new ArrayList<>();
                photoEntry.mediaEntities = arrayList3;
                arrayList3.add(mediaEntity);
                photoEntry.averageDuration = 3000L;
                if (MessageObject.isAnimatedStickerDocument(document, true)) {
                    File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
                    if (pathToAttach != null) {
                        try {
                            RLottieNative rLottieNativeA = RLottieNative.a(pathToAttach.getAbsolutePath(), null, 0, 0, null, false, null, false, 0, null);
                            if (rLottieNativeA != null) {
                                int[] iArr = rLottieNativeA.f26461a;
                                int i13 = iArr[0];
                                int i14 = iArr[1];
                                rLottieNativeA.d();
                                d = ((double) i13) / ((double) i14);
                            } else {
                                d = 0.0d;
                            }
                            photoEntry.averageDuration = (long) (d * 1000.0d);
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                } else if (MessageObject.isVideoStickerDocument(document)) {
                    photoEntry.averageDuration = (long) (MessageObject.getDocumentDuration(document) * 1000.0d);
                }
                PhotoViewer.t1().K2(n2Var2.getParentActivity(), null, n2Var2.getResourceProvider());
                PhotoViewer.t1().f2(arrayList2, 0, 11, false, new vw0(), rnVar2);
                PhotoViewer.t1().X0(document, z10 ? document : null, true, null);
                kt.q().T = z10 ? tL_messages_stickerSet : null;
                break;
            case 18:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                TLObject tLObject5 = (TLObject) obj4;
                String str6 = (String) obj2;
                gy gyVar = ((tx) obj3).f43026a;
                if (tL_error == null) {
                    TLRPC.User user = gyVar.getMessagesController().getUser(Long.valueOf(gyVar.getUserConfig().getClientUserId()));
                    if (user == null) {
                        user = gyVar.getUserConfig().getCurrentUser();
                        if (user != null) {
                            gyVar.getMessagesController().putUser(user, false);
                        }
                    } else {
                        gyVar.getUserConfig().setCurrentUser(user);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    ArrayList<TLRPC.PhotoSize> arrayList4 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList4, 150);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList4, 800);
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
                    if (closestPhotoSizeWithSize != null && gyVar.Y3 != null) {
                        FileLoader.getInstance(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount).getPathToAttach(gyVar.Y3, true).renameTo(FileLoader.getInstance(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(gyVar.Y3.volume_id);
                        sb2.append("_");
                        String strK = a9.p.k(gyVar.Y3.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        ImageLoader.getInstance().replaceImageInCache(strK, a9.p.k(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount, user, 1), false);
                    }
                    if (closestVideoSizeWithSize != null && str6 != null) {
                        new File(str6).renameTo(FileLoader.getInstance(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
                    } else if (closestPhotoSizeWithSize2 != null && gyVar.Z3 != null) {
                        FileLoader.getInstance(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount).getPathToAttach(gyVar.Z3, true).renameTo(FileLoader.getInstance(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    gyVar.getMessagesController().getDialogPhotos(user.f22527id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(user);
                    i12 = 0;
                    gyVar.getMessagesStorage().putUsersAndChats(arrayList5, null, false, true);
                    TLRPC.UserFull userFull = gyVar.getMessagesController().getUserFull(gyVar.getUserConfig().getClientUserId());
                    if (userFull != null) {
                        userFull.profile_photo = tL_photos_photo.photo;
                        gyVar.getMessagesStorage().updateUserInfo(userFull, false);
                    }
                } else {
                    z10 = z10;
                }
                gyVar.Y3 = null;
                gyVar.Z3 = null;
                NotificationCenter notificationCenter = gyVar.getNotificationCenter();
                int i15 = NotificationCenter.updateInterfaces;
                Object[] objArr = new Object[1];
                objArr[i12] = Integer.valueOf(MessagesController.UPDATE_MASK_ALL);
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i15, objArr);
                gyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[i12]);
                gyVar.getUserConfig().saveConfig(true);
                MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
                gyVar.U4();
                ec ecVar = gyVar.f38500a4;
                if (ecVar != null) {
                    vb vbVar = (vb) ecVar.f28016e;
                    vbVar.d.c(LocaleController.getString(z10 ? R.string.YourProfileVideoDone : R.string.YourProfilePhotoDone), true, true);
                    vbVar.setProgress(1.0f);
                    bb button = vbVar.getButton();
                    button.setScaleX(0.6f);
                    button.setScaleY(0.6f);
                    button.setAlpha(0.0f);
                    button.setVisibility(0);
                    rl.o(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), er.h, 360L);
                    ec ecVar2 = gyVar.f38500a4;
                    ecVar2.f28020j = 5000;
                    ecVar2.i(false);
                    gyVar.f38500a4.i(true);
                }
                break;
            case 19:
                do0.a0((do0) obj3, z10, (String) obj2, (String) obj, (TL_account.updatePasswordSettings) obj4);
                break;
            case 20:
                do0.i0((do0) obj3, (TLRPC.TL_error) obj, z10, (TLObject) obj4, (String) obj2);
                break;
            case 21:
                zf1.U((zf1) obj3, (TLObject) obj, z10, (String) obj2, (TL_account.passwordInputSettings) obj4);
                break;
            case 22:
                qf.v vVar = (qf.v) obj3;
                ArrayList arrayList6 = vVar.f46466b;
                arrayList6.clear();
                arrayList6.addAll((ArrayList) obj2);
                int i16 = vVar.f46465a;
                MessagesController.getInstance(i16).putUsers((ArrayList) obj, true);
                MessagesController.getInstance(i16).putChats((ArrayList) obj4, true);
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                vVar.f46467c = false;
                vVar.e(false, z10);
                break;
            default:
                b4.f((org.telegram.ui.ActionBar.n2) obj4, (Context) obj3, (c6) obj2, (m3) obj, z10);
                break;
        }
    }

    public j(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.f2726a = i10;
        this.d = obj;
        this.f2728c = obj2;
        this.f2729e = obj3;
        this.f2727b = z10;
        this.f2730f = obj4;
    }

    public j(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i10) {
        this.f2726a = i10;
        this.d = obj;
        this.f2728c = obj2;
        this.f2727b = z10;
        this.f2729e = obj3;
        this.f2730f = obj4;
    }

    public j(Object obj, TLObject tLObject, boolean z10, TLObject tLObject2, String str, int i10) {
        this.f2726a = i10;
        this.d = obj;
        this.f2729e = tLObject;
        this.f2727b = z10;
        this.f2730f = tLObject2;
        this.f2728c = str;
    }

    public j(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z10, int i10) {
        this.f2726a = i10;
        this.d = obj;
        this.f2729e = tL_error;
        this.f2730f = tLObject;
        this.f2728c = str;
        this.f2727b = z10;
    }

    public j(MessagesController messagesController, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_editBanned tL_channels_editBanned, boolean z10) {
        this.f2726a = 5;
        this.d = messagesController;
        this.f2728c = tL_error;
        this.f2730f = n2Var;
        this.f2729e = tL_channels_editBanned;
        this.f2727b = z10;
    }

    public j(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j10, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f2726a = 0;
        this.d = payments_giveawayinfo;
        this.f2727b = z10;
        this.f2728c = str;
        this.f2729e = tL_messageMediaGiveaway;
        this.f2730f = n2Var;
    }

    public j(org.telegram.ui.ActionBar.n2 n2Var, Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f2726a = i10;
        this.f2730f = n2Var;
        this.d = obj;
        this.f2728c = obj2;
        this.f2729e = obj3;
        this.f2727b = z10;
    }

    public j(lt ltVar, boolean z10, hh.o oVar, String str, TextView textView) {
        this.f2726a = 15;
        this.d = ltVar;
        this.f2727b = z10;
        this.f2729e = oVar;
        this.f2728c = str;
        this.f2730f = textView;
    }

    public j(do0 do0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f2726a = 19;
        this.d = do0Var;
        this.f2727b = z10;
        this.f2728c = str;
        this.f2729e = str2;
        this.f2730f = updatepasswordsettings;
    }

    public j(zf1 zf1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f2726a = 21;
        this.d = zf1Var;
        this.f2729e = tLObject;
        this.f2727b = z10;
        this.f2728c = str;
        this.f2730f = passwordinputsettings;
    }
}
