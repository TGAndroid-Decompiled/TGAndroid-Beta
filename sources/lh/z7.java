package lh;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.MediaStore;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.RLottieNative;

public final class z7 {
    public String A;
    public int A0;
    public String B;
    public int B0;
    public long C;
    public CharSequence C0;
    public long D;
    public float E;
    public o9 E0;
    public long H;
    public boolean H0;
    public long I;
    public long J;
    public long J0;
    public boolean K;
    public File L;
    public TLRPC.InputMedia L0;
    public boolean M;
    public Bitmap M0;
    public String N;
    public File N0;
    public Bitmap O;
    public File O0;
    public File P0;
    public int Q;
    public File Q0;
    public int R;
    public File R0;
    public u S;
    public ArrayList T;
    public ArrayList T0;
    public List U0;
    public ArrayList V0;
    public File W0;
    public long X;
    public File X0;
    public boolean Y;
    public File Y0;
    public float Z;
    public File Z0;

    public MediaController.SavedFilterState f17195a1;

    public long f17196b;

    public boolean f17197b0;

    public Bitmap f17198b1;

    public boolean f17199c;

    public TLRPC.Document f17200c0;

    public boolean f17201c1;
    public long d;

    public gh.i f17202d0;

    public y7 f17203d1;

    public long f17204e;

    public int f17207f;

    public boolean f17208f0;

    public boolean f17209g;

    public Bitmap f17210g0;
    public boolean h;

    public long f17211h0;

    public boolean f17214j;

    public boolean f17216k;

    public int f17217k0;

    public boolean f17218l;

    public int f17219l0;

    public ArrayList f17220m;
    public MediaController.CropState m0;

    public boolean f17221n;

    public boolean f17223o;

    public File f17224o0;

    public SpannableStringBuilder f17225p;

    public String f17226p0;

    public TLRPC.Peer f17227q;

    public long f17228q0;

    public int f17229r;

    public long f17230r0;

    public String f17231s;

    public float f17232s0;

    public TLRPC.MessageMedia f17233t;

    public boolean f17235u;
    public ArrayList v;

    public TLRPC.InputPeer f17237v0;

    public boolean f17238w;

    public HashSet f17239w0;

    public TLRPC.TL_error f17240x;

    public Drawable f17241x0;

    public String f17242y;

    public TLRPC.InputDocument f17244z;

    public final int f17193a = UserConfig.selectedAccount;

    public double f17212i = -1.0d;
    public float F = 1.0f;
    public float G = 1.0f;
    public float P = 1.0f;
    public boolean U = false;
    public float V = 0.0f;
    public float W = 1.0f;

    public float f17194a0 = 1.0f;

    public long f17205e0 = -1;

    public int f17213i0 = 720;

    public int f17215j0 = 1280;

    public final Matrix f17222n0 = new Matrix();

    public float f17234t0 = 1.0f;

    public float f17236u0 = 1.0f;

    public boolean f17243y0 = org.telegram.ui.ActionBar.g6.I.q();

    public long f17245z0 = Long.MIN_VALUE;
    public boolean D0 = true;
    public final ArrayList F0 = new ArrayList();
    public boolean G0 = true;
    public int I0 = 86400;
    public String K0 = "";
    public long S0 = 5000;

    public int f17206e1 = 0;

    public static void C(BitmapFactory.Options options, int i10) {
        Runtime runtime = Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i11 = options.outWidth;
        int i12 = options.outHeight;
        if (((long) (i11 * i12)) * 8 > jMaxMemory || Math.max(i11, i12) > 4200 || SharedConfig.getDevicePerformanceClass() <= 0) {
            options.inScaled = true;
            options.inDensity = options.outWidth;
            options.inTargetDensity = i10;
        }
    }

    public static Boolean D(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.Peer peer;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return null;
        }
        TLRPC.Chat chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(message.peer_id)));
        if ((chat == null || !chat.noforwards) && ChatObject.isChannelAndNotMegaGroup(chat)) {
            return Boolean.FALSE;
        }
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        if (messageFwdHeader != null && (peer = messageFwdHeader.from_id) != null && (messageFwdHeader.flags & 4) != 0) {
            long peerDialogId = DialogObject.getPeerDialogId(peer);
            TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
            if (peerDialogId < 0 && ((chat2 == null || !chat2.noforwards) && ChatObject.isChannelAndNotMegaGroup(chat2))) {
                return Boolean.TRUE;
            }
        }
        return null;
    }

    public static z7 a(u uVar, ArrayList arrayList) {
        z7 z7Var = new z7();
        z7Var.S = uVar;
        z7Var.T = arrayList;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z7 z7Var2 = (z7) obj;
            if (z7Var2.K) {
                z7Var.K = true;
                z7Var2.V = 0.0f;
                z7Var2.W = Math.min(1.0f, 59000.0f / z7Var2.f17211h0);
            }
        }
        if (z7Var.K) {
            z7Var.f17217k0 = 720;
            z7Var.f17219l0 = 1280;
            z7Var.f17213i0 = 720;
            z7Var.f17215j0 = 1280;
        } else {
            z7Var.f17217k0 = 1080;
            z7Var.f17219l0 = 1920;
            z7Var.f17213i0 = 1080;
            z7Var.f17215j0 = 1920;
        }
        z7Var.A();
        return z7Var;
    }

    public static int d(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        double dMin = (i12 > i11 || i13 > i10) ? Math.min((int) Math.ceil(i12 / i11), (int) Math.ceil(i13 / i10)) : 1;
        return Math.max(1, (int) Math.pow(dMin, Math.floor(Math.log(dMin) / Math.log(2.0d))));
    }

    public static void j(Canvas canvas, Drawable drawable, int i10, int i11) {
        if (drawable == null) {
            return;
        }
        Rect rect = new Rect(drawable.getBounds());
        Drawable.Callback callback = drawable.getCallback();
        drawable.setCallback(null);
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            float width = bitmapDrawable.getBitmap().getWidth();
            float height = bitmapDrawable.getBitmap().getHeight();
            float fMax = Math.max(i10 / width, i11 / height);
            drawable.setBounds(0, 0, (int) (width * fMax), (int) (height * fMax));
            drawable.draw(canvas);
        } else {
            drawable.setBounds(0, 0, i10, i11);
            drawable.draw(canvas);
        }
        drawable.setBounds(rect);
        drawable.setCallback(callback);
    }

    public static String k(File file) {
        String path;
        int iLastIndexOf;
        if (file != null && (iLastIndexOf = (path = file.getPath()).lastIndexOf(46)) > 0) {
            return path.substring(iLastIndexOf + 1);
        }
        return null;
    }

    public static z7 l(MediaController.PhotoEntry photoEntry) {
        int i10;
        z7 z7Var = new z7();
        z7Var.L = new File(photoEntry.path);
        z7Var.Q = photoEntry.orientation;
        z7Var.R = photoEntry.invert;
        z7Var.K = !photoEntry.isLivePhoto() && photoEntry.isVideo;
        z7Var.N = photoEntry.thumbPath;
        long j10 = ((long) photoEntry.duration) * 1000;
        z7Var.f17211h0 = j10;
        z7Var.Z = 0.0f;
        z7Var.f17194a0 = Math.min(1.0f, 59000.0f / j10);
        if (z7Var.K && z7Var.N == null) {
            z7Var.N = "vthumb://" + photoEntry.imageId;
        }
        z7Var.A0 = photoEntry.gradientTopColor;
        z7Var.B0 = photoEntry.gradientBottomColor;
        z7Var.h(z7Var.L.getAbsolutePath());
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            z7Var.f17217k0 = i11;
            z7Var.f17219l0 = i10;
        }
        z7Var.A();
        return z7Var;
    }

    public static z7 m(int i10, File file) {
        z7 z7Var = new z7();
        z7Var.L = file;
        z7Var.M = true;
        z7Var.Q = i10;
        z7Var.R = 0;
        z7Var.K = false;
        if (file != null) {
            z7Var.h(file.getAbsolutePath());
        }
        z7Var.A();
        return z7Var;
    }

    public static z7 n(File file, TL_stories.StoryItem storyItem) {
        z7 z7Var = new z7();
        z7Var.f17209g = true;
        z7Var.f17207f = storyItem.f22617id;
        z7Var.L = file;
        z7Var.M = false;
        z7Var.f17217k0 = 720;
        z7Var.f17219l0 = 1280;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        boolean z10 = messageMedia instanceof TLRPC.TL_messageMediaPhoto;
        int i10 = z7Var.f17193a;
        if (z10) {
            z7Var.K = false;
            if (file != null) {
                z7Var.h(file.getAbsolutePath());
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            z7Var.K = true;
            TLRPC.Document document = messageMedia.document;
            if (document != null && document.attributes != null) {
                for (int i11 = 0; i11 < storyItem.media.document.attributes.size(); i11++) {
                    TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i11);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        z7Var.f17217k0 = documentAttribute.f22387w;
                        z7Var.f17219l0 = documentAttribute.h;
                        z7Var.f17212i = documentAttribute.duration;
                        break;
                    }
                }
            }
            TLRPC.Document document2 = storyItem.media.document;
            if (document2 != null) {
                String str = storyItem.firstFramePath;
                if (str != null) {
                    z7Var.N = str;
                } else if (document2.thumbs != null) {
                    for (int i12 = 0; i12 < storyItem.media.document.thumbs.size(); i12++) {
                        TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i12);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            z7Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                            break;
                        }
                        File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(photoSize, true);
                        if (pathToAttach != null && pathToAttach.exists()) {
                            z7Var.N = pathToAttach.getAbsolutePath();
                            break;
                        }
                    }
                }
            }
        }
        ArrayList arrayList = z7Var.F0;
        arrayList.clear();
        ArrayList<TLRPC.PrivacyRule> arrayList2 = storyItem.privacy;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            TLRPC.PrivacyRule privacyRule = arrayList2.get(i13);
            if (privacyRule != null) {
                if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                    arrayList3.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowCloseFriends) {
                    arrayList3.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                    arrayList3.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                    TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = (TLRPC.TL_privacyValueDisallowUsers) privacyRule;
                    TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                    for (int i14 = 0; i14 < tL_privacyValueDisallowUsers.users.size(); i14++) {
                        TLRPC.InputUser inputUser = messagesController.getInputUser(tL_privacyValueDisallowUsers.users.get(i14).longValue());
                        if (!(inputUser instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueDisallowUsers);
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = (TLRPC.TL_privacyValueAllowUsers) privacyRule;
                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                    for (int i15 = 0; i15 < tL_privacyValueAllowUsers.users.size(); i15++) {
                        TLRPC.InputUser inputUser2 = messagesController.getInputUser(tL_privacyValueAllowUsers.users.get(i15).longValue());
                        if (!(inputUser2 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueAllowUsers.users.add(inputUser2);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueAllowUsers);
                }
            }
        }
        arrayList.addAll(arrayList3);
        z7Var.I0 = storyItem.expire_date - storyItem.date;
        try {
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(new SpannableString(storyItem.caption), org.telegram.ui.ActionBar.g6.f23247o2.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(charSequenceReplaceEmoji, storyItem.entities, true, false, true, false);
            z7Var.C0 = MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, storyItem.entities, org.telegram.ui.ActionBar.g6.f23247o2.getFontMetricsInt());
        } catch (Exception unused) {
        }
        z7Var.A();
        z7Var.e(storyItem);
        z7Var.f17220m = storyItem.media_areas;
        z7Var.f17237v0 = MessagesController.getInstance(i10).getInputPeer(storyItem.dialogId);
        return z7Var;
    }

    public static z7 o(File file, String str, long j10) {
        z7 z7Var = new z7();
        z7Var.f17201c1 = true;
        z7Var.L = file;
        z7Var.M = true;
        z7Var.Q = 0;
        z7Var.R = 0;
        z7Var.K = true;
        z7Var.f17211h0 = j10;
        z7Var.N = str;
        z7Var.Z = 0.0f;
        z7Var.f17194a0 = Math.min(1.0f, 59500.0f / j10);
        return z7Var;
    }

    public static long p(MessageObject messageObject) {
        Boolean boolD = D(messageObject);
        if (boolD == null) {
            return 0L;
        }
        return boolD.booleanValue() ? DialogObject.getPeerDialogId(messageObject.messageOwner.fwd_from.from_id) : messageObject.getDialogId();
    }

    public static Bitmap q(x7 x7Var, int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        if (i12 == 90 || i12 == 270) {
            i13 = i10;
            i14 = i11;
        } else {
            i14 = i10;
            i13 = i11;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        x7Var.h(options);
        options.inJustDecodeBounds = false;
        options.inScaled = false;
        Runtime runtime = Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i15 = options.outWidth;
        int i16 = options.outHeight;
        boolean z11 = ((double) ((((long) (i14 * i13)) * 4) + (((long) (i15 * i16)) * 4))) * 1.1d <= ((double) jMaxMemory);
        if (i15 <= i14 && i16 <= i13) {
            return x7Var.h(options);
        }
        if (z10 && z11 && SharedConfig.getDevicePerformanceClass() >= 1) {
            Bitmap bitmapH = x7Var.h(options);
            float fMax = Math.max(i14 / bitmapH.getWidth(), i13 / bitmapH.getHeight());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (bitmapH.getWidth() * fMax), (int) (bitmapH.getHeight() * fMax), Bitmap.Config.ARGB_8888);
            Utilities.libyuvARGBSaleBitmap(bitmapH, bitmapCreateBitmap, Utilities.libyuv_ScaleFilter.Box);
            Utilities.clamp(Math.round(1.0f / fMax), 8, 0);
            return bitmapCreateBitmap;
        }
        options.inScaled = true;
        int i17 = options.outWidth;
        float f10 = i14 / i17;
        int i18 = options.outHeight;
        if (f10 > i13 / i18) {
            options.inDensity = i17;
            options.inTargetDensity = i14;
        } else {
            options.inDensity = i18;
            options.inTargetDensity = i13;
        }
        return x7Var.h(options);
    }

    public static boolean u(TLRPC.Document document, String str) {
        long j10;
        if (document != null) {
            if (!"video/webm".equals(document.mime_type) && !"video/mp4".equals(document.mime_type)) {
                if (MessageObject.isAnimatedStickerDocument(document, true)) {
                    RLottieNative rLottieNativeA = RLottieNative.a(str, null, 0, 0, null, false, null, false, 0, null);
                    if (rLottieNativeA != null) {
                        int i10 = rLottieNativeA.f26461a[0];
                        rLottieNativeA.d();
                        j10 = i10;
                    } else {
                        j10 = 0;
                    }
                    if (j10 > 1) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static File w(int i10, String str) {
        TLObject tLObject;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
        tL_fileLocationToBeDeprecated.dc_id = Integer.MIN_VALUE;
        tL_fileLocationToBeDeprecated.local_id = SharedConfig.getLastLocalId();
        tL_fileLocationToBeDeprecated.file_reference = new byte[0];
        if ("mp4".equals(str) || "webm".equals(str)) {
            TLRPC.TL_videoSize_layer127 tL_videoSize_layer127 = new TLRPC.TL_videoSize_layer127();
            tL_videoSize_layer127.location = tL_fileLocationToBeDeprecated;
            tLObject = tL_videoSize_layer127;
        } else {
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.location = tL_fileLocationToBeDeprecated;
            tLObject = tL_photoSize_layer127;
        }
        return FileLoader.getInstance(i10).getPathToAttach(tLObject, str, true);
    }

    public static File x(int i10, boolean z10) {
        return w(i10, z10 ? "mp4" : "jpg");
    }

    public static z7 y(ArrayList arrayList) {
        MessageObject messageObject;
        int i10;
        z7 z7Var = new z7();
        z7Var.f17235u = true;
        z7Var.v = arrayList;
        z7Var.f17213i0 = 1080;
        z7Var.f17215j0 = 1920;
        z7Var.f17245z0 = p((MessageObject) arrayList.get(0));
        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
        mediaEntity.type = (byte) 6;
        mediaEntity.f19646x = 0.5f;
        mediaEntity.f19647y = 0.5f;
        ArrayList arrayList2 = new ArrayList();
        z7Var.T0 = arrayList2;
        arrayList2.add(mediaEntity);
        if (arrayList.size() == 1 && (messageObject = (MessageObject) arrayList.get(0)) != null && ((i10 = messageObject.type) == 8 || i10 == 3 || i10 == 5)) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && message.attachPath != null) {
                z7Var.L = new File(messageObject.messageOwner.attachPath);
            }
            File file = z7Var.L;
            if (file == null || !file.exists()) {
                z7Var.L = FileLoader.getInstance(z7Var.f17193a).getPathToMessage(messageObject.messageOwner);
            }
            File file2 = z7Var.L;
            if (file2 != null && file2.exists()) {
                z7Var.K = true;
                z7Var.M = false;
                long duration = (long) (messageObject.getDuration() * 1000.0d);
                z7Var.f17211h0 = duration;
                z7Var.Z = 0.0f;
                z7Var.f17194a0 = Math.min(1.0f, 59500.0f / duration);
                return z7Var;
            }
            z7Var.L = null;
        }
        return z7Var;
    }

    public final void A() {
        Matrix matrix = this.f17222n0;
        matrix.reset();
        int i10 = this.f17217k0;
        int i11 = this.f17219l0;
        int i12 = this.Q;
        int i13 = this.R;
        matrix.postScale(i13 == 1 ? -1.0f : 1.0f, i13 == 2 ? -1.0f : 1.0f, i10 / 2.0f, i11 / 2.0f);
        if (i12 != 0) {
            matrix.postTranslate((-i10) / 2.0f, (-i11) / 2.0f);
            matrix.postRotate(i12);
            if (i12 == 90 || i12 == 270) {
                i11 = i10;
                i10 = i11;
            }
            matrix.postTranslate(i10 / 2.0f, i11 / 2.0f);
        }
        float f10 = i10;
        float fMax = this.f17213i0 / f10;
        if (this.J0 != 0) {
            fMax = Math.min(fMax, this.f17215j0 / i11);
        } else {
            float f11 = i11;
            if (f11 / f10 > 1.29f) {
                fMax = Math.max(fMax, this.f17215j0 / f11);
            }
        }
        matrix.postScale(fMax, fMax);
        matrix.postTranslate(com.google.android.recaptcha.internal.a.w(f10, fMax, this.f17213i0, 2.0f), com.google.android.recaptcha.internal.a.w(i11, fMax, this.f17215j0, 2.0f));
    }

    public final void B() {
        if (!this.K || v() || this.f17209g || this.f17221n || this.f17211h0 <= 69000 || !UserConfig.getInstance(this.f17193a).isPremium()) {
            return;
        }
        long j10 = this.f17211h0 - 59000;
        long jMin = j10 > 10000 ? Math.min(59000L, j10) + 59000 : 59000L;
        long j11 = this.f17211h0 - jMin;
        if (j11 > 10000) {
            jMin += Math.min(59000L, j11);
        }
        this.f17194a0 = Math.min(1.0f, jMin / this.f17211h0);
    }

    public final boolean E() {
        ArrayList arrayList;
        ArrayList<VideoEditedInfo.EmojiEntity> arrayList2;
        MessageObject messageObject;
        TLRPC.Message message;
        ArrayList arrayList3 = this.T0;
        if (!this.K && this.f17242y == null && this.f17224o0 == null && ((arrayList = this.v) == null || arrayList.size() != 1 || (messageObject = (MessageObject) this.v.get(0)) == null || (message = messageObject.messageOwner) == null || !(message.action instanceof TLRPC.TL_messageActionStarGiftUnique))) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                    VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList3.get(i10);
                    byte b10 = mediaEntity.type;
                    if (b10 != 0) {
                        if (b10 == 1 && (arrayList2 = mediaEntity.entities) != null && !arrayList2.isEmpty()) {
                            for (int i11 = 0; i11 < mediaEntity.entities.size(); i11++) {
                                VideoEditedInfo.EmojiEntity emojiEntity = mediaEntity.entities.get(i11);
                                if (!u(emojiEntity.document, emojiEntity.documentAbsolutePath)) {
                                }
                            }
                        }
                    } else if (!u(mediaEntity.document, mediaEntity.text)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Bitmap b(Bitmap bitmap, float f10) {
        final int i10;
        Bitmap bitmap2;
        float f11;
        final File file;
        Paint paint;
        int i11;
        z7 z7Var;
        final File file2;
        Paint paint2;
        Bitmap bitmap3;
        int i12;
        Bitmap bitmapQ;
        int width;
        int height;
        Pair<Integer, Integer> imageOrientation;
        Matrix matrix = new Matrix();
        Paint paint3 = new Paint(7);
        int i13 = (int) (this.f17213i0 * f10);
        int i14 = (int) (this.f17215j0 * f10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        final int i15 = 0;
        if (this.Y0 == null) {
            long j10 = this.f17245z0;
            if (j10 != Long.MIN_VALUE) {
                Drawable drawableE = this.f17241x0;
                if (drawableE == null) {
                    drawableE = q6.e(null, this.f17193a, j10, this.f17243y0);
                }
                j(canvas, drawableE, canvas.getWidth(), canvas.getHeight());
            } else {
                Paint paint4 = new Paint(1);
                paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, canvas.getHeight(), new int[]{this.A0, this.B0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                i10 = 0;
                canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), paint4);
            }
            matrix.set(this.f17222n0);
            if (bitmap != null) {
                float width2 = this.f17217k0 / bitmap.getWidth();
                matrix.preScale(width2, width2);
                matrix.postScale(f10, f10);
                canvas.drawBitmap(bitmap, matrix, paint3);
                return bitmapCreateBitmap;
            }
            if (v()) {
                i11 = 0;
                while (i11 < this.T.size()) {
                    z7Var = (z7) this.T.get(i11);
                    file2 = z7Var.Z0;
                    if (file2 == null) {
                        file2 = z7Var.L;
                    }
                    if (file2 != null) {
                        try {
                            bitmapQ = q(new x7() {
                                @Override
                                public final Bitmap h(BitmapFactory.Options options) {
                                    switch (i10) {
                                        case 0:
                                            break;
                                    }
                                    return BitmapFactory.decodeFile(file2.getPath(), options);
                                }
                            }, i13, i14, i10, true);
                            canvas.save();
                            RectF rectF = new RectF();
                            width = bitmapQ.getWidth();
                            height = bitmapQ.getHeight();
                            imageOrientation = AndroidUtilities.getImageOrientation(file2);
                            if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
                                width = bitmapQ.getHeight();
                                height = bitmapQ.getWidth();
                            }
                            t tVar = (t) this.S.f16885e.get(i11);
                            float f12 = i13;
                            bitmap3 = bitmapCreateBitmap;
                            float f13 = i14;
                            try {
                                i12 = i11;
                                try {
                                    paint2 = paint3;
                                    try {
                                        rectF.set(tVar.a(f12), tVar.f16830c * (f13 / tVar.f16828a.f16884c), tVar.b(f12), (f13 / tVar.f16828a.f16884c) * (tVar.f16830c + 1));
                                        canvas.translate(rectF.centerX(), rectF.centerY());
                                        canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
                                        float fMax = Math.max(rectF.width() / width, rectF.height() / height);
                                        canvas.scale(fMax, fMax);
                                        canvas.rotate(((Integer) imageOrientation.first).intValue());
                                        canvas.translate((-bitmapQ.getWidth()) / 2.0f, (-bitmapQ.getHeight()) / 2.0f);
                                        try {
                                            canvas.drawBitmap(bitmapQ, 0.0f, 0.0f, (Paint) null);
                                            canvas.restore();
                                        } catch (Exception e9) {
                                            e = e9;
                                            FileLog.e(e);
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        FileLog.e(e);
                                        i11 = i12 + 1;
                                        bitmapCreateBitmap = bitmap3;
                                        paint3 = paint2;
                                        i10 = 0;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    paint2 = paint3;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                paint2 = paint3;
                                i12 = i11;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            paint2 = paint3;
                            bitmap3 = bitmapCreateBitmap;
                            i12 = i11;
                        }
                    } else {
                        paint2 = paint3;
                        bitmap3 = bitmapCreateBitmap;
                        i12 = i11;
                    }
                    i11 = i12 + 1;
                    bitmapCreateBitmap = bitmap3;
                    paint3 = paint2;
                    i10 = 0;
                }
                bitmap2 = bitmapCreateBitmap;
                f11 = 0.0f;
                paint = paint3;
            } else {
                bitmap2 = bitmapCreateBitmap;
                f11 = 0.0f;
                file = this.Z0;
                if (file == null) {
                    file = this.L;
                }
                if (file != null) {
                    try {
                        final int i16 = 1;
                        Bitmap bitmapQ2 = q(new x7() {
                            @Override
                            public final Bitmap h(BitmapFactory.Options options) {
                                switch (i16) {
                                    case 0:
                                        break;
                                }
                                return BitmapFactory.decodeFile(file.getPath(), options);
                            }
                        }, i13, i14, this.Q, true);
                        float width3 = this.f17217k0 / bitmapQ2.getWidth();
                        matrix.preScale(width3, width3);
                        matrix.postScale(f10, f10);
                        paint = paint3;
                        try {
                            canvas.drawBitmap(bitmapQ2, matrix, paint);
                            bitmapQ2.recycle();
                        } catch (Exception e14) {
                            e = e14;
                            FileLog.e(e);
                        }
                    } catch (Exception e15) {
                        e = e15;
                        paint = paint3;
                    }
                } else {
                    paint = paint3;
                }
            }
            if (this.P0 != null) {
                try {
                    final int i17 = 1;
                    Bitmap bitmapQ3 = q(new x7() {
                        @Override
                        public final Bitmap h(BitmapFactory.Options options) {
                            switch (i17) {
                                case 0:
                                    return BitmapFactory.decodeFile(this.Y0.getPath(), options);
                                case 1:
                                    return BitmapFactory.decodeFile(this.P0.getPath(), options);
                                case 2:
                                    return BitmapFactory.decodeFile(this.W0.getPath(), options);
                                default:
                                    return BitmapFactory.decodeFile(this.R0.getPath(), options);
                            }
                        }
                    }, i13, i14, 0, true);
                    canvas.save();
                    float width4 = this.f17213i0 / bitmapQ3.getWidth();
                    canvas.scale(width4, width4);
                    matrix.postScale(f10, f10);
                    canvas.drawBitmap(bitmapQ3, f11, f11, paint);
                    canvas.restore();
                    bitmapQ3.recycle();
                } catch (Exception e16) {
                    FileLog.e(e16);
                }
            }
            if (this.W0 != null) {
                try {
                    final int i18 = 2;
                    Bitmap bitmapQ4 = q(new x7() {
                        @Override
                        public final Bitmap h(BitmapFactory.Options options) {
                            switch (i18) {
                                case 0:
                                    return BitmapFactory.decodeFile(this.Y0.getPath(), options);
                                case 1:
                                    return BitmapFactory.decodeFile(this.P0.getPath(), options);
                                case 2:
                                    return BitmapFactory.decodeFile(this.W0.getPath(), options);
                                default:
                                    return BitmapFactory.decodeFile(this.R0.getPath(), options);
                            }
                        }
                    }, i13, i14, 0, true);
                    canvas.save();
                    float width5 = this.f17213i0 / bitmapQ4.getWidth();
                    canvas.scale(width5, width5);
                    matrix.postScale(f10, f10);
                    canvas.drawBitmap(bitmapQ4, f11, f11, paint);
                    canvas.restore();
                    bitmapQ4.recycle();
                } catch (Exception e17) {
                    FileLog.e(e17);
                }
            }
            if (this.R0 != null) {
                return bitmap2;
            }
            try {
                final int i19 = 3;
                Bitmap bitmapQ5 = q(new x7() {
                    @Override
                    public final Bitmap h(BitmapFactory.Options options) {
                        switch (i19) {
                            case 0:
                                return BitmapFactory.decodeFile(this.Y0.getPath(), options);
                            case 1:
                                return BitmapFactory.decodeFile(this.P0.getPath(), options);
                            case 2:
                                return BitmapFactory.decodeFile(this.W0.getPath(), options);
                            default:
                                return BitmapFactory.decodeFile(this.R0.getPath(), options);
                        }
                    }
                }, i13, i14, 0, true);
                canvas.save();
                float width6 = this.f17213i0 / bitmapQ5.getWidth();
                canvas.scale(width6, width6);
                matrix.postScale(f10, f10);
                canvas.drawBitmap(bitmapQ5, f11, f11, paint);
                canvas.restore();
                bitmapQ5.recycle();
                return bitmap2;
            } catch (Exception e18) {
                FileLog.e(e18);
                return bitmap2;
            }
        }
        try {
            Bitmap bitmapQ6 = q(new x7() {
                @Override
                public final Bitmap h(BitmapFactory.Options options) {
                    switch (i15) {
                        case 0:
                            return BitmapFactory.decodeFile(this.Y0.getPath(), options);
                        case 1:
                            return BitmapFactory.decodeFile(this.P0.getPath(), options);
                        case 2:
                            return BitmapFactory.decodeFile(this.W0.getPath(), options);
                        default:
                            return BitmapFactory.decodeFile(this.R0.getPath(), options);
                    }
                }
            }, i13, i14, 0, true);
            canvas.save();
            float width7 = this.f17213i0 / bitmapQ6.getWidth();
            canvas.scale(width7, width7);
            matrix.postScale(f10, f10);
            canvas.drawBitmap(bitmapQ6, 0.0f, 0.0f, paint3);
            canvas.restore();
            bitmapQ6.recycle();
        } catch (Exception e19) {
            FileLog.e(e19);
        }
        i10 = 0;
        matrix.set(this.f17222n0);
        if (bitmap != null) {
            float width8 = this.f17217k0 / bitmap.getWidth();
            matrix.preScale(width8, width8);
            matrix.postScale(f10, f10);
            canvas.drawBitmap(bitmap, matrix, paint3);
            return bitmapCreateBitmap;
        }
        if (v()) {
            i11 = 0;
            while (i11 < this.T.size()) {
                z7Var = (z7) this.T.get(i11);
                file2 = z7Var.Z0;
                if (file2 == null) {
                    file2 = z7Var.L;
                }
                if (file2 != null) {
                    bitmapQ = q(new x7() {
                        @Override
                        public final Bitmap h(BitmapFactory.Options options) {
                            switch (i10) {
                                case 0:
                                    break;
                            }
                            return BitmapFactory.decodeFile(file2.getPath(), options);
                        }
                    }, i13, i14, i10, true);
                    canvas.save();
                    RectF rectF2 = new RectF();
                    width = bitmapQ.getWidth();
                    height = bitmapQ.getHeight();
                    imageOrientation = AndroidUtilities.getImageOrientation(file2);
                    if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
                        width = bitmapQ.getHeight();
                        height = bitmapQ.getWidth();
                    }
                    t tVar2 = (t) this.S.f16885e.get(i11);
                    float f14 = i13;
                    bitmap3 = bitmapCreateBitmap;
                    float f15 = i14;
                    i12 = i11;
                    paint2 = paint3;
                    rectF2.set(tVar2.a(f14), tVar2.f16830c * (f15 / tVar2.f16828a.f16884c), tVar2.b(f14), (f15 / tVar2.f16828a.f16884c) * (tVar2.f16830c + 1));
                    canvas.translate(rectF2.centerX(), rectF2.centerY());
                    canvas.clipRect((-rectF2.width()) / 2.0f, (-rectF2.height()) / 2.0f, rectF2.width() / 2.0f, rectF2.height() / 2.0f);
                    float fMax2 = Math.max(rectF2.width() / width, rectF2.height() / height);
                    canvas.scale(fMax2, fMax2);
                    canvas.rotate(((Integer) imageOrientation.first).intValue());
                    canvas.translate((-bitmapQ.getWidth()) / 2.0f, (-bitmapQ.getHeight()) / 2.0f);
                    canvas.drawBitmap(bitmapQ, 0.0f, 0.0f, (Paint) null);
                    canvas.restore();
                } else {
                    paint2 = paint3;
                    bitmap3 = bitmapCreateBitmap;
                    i12 = i11;
                }
                i11 = i12 + 1;
                bitmapCreateBitmap = bitmap3;
                paint3 = paint2;
                i10 = 0;
            }
            bitmap2 = bitmapCreateBitmap;
            f11 = 0.0f;
            paint = paint3;
        } else {
            bitmap2 = bitmapCreateBitmap;
            f11 = 0.0f;
            file = this.Z0;
            if (file == null) {
                file = this.L;
            }
            if (file != null) {
                final int i110 = 1;
                Bitmap bitmapQ7 = q(new x7() {
                    @Override
                    public final Bitmap h(BitmapFactory.Options options) {
                        switch (i110) {
                            case 0:
                                break;
                        }
                        return BitmapFactory.decodeFile(file.getPath(), options);
                    }
                }, i13, i14, this.Q, true);
                float width9 = this.f17217k0 / bitmapQ7.getWidth();
                matrix.preScale(width9, width9);
                matrix.postScale(f10, f10);
                paint = paint3;
                canvas.drawBitmap(bitmapQ7, matrix, paint);
                bitmapQ7.recycle();
            } else {
                paint = paint3;
            }
        }
        if (this.P0 != null) {
            final int i111 = 1;
            Bitmap bitmapQ8 = q(new x7() {
                @Override
                public final Bitmap h(BitmapFactory.Options options) {
                    switch (i111) {
                        case 0:
                            return BitmapFactory.decodeFile(this.Y0.getPath(), options);
                        case 1:
                            return BitmapFactory.decodeFile(this.P0.getPath(), options);
                        case 2:
                            return BitmapFactory.decodeFile(this.W0.getPath(), options);
                        default:
                            return BitmapFactory.decodeFile(this.R0.getPath(), options);
                    }
                }
            }, i13, i14, 0, true);
            canvas.save();
            float width10 = this.f17213i0 / bitmapQ8.getWidth();
            canvas.scale(width10, width10);
            matrix.postScale(f10, f10);
            canvas.drawBitmap(bitmapQ8, f11, f11, paint);
            canvas.restore();
            bitmapQ8.recycle();
        }
        if (this.W0 != null) {
            final int i112 = 2;
            Bitmap bitmapQ9 = q(new x7() {
                @Override
                public final Bitmap h(BitmapFactory.Options options) {
                    switch (i112) {
                        case 0:
                            return BitmapFactory.decodeFile(this.Y0.getPath(), options);
                        case 1:
                            return BitmapFactory.decodeFile(this.P0.getPath(), options);
                        case 2:
                            return BitmapFactory.decodeFile(this.W0.getPath(), options);
                        default:
                            return BitmapFactory.decodeFile(this.R0.getPath(), options);
                    }
                }
            }, i13, i14, 0, true);
            canvas.save();
            float width11 = this.f17213i0 / bitmapQ9.getWidth();
            canvas.scale(width11, width11);
            matrix.postScale(f10, f10);
            canvas.drawBitmap(bitmapQ9, f11, f11, paint);
            canvas.restore();
            bitmapQ9.recycle();
        }
        if (this.R0 != null) {
            return bitmap2;
        }
        final int i113 = 3;
        Bitmap bitmapQ10 = q(new x7() {
            @Override
            public final Bitmap h(BitmapFactory.Options options) {
                switch (i113) {
                    case 0:
                        return BitmapFactory.decodeFile(this.Y0.getPath(), options);
                    case 1:
                        return BitmapFactory.decodeFile(this.P0.getPath(), options);
                    case 2:
                        return BitmapFactory.decodeFile(this.W0.getPath(), options);
                    default:
                        return BitmapFactory.decodeFile(this.R0.getPath(), options);
                }
            }
        }, i13, i14, 0, true);
        canvas.save();
        float width12 = this.f17213i0 / bitmapQ10.getWidth();
        canvas.scale(width12, width12);
        matrix.postScale(f10, f10);
        canvas.drawBitmap(bitmapQ10, f11, f11, paint);
        canvas.restore();
        bitmapQ10.recycle();
        return bitmap2;
    }

    public final void c(File file) {
        Bitmap bitmapB = b(null, 1.0f);
        Bitmap bitmap = this.f17198b1;
        if (bitmap != null) {
            bitmap.recycle();
            this.f17198b1 = null;
        }
        this.f17198b1 = Bitmap.createScaledBitmap(bitmapB, 40, 22, true);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmapB.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        bitmapB.recycle();
    }

    public final void e(TL_stories.StoryItem storyItem) {
        if (storyItem != null && storyItem.media != null) {
            TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Photo photo = messageMedia.photo;
            if (photo == null) {
                TLRPC.Document document = messageMedia.document;
                if (document != null && MessageObject.isDocumentHasAttachedStickers(document)) {
                    TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputStickeredMediaDocument.f22449id = tL_inputDocument;
                    tL_inputDocument.f22392id = document.f22386id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr = document.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
                    this.f17206e1 = ConnectionsManager.getInstance(this.f17193a).sendRequest(tL_messages_getAttachedStickers, new gh.f1(this, storyItem, tL_messages_getAttachedStickers, new cf.a(this, 16), 7));
                }
            } else if (photo.has_stickers) {
                TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputStickeredMediaPhoto.f22450id = tL_inputPhoto;
                tL_inputPhoto.f22399id = photo.f22404id;
                tL_inputPhoto.access_hash = photo.access_hash;
                byte[] bArr2 = photo.file_reference;
                tL_inputPhoto.file_reference = bArr2;
                if (bArr2 == null) {
                    tL_inputPhoto.file_reference = new byte[0];
                }
                tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
                this.f17206e1 = ConnectionsManager.getInstance(this.f17193a).sendRequest(tL_messages_getAttachedStickers, new gh.f1(this, storyItem, tL_messages_getAttachedStickers, new cf.a(this, 16), 7));
            }
        }
    }

    public final void f() {
        File file = this.P0;
        if (file != null) {
            file.delete();
            this.P0 = null;
        }
        File file2 = this.Y0;
        if (file2 != null) {
            file2.delete();
            this.Y0 = null;
        }
        File file3 = this.W0;
        if (file3 != null) {
            file3.delete();
            this.W0 = null;
        }
        File file4 = this.X0;
        if (file4 != null) {
            file4.delete();
            this.X0 = null;
        }
        File file5 = this.R0;
        if (file5 != null) {
            file5.delete();
            this.R0 = null;
        }
    }

    public final z7 g() {
        z7 z7Var = new z7();
        z7Var.f17196b = this.f17196b;
        z7Var.f17199c = this.f17199c;
        z7Var.d = this.d;
        z7Var.f17204e = this.f17204e;
        z7Var.f17207f = this.f17207f;
        z7Var.f17209g = this.f17209g;
        z7Var.h = this.h;
        z7Var.f17212i = this.f17212i;
        z7Var.f17214j = this.f17214j;
        z7Var.f17216k = this.f17216k;
        z7Var.f17218l = this.f17218l;
        z7Var.f17220m = this.f17220m;
        z7Var.f17238w = this.f17238w;
        z7Var.f17240x = this.f17240x;
        z7Var.f17242y = this.f17242y;
        z7Var.f17244z = this.f17244z;
        z7Var.A = this.A;
        z7Var.B = this.B;
        z7Var.C = this.C;
        z7Var.D = this.D;
        z7Var.E = this.E;
        z7Var.F = this.F;
        z7Var.G = this.G;
        z7Var.H = this.H;
        z7Var.I = this.I;
        z7Var.J = this.J;
        z7Var.K = this.K;
        z7Var.L = this.L;
        z7Var.M = this.M;
        boolean z10 = this.M;
        int i10 = this.f17193a;
        if (z10) {
            File fileW = w(i10, k(this.L));
            z7Var.L = fileW;
            AndroidUtilities.copyFileSafe(this.L, fileW);
        }
        z7Var.N = this.N;
        z7Var.Y = this.Y;
        z7Var.Z = this.Z;
        z7Var.f17194a0 = this.f17194a0;
        z7Var.f17211h0 = this.f17211h0;
        z7Var.f17217k0 = this.f17217k0;
        z7Var.f17219l0 = this.f17219l0;
        z7Var.f17213i0 = this.f17213i0;
        z7Var.f17215j0 = this.f17215j0;
        z7Var.f17237v0 = this.f17237v0;
        z7Var.R = this.R;
        z7Var.f17222n0.set(this.f17222n0);
        z7Var.A0 = this.A0;
        z7Var.B0 = this.B0;
        z7Var.C0 = this.C0;
        z7Var.D0 = this.D0;
        z7Var.E0 = this.E0;
        ArrayList arrayList = z7Var.F0;
        arrayList.clear();
        arrayList.addAll(this.F0);
        z7Var.G0 = this.G0;
        z7Var.H0 = this.H0;
        z7Var.I0 = this.I0;
        z7Var.M0 = this.M0;
        z7Var.N0 = this.N0;
        z7Var.f17239w0 = this.f17239w0;
        File file = this.N0;
        if (file != null && file.exists()) {
            File fileW2 = w(i10, k(this.N0));
            z7Var.N0 = fileW2;
            AndroidUtilities.copyFileSafe(this.N0, fileW2);
        }
        z7Var.O0 = this.O0;
        File file2 = this.O0;
        if (file2 != null && file2.exists()) {
            File fileW3 = w(i10, k(this.O0));
            z7Var.O0 = fileW3;
            AndroidUtilities.copyFileSafe(this.O0, fileW3);
        }
        z7Var.P0 = this.P0;
        File file3 = this.P0;
        if (file3 != null && file3.exists()) {
            File fileW4 = w(i10, k(this.P0));
            z7Var.P0 = fileW4;
            AndroidUtilities.copyFileSafe(this.P0, fileW4);
        }
        z7Var.W0 = this.W0;
        File file4 = this.W0;
        if (file4 != null && file4.exists()) {
            File fileW5 = w(i10, k(this.W0));
            z7Var.W0 = fileW5;
            AndroidUtilities.copyFileSafe(this.W0, fileW5);
        }
        z7Var.Y0 = this.Y0;
        File file5 = this.Y0;
        if (file5 != null && file5.exists()) {
            File fileW6 = w(i10, k(this.Y0));
            z7Var.Y0 = fileW6;
            AndroidUtilities.copyFileSafe(this.Y0, fileW6);
        }
        z7Var.Q0 = this.Q0;
        File file6 = this.Q0;
        if (file6 != null && file6.exists()) {
            File fileW7 = w(i10, k(this.Q0));
            z7Var.Q0 = fileW7;
            AndroidUtilities.copyFileSafe(this.Q0, fileW7);
        }
        z7Var.R0 = this.R0;
        File file7 = this.R0;
        if (file7 != null && file7.exists()) {
            File fileW8 = w(i10, k(this.R0));
            z7Var.R0 = fileW8;
            AndroidUtilities.copyFileSafe(this.R0, fileW8);
        }
        z7Var.S0 = this.S0;
        z7Var.T0 = new ArrayList();
        if (this.T0 != null) {
            for (int i11 = 0; i11 < this.T0.size(); i11++) {
                z7Var.T0.add(((VideoEditedInfo.MediaEntity) this.T0.get(i11)).copy());
            }
        }
        z7Var.U0 = this.U0;
        z7Var.V0 = this.V0;
        z7Var.Z0 = this.Z0;
        File file8 = this.Z0;
        if (file8 != null && file8.exists()) {
            File fileW9 = w(i10, k(this.Z0));
            z7Var.Z0 = fileW9;
            AndroidUtilities.copyFileSafe(this.Z0, fileW9);
        }
        z7Var.f17195a1 = this.f17195a1;
        z7Var.f17198b1 = this.f17198b1;
        z7Var.f17201c1 = this.f17201c1;
        z7Var.O = this.O;
        z7Var.f17221n = this.f17221n;
        z7Var.f17223o = this.f17223o;
        z7Var.f17224o0 = this.f17224o0;
        z7Var.f17232s0 = this.f17232s0;
        z7Var.f17234t0 = this.f17234t0;
        z7Var.f17228q0 = this.f17228q0;
        z7Var.f17226p0 = this.f17226p0;
        z7Var.f17230r0 = this.f17230r0;
        z7Var.f17236u0 = this.f17236u0;
        z7Var.f17197b0 = this.f17197b0;
        z7Var.J0 = this.J0;
        z7Var.K0 = this.K0;
        z7Var.L0 = this.L0;
        z7Var.f17205e0 = this.f17205e0;
        z7Var.T = this.T;
        z7Var.S = this.S;
        z7Var.U = this.U;
        z7Var.X = this.X;
        z7Var.P = this.P;
        return z7Var;
    }

    public final void h(String str) {
        if (str != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                this.f17217k0 = options.outWidth;
                this.f17219l0 = options.outHeight;
            } catch (Exception unused) {
            }
        }
        if (this.K) {
            return;
        }
        if (((int) Math.max(this.f17217k0, (this.f17219l0 / 16.0f) * 9.0f)) <= 900) {
            this.f17213i0 = 720;
            this.f17215j0 = 1280;
        } else {
            this.f17213i0 = 1080;
            this.f17215j0 = 1920;
        }
    }

    public final void i(boolean z10) {
        if (this.M0 != null) {
            this.M0 = null;
        }
        File file = this.N0;
        if (file != null) {
            file.delete();
            this.N0 = null;
        }
        if (!z10) {
            f();
            File file2 = this.Z0;
            if (file2 != null) {
                file2.delete();
                this.Z0 = null;
            }
            File file3 = this.L;
            if (file3 != null) {
                if (this.M && (!this.f17209g || this.f17214j)) {
                    file3.delete();
                }
                this.L = null;
            }
            if (this.N != null) {
                if (this.M) {
                    new File(this.N).delete();
                }
                this.N = null;
            }
            ArrayList arrayList = this.T0;
            if (arrayList != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) obj;
                    if (mediaEntity.type == 2 && !TextUtils.isEmpty(mediaEntity.segmentedPath)) {
                        try {
                            new File(mediaEntity.segmentedPath).delete();
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        mediaEntity.segmentedPath = "";
                    }
                }
            }
            File file4 = this.f17224o0;
            if (file4 != null && (!this.f17209g || this.f17214j)) {
                file4.delete();
                this.f17224o0 = null;
            }
            if (this.f17226p0 != null && (!this.f17209g || this.f17214j)) {
                try {
                    new File(this.f17226p0).delete();
                } catch (Exception unused) {
                }
                this.f17226p0 = null;
            }
        }
        this.O = null;
        if (this.T != null) {
            for (int i11 = 0; i11 < this.T.size(); i11++) {
                ((z7) this.T.get(i11)).i(z10);
            }
        }
        if (this.f17206e1 != 0) {
            ConnectionsManager.getInstance(this.f17193a).cancelRequest(this.f17206e1, true);
        }
    }

    public final int r() {
        if (!this.K || v() || this.f17209g) {
            return 1;
        }
        long j10 = this.f17211h0;
        if (j10 <= 0 || this.f17221n) {
            return 1;
        }
        long j11 = (long) ((this.f17194a0 - this.Z) * j10);
        if (j11 < 68999) {
            return 1;
        }
        return (int) Math.ceil(j11 / 59000.0f);
    }

    public final void s(Utilities.Callback callback) {
        int i10;
        if (!E()) {
            callback.run(null);
            return;
        }
        if (!this.K && ((i10 = this.f17213i0) > 720 || this.f17215j0 > 1280)) {
            float f10 = 720.0f / i10;
            this.f17222n0.postScale(f10, f10, 0.0f, 0.0f);
            this.f17213i0 = 720;
            this.f17215j0 = 1280;
        }
        File file = this.L;
        String absolutePath = file == null ? null : file.getAbsolutePath();
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, Math.max(1, v() ? this.T.size() : 0), 11);
        iArr[0] = new int[11];
        androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(this, absolutePath, iArr, callback);
        if (!v()) {
            if (this.L == null) {
                bVar.run();
                return;
            } else {
                Utilities.globalQueue.postRunnable(new j3.m(absolutePath, iArr, bVar, 15));
                return;
            }
        }
        String[] strArr = new String[this.T.size()];
        for (int i11 = 0; i11 < this.T.size(); i11++) {
            strArr[i11] = ((z7) this.T.get(i11)).L == null ? null : ((z7) this.T.get(i11)).L.getAbsolutePath();
            iArr[i11] = new int[11];
        }
        Utilities.globalQueue.postRunnable(new j3.m(strArr, iArr, bVar, 14));
    }

    public final boolean t() {
        if (v()) {
            for (int i10 = 0; i10 < this.T.size(); i10++) {
                if (((z7) this.T.get(i10)).K) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean v() {
        return (this.S == null || this.T == null) ? false : true;
    }

    public final void z(Runnable runnable) {
        Bitmap bitmapDecodeFile;
        if (this.K && this.A0 == 0 && this.B0 == 0) {
            if (this.N == null) {
                Bitmap bitmap = this.O;
                if (bitmap != null) {
                    int[] iArrB = n0.b(bitmap, true);
                    this.A0 = iArrB[0];
                    this.B0 = iArrB[1];
                    runnable.run();
                    return;
                }
                return;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (this.N.startsWith("vthumb://")) {
                    long j10 = Integer.parseInt(this.N.substring(9));
                    options.inJustDecodeBounds = true;
                    MediaStore.Video.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), j10, 1, options);
                    options.inSampleSize = d(options, 240, 240);
                    options.inJustDecodeBounds = false;
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    options.inDither = true;
                    bitmapDecodeFile = MediaStore.Video.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), j10, 1, options);
                } else {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.N);
                    options.inSampleSize = d(options, 240, 240);
                    options.inJustDecodeBounds = false;
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    options.inDither = true;
                    bitmapDecodeFile = BitmapFactory.decodeFile(this.N);
                }
            } catch (Exception unused) {
                bitmapDecodeFile = null;
            }
            if (bitmapDecodeFile != null) {
                int[] iArrB2 = n0.b(bitmapDecodeFile, true);
                this.A0 = iArrB2[0];
                this.B0 = iArrB2[1];
                bitmapDecodeFile.recycle();
                runnable.run();
            }
        }
    }
}
