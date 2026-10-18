package ei;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.MediaStore;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.RLottieNative;
public final class a8 {
    public String A;
    public int A0;
    public String B;
    public int B0;
    public long C;
    public CharSequence C0;
    public long D;
    public float E;
    public p9 E0;
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
    public t S;
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
    public MediaController.SavedFilterState f8697a1;
    public long f8698b;
    public boolean f8699b0;
    public Bitmap f8700b1;
    public boolean f8701c;
    public TLRPC.Document f8702c0;
    public boolean f8703c1;
    public long d;
    public ai.y3 f8704d0;
    public z7 f8705d1;
    public long e;
    public int f8708f;
    public boolean f8709f0;
    public boolean f8710g;
    public Bitmap f8711g0;
    public boolean h;
    public long f8712h0;
    public boolean f8715j;
    public boolean f8717k;
    public int f8718k0;
    public boolean f8719l;
    public int f8720l0;
    public ArrayList f8721m;
    public MediaController.CropState m0;
    public boolean f8722n;
    public boolean f8724o;
    public File f8725o0;
    public SpannableStringBuilder f8726p;
    public String f8727p0;
    public TLRPC.Peer f8728q;
    public long f8729q0;
    public int f8730r;
    public long f8731r0;
    public String f8732s;
    public float f8733s0;
    public TLRPC.MessageMedia f8734t;
    public boolean f8736u;
    public ArrayList v;
    public TLRPC.InputPeer f8738v0;
    public boolean f8739w;
    public HashSet f8740w0;
    public TLRPC.TL_error f8741x;
    public Drawable f8742x0;
    public String f8743y;
    public TLRPC.InputDocument f8745z;
    public final int f8695a = UserConfig.selectedAccount;
    public double f8713i = -1.0d;
    public float F = 1.0f;
    public float G = 1.0f;
    public float P = 1.0f;
    public boolean U = false;
    public float V = 0.0f;
    public float W = 1.0f;
    public float f8696a0 = 1.0f;
    public long f8706e0 = -1;
    public int f8714i0 = 720;
    public int f8716j0 = 1280;
    public final Matrix f8723n0 = new Matrix();
    public float f8735t0 = 1.0f;
    public float f8737u0 = 1.0f;
    public boolean f8744y0 = org.telegram.ui.ActionBar.h6.I.q();
    public long f8746z0 = Long.MIN_VALUE;
    public boolean D0 = true;
    public final ArrayList F0 = new ArrayList();
    public boolean G0 = true;
    public int I0 = 86400;
    public String K0 = "";
    public long S0 = 5000;
    public int f8707e1 = 0;

    public static void C(BitmapFactory.Options options, int i10) {
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i11 = options.outWidth;
        int i12 = options.outHeight;
        if (i11 * i12 * 8 <= maxMemory && Math.max(i11, i12) <= 4200 && SharedConfig.getDevicePerformanceClass() > 0) {
            return;
        }
        options.inScaled = true;
        options.inDensity = options.outWidth;
        options.inTargetDensity = i10;
    }

    public static Boolean D(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.Peer peer;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return null;
        }
        TLRPC.Chat chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(message.peer_id)));
        if ((chat != null && chat.noforwards) || !ChatObject.isChannelAndNotMegaGroup(chat)) {
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
        return Boolean.FALSE;
    }

    public static a8 a(t tVar, ArrayList arrayList) {
        a8 a8Var = new a8();
        a8Var.S = tVar;
        a8Var.T = arrayList;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a8 a8Var2 = (a8) obj;
            if (a8Var2.K) {
                a8Var.K = true;
                a8Var2.V = 0.0f;
                a8Var2.W = Math.min(1.0f, 59000.0f / ((float) a8Var2.f8712h0));
            }
        }
        if (a8Var.K) {
            a8Var.f8718k0 = 720;
            a8Var.f8720l0 = 1280;
            a8Var.f8714i0 = 720;
            a8Var.f8716j0 = 1280;
        } else {
            a8Var.f8718k0 = 1080;
            a8Var.f8720l0 = 1920;
            a8Var.f8714i0 = 1080;
            a8Var.f8716j0 = 1920;
        }
        a8Var.A();
        return a8Var;
    }

    public static int d(BitmapFactory.Options options, int i10, int i11) {
        int min;
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        if (i12 <= i11 && i13 <= i10) {
            min = 1;
        } else {
            min = Math.min((int) Math.ceil(i12 / i11), (int) Math.ceil(i13 / i10));
        }
        double d = min;
        return Math.max(1, (int) Math.pow(d, Math.floor(Math.log(d) / Math.log(2.0d))));
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
            float max = Math.max(i10 / width, i11 / height);
            drawable.setBounds(0, 0, (int) (width * max), (int) (height * max));
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
        int lastIndexOf;
        if (file != null && (lastIndexOf = (path = file.getPath()).lastIndexOf(46)) > 0) {
            return path.substring(lastIndexOf + 1);
        }
        return null;
    }

    public static a8 l(MediaController.PhotoEntry photoEntry) {
        boolean z10;
        int i10;
        a8 a8Var = new a8();
        a8Var.L = new File(photoEntry.path);
        a8Var.Q = photoEntry.orientation;
        a8Var.R = photoEntry.invert;
        if (!photoEntry.isLivePhoto() && photoEntry.isVideo) {
            z10 = true;
        } else {
            z10 = false;
        }
        a8Var.K = z10;
        a8Var.N = photoEntry.thumbPath;
        long j10 = photoEntry.duration * 1000;
        a8Var.f8712h0 = j10;
        a8Var.Z = 0.0f;
        a8Var.f8696a0 = Math.min(1.0f, 59000.0f / ((float) j10));
        if (a8Var.K && a8Var.N == null) {
            a8Var.N = "vthumb://" + photoEntry.imageId;
        }
        a8Var.A0 = photoEntry.gradientTopColor;
        a8Var.B0 = photoEntry.gradientBottomColor;
        a8Var.h(a8Var.L.getAbsolutePath());
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            a8Var.f8718k0 = i11;
            a8Var.f8720l0 = i10;
        }
        a8Var.A();
        return a8Var;
    }

    public static a8 m(int i10, File file) {
        a8 a8Var = new a8();
        a8Var.L = file;
        a8Var.M = true;
        a8Var.Q = i10;
        a8Var.R = 0;
        a8Var.K = false;
        if (file != null) {
            a8Var.h(file.getAbsolutePath());
        }
        a8Var.A();
        return a8Var;
    }

    public static a8 n(File file, TL_stories.StoryItem storyItem) {
        a8 a8Var = new a8();
        a8Var.f8710g = true;
        a8Var.f8708f = storyItem.f20506id;
        a8Var.L = file;
        a8Var.M = false;
        a8Var.f8718k0 = 720;
        a8Var.f8720l0 = 1280;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        boolean z10 = messageMedia instanceof TLRPC.TL_messageMediaPhoto;
        int i10 = a8Var.f8695a;
        if (z10) {
            a8Var.K = false;
            if (file != null) {
                a8Var.h(file.getAbsolutePath());
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            a8Var.K = true;
            TLRPC.Document document = messageMedia.document;
            if (document != null && document.attributes != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= storyItem.media.document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i11);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        a8Var.f8718k0 = documentAttribute.f20279w;
                        a8Var.f8720l0 = documentAttribute.h;
                        a8Var.f8713i = documentAttribute.duration;
                        break;
                    }
                    i11++;
                }
            }
            TLRPC.Document document2 = storyItem.media.document;
            if (document2 != null) {
                String str = storyItem.firstFramePath;
                if (str != null) {
                    a8Var.N = str;
                } else if (document2.thumbs != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= storyItem.media.document.thumbs.size()) {
                            break;
                        }
                        TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i12);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            a8Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                            break;
                        }
                        File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(photoSize, true);
                        if (pathToAttach != null && pathToAttach.exists()) {
                            a8Var.N = pathToAttach.getAbsolutePath();
                            break;
                        }
                        i12++;
                    }
                }
            }
        }
        ArrayList arrayList = a8Var.F0;
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
        a8Var.I0 = storyItem.expire_date - storyItem.date;
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(new SpannableString(storyItem.caption), org.telegram.ui.ActionBar.h6.f21185o2.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(replaceEmoji, storyItem.entities, true, false, true, false);
            a8Var.C0 = MessageObject.replaceAnimatedEmoji(replaceEmoji, storyItem.entities, org.telegram.ui.ActionBar.h6.f21185o2.getFontMetricsInt());
        } catch (Exception unused) {
        }
        a8Var.A();
        a8Var.e(storyItem);
        a8Var.f8721m = storyItem.media_areas;
        a8Var.f8738v0 = MessagesController.getInstance(i10).getInputPeer(storyItem.dialogId);
        return a8Var;
    }

    public static a8 o(File file, String str, long j10) {
        a8 a8Var = new a8();
        a8Var.f8703c1 = true;
        a8Var.L = file;
        a8Var.M = true;
        a8Var.Q = 0;
        a8Var.R = 0;
        a8Var.K = true;
        a8Var.f8712h0 = j10;
        a8Var.N = str;
        a8Var.Z = 0.0f;
        a8Var.f8696a0 = Math.min(1.0f, 59500.0f / ((float) j10));
        return a8Var;
    }

    public static long p(MessageObject messageObject) {
        Boolean D = D(messageObject);
        if (D == null) {
            return 0L;
        }
        if (D.booleanValue()) {
            return DialogObject.getPeerDialogId(messageObject.messageOwner.fwd_from.from_id);
        }
        return messageObject.getDialogId();
    }

    public static Bitmap q(y7 y7Var, int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        boolean z11;
        if (i12 != 90 && i12 != 270) {
            i14 = i10;
            i13 = i11;
        } else {
            i13 = i10;
            i14 = i11;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        y7Var.k(options);
        options.inJustDecodeBounds = false;
        options.inScaled = false;
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i15 = options.outWidth;
        int i16 = options.outHeight;
        if (((i14 * i13 * 4) + (i15 * i16 * 4)) * 1.1d <= maxMemory) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i15 <= i14 && i16 <= i13) {
            return y7Var.k(options);
        }
        if (z10 && z11 && SharedConfig.getDevicePerformanceClass() >= 1) {
            Bitmap k10 = y7Var.k(options);
            float max = Math.max(i14 / k10.getWidth(), i13 / k10.getHeight());
            Bitmap createBitmap = Bitmap.createBitmap((int) (k10.getWidth() * max), (int) (k10.getHeight() * max), Bitmap.Config.ARGB_8888);
            Utilities.libyuvARGBSaleBitmap(k10, createBitmap, Utilities.libyuv_ScaleFilter.Box);
            Utilities.clamp(Math.round(1.0f / max), 8, 0);
            return createBitmap;
        }
        options.inScaled = true;
        int i17 = options.outWidth;
        int i18 = options.outHeight;
        if (i14 / i17 > i13 / i18) {
            options.inDensity = i17;
            options.inTargetDensity = i14;
        } else {
            options.inDensity = i18;
            options.inTargetDensity = i13;
        }
        return y7Var.k(options);
    }

    public static boolean u(TLRPC.Document document, String str) {
        long j10;
        if (document != null) {
            if (!"video/webm".equals(document.mime_type) && !"video/mp4".equals(document.mime_type)) {
                if (MessageObject.isAnimatedStickerDocument(document, true)) {
                    RLottieNative a2 = RLottieNative.a(str, null, null, null, 0, null);
                    if (a2 != null) {
                        int i10 = a2.f24297a[0];
                        a2.d();
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
        TLRPC.TL_videoSize_layer127 tL_videoSize_layer127;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
        tL_fileLocationToBeDeprecated.dc_id = Integer.MIN_VALUE;
        tL_fileLocationToBeDeprecated.local_id = SharedConfig.getLastLocalId();
        tL_fileLocationToBeDeprecated.file_reference = new byte[0];
        if (!"mp4".equals(str) && !"webm".equals(str)) {
            ?? tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.location = tL_fileLocationToBeDeprecated;
            tL_videoSize_layer127 = tL_photoSize_layer127;
        } else {
            TLRPC.TL_videoSize_layer127 tL_videoSize_layer1272 = new TLRPC.TL_videoSize_layer127();
            tL_videoSize_layer1272.location = tL_fileLocationToBeDeprecated;
            tL_videoSize_layer127 = tL_videoSize_layer1272;
        }
        return FileLoader.getInstance(i10).getPathToAttach(tL_videoSize_layer127, str, true);
    }

    public static File x(int i10, boolean z10) {
        String str;
        if (z10) {
            str = "mp4";
        } else {
            str = "jpg";
        }
        return w(i10, str);
    }

    public static a8 y(ArrayList arrayList) {
        MessageObject messageObject;
        int i10;
        a8 a8Var = new a8();
        a8Var.f8736u = true;
        a8Var.v = arrayList;
        a8Var.f8714i0 = 1080;
        a8Var.f8716j0 = 1920;
        a8Var.f8746z0 = p((MessageObject) arrayList.get(0));
        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
        mediaEntity.type = (byte) 6;
        mediaEntity.f17821x = 0.5f;
        mediaEntity.f17822y = 0.5f;
        ArrayList arrayList2 = new ArrayList();
        a8Var.T0 = arrayList2;
        arrayList2.add(mediaEntity);
        if (arrayList.size() == 1 && (messageObject = (MessageObject) arrayList.get(0)) != null && ((i10 = messageObject.type) == 8 || i10 == 3 || i10 == 5)) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && message.attachPath != null) {
                a8Var.L = new File(messageObject.messageOwner.attachPath);
            }
            File file = a8Var.L;
            if (file == null || !file.exists()) {
                a8Var.L = FileLoader.getInstance(a8Var.f8695a).getPathToMessage(messageObject.messageOwner);
            }
            File file2 = a8Var.L;
            if (file2 != null && file2.exists()) {
                a8Var.K = true;
                a8Var.M = false;
                long duration = (long) (messageObject.getDuration() * 1000.0d);
                a8Var.f8712h0 = duration;
                a8Var.Z = 0.0f;
                a8Var.f8696a0 = Math.min(1.0f, 59500.0f / ((float) duration));
                return a8Var;
            }
            a8Var.L = null;
        }
        return a8Var;
    }

    public final void A() {
        float f7;
        Matrix matrix = this.f8723n0;
        matrix.reset();
        int i10 = this.f8718k0;
        int i11 = this.f8720l0;
        int i12 = this.Q;
        int i13 = this.R;
        float f10 = 1.0f;
        if (i13 == 1) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        if (i13 == 2) {
            f10 = -1.0f;
        }
        matrix.postScale(f7, f10, i10 / 2.0f, i11 / 2.0f);
        if (i12 != 0) {
            matrix.postTranslate((-i10) / 2.0f, (-i11) / 2.0f);
            matrix.postRotate(i12);
            if (i12 == 90 || i12 == 270) {
                i11 = i10;
                i10 = i11;
            }
            matrix.postTranslate(i10 / 2.0f, i11 / 2.0f);
        }
        float f11 = i10;
        float f12 = this.f8714i0 / f11;
        if (this.J0 != 0) {
            f12 = Math.min(f12, this.f8716j0 / i11);
        } else {
            float f13 = i11;
            if (f13 / f11 > 1.29f) {
                f12 = Math.max(f12, this.f8716j0 / f13);
            }
        }
        matrix.postScale(f12, f12);
        matrix.postTranslate(com.google.android.gms.internal.play_billing.k3.c(f11, f12, this.f8714i0, 2.0f), com.google.android.gms.internal.play_billing.k3.c(i11, f12, this.f8716j0, 2.0f));
    }

    public final void B() {
        long j10;
        if (this.K && !v() && !this.f8710g && !this.f8722n && this.f8712h0 > 69000 && UserConfig.getInstance(this.f8695a).isPremium()) {
            long j11 = this.f8712h0 - 59000;
            if (j11 > 10000) {
                j10 = Math.min(59000L, j11) + 59000;
            } else {
                j10 = 59000;
            }
            long j12 = this.f8712h0 - j10;
            if (j12 > 10000) {
                j10 += Math.min(59000L, j12);
            }
            this.f8696a0 = Math.min(1.0f, ((float) j10) / ((float) this.f8712h0));
        }
    }

    public final boolean E() {
        ArrayList arrayList;
        ArrayList<VideoEditedInfo.EmojiEntity> arrayList2;
        MessageObject messageObject;
        TLRPC.Message message;
        ArrayList arrayList3 = this.T0;
        if (!this.K && this.f8743y == null && this.f8725o0 == null && ((arrayList = this.v) == null || arrayList.size() != 1 || (messageObject = (MessageObject) this.v.get(0)) == null || (message = messageObject.messageOwner) == null || !(message.action instanceof TLRPC.TL_messageActionStarGiftUnique))) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                    VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList3.get(i10);
                    byte b10 = mediaEntity.type;
                    if (b10 == 0) {
                        if (!u(mediaEntity.document, mediaEntity.text)) {
                        }
                    } else {
                        if (b10 == 1 && (arrayList2 = mediaEntity.entities) != null && !arrayList2.isEmpty()) {
                            for (int i11 = 0; i11 < mediaEntity.entities.size(); i11++) {
                                VideoEditedInfo.EmojiEntity emojiEntity = mediaEntity.entities.get(i11);
                                if (!u(emojiEntity.document, emojiEntity.documentAbsolutePath)) {
                                }
                            }
                            continue;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final android.graphics.Bitmap b(android.graphics.Bitmap r27, float r28) {
        throw new UnsupportedOperationException("Method not decompiled: ei.a8.b(android.graphics.Bitmap, float):android.graphics.Bitmap");
    }

    public final void c(File file) {
        Bitmap b10 = b(null, 1.0f);
        Bitmap bitmap = this.f8700b1;
        if (bitmap != null) {
            bitmap.recycle();
            this.f8700b1 = null;
        }
        this.f8700b1 = Bitmap.createScaledBitmap(b10, 40, 22, true);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            b10.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        b10.recycle();
    }

    public final void e(TL_stories.StoryItem storyItem) {
        if (storyItem != null && storyItem.media != null) {
            TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Photo photo = messageMedia.photo;
            if (photo != null) {
                if (photo.has_stickers) {
                    TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    tL_inputStickeredMediaPhoto.f20342id = tL_inputPhoto;
                    tL_inputPhoto.f20291id = photo.f20296id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    byte[] bArr = photo.file_reference;
                    tL_inputPhoto.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputPhoto.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
                    this.f8707e1 = ConnectionsManager.getInstance(this.f8695a).sendRequest(tL_messages_getAttachedStickers, new ai.w2(this, storyItem, tL_messages_getAttachedStickers, new ai.h(this, 11), 6));
                }
            } else {
                TLRPC.Document document = messageMedia.document;
                if (document != null && MessageObject.isDocumentHasAttachedStickers(document)) {
                    TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputStickeredMediaDocument.f20341id = tL_inputDocument;
                    tL_inputDocument.f20284id = document.f20278id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr2 = document.file_reference;
                    tL_inputDocument.file_reference = bArr2;
                    if (bArr2 == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
                    this.f8707e1 = ConnectionsManager.getInstance(this.f8695a).sendRequest(tL_messages_getAttachedStickers, new ai.w2(this, storyItem, tL_messages_getAttachedStickers, new ai.h(this, 11), 6));
                }
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

    public final a8 g() {
        a8 a8Var = new a8();
        a8Var.f8698b = this.f8698b;
        a8Var.f8701c = this.f8701c;
        a8Var.d = this.d;
        a8Var.e = this.e;
        a8Var.f8708f = this.f8708f;
        a8Var.f8710g = this.f8710g;
        a8Var.h = this.h;
        a8Var.f8713i = this.f8713i;
        a8Var.f8715j = this.f8715j;
        a8Var.f8717k = this.f8717k;
        a8Var.f8719l = this.f8719l;
        a8Var.f8721m = this.f8721m;
        a8Var.f8739w = this.f8739w;
        a8Var.f8741x = this.f8741x;
        a8Var.f8743y = this.f8743y;
        a8Var.f8745z = this.f8745z;
        a8Var.A = this.A;
        a8Var.B = this.B;
        a8Var.C = this.C;
        a8Var.D = this.D;
        a8Var.E = this.E;
        a8Var.F = this.F;
        a8Var.G = this.G;
        a8Var.H = this.H;
        a8Var.I = this.I;
        a8Var.J = this.J;
        a8Var.K = this.K;
        a8Var.L = this.L;
        a8Var.M = this.M;
        boolean z10 = this.M;
        int i10 = this.f8695a;
        if (z10) {
            File w9 = w(i10, k(this.L));
            a8Var.L = w9;
            AndroidUtilities.copyFileSafe(this.L, w9);
        }
        a8Var.N = this.N;
        a8Var.Y = this.Y;
        a8Var.Z = this.Z;
        a8Var.f8696a0 = this.f8696a0;
        a8Var.f8712h0 = this.f8712h0;
        a8Var.f8718k0 = this.f8718k0;
        a8Var.f8720l0 = this.f8720l0;
        a8Var.f8714i0 = this.f8714i0;
        a8Var.f8716j0 = this.f8716j0;
        a8Var.f8738v0 = this.f8738v0;
        a8Var.R = this.R;
        a8Var.f8723n0.set(this.f8723n0);
        a8Var.A0 = this.A0;
        a8Var.B0 = this.B0;
        a8Var.C0 = this.C0;
        a8Var.D0 = this.D0;
        a8Var.E0 = this.E0;
        ArrayList arrayList = a8Var.F0;
        arrayList.clear();
        arrayList.addAll(this.F0);
        a8Var.G0 = this.G0;
        a8Var.H0 = this.H0;
        a8Var.I0 = this.I0;
        a8Var.M0 = this.M0;
        a8Var.N0 = this.N0;
        a8Var.f8740w0 = this.f8740w0;
        File file = this.N0;
        if (file != null && file.exists()) {
            File w10 = w(i10, k(this.N0));
            a8Var.N0 = w10;
            AndroidUtilities.copyFileSafe(this.N0, w10);
        }
        a8Var.O0 = this.O0;
        File file2 = this.O0;
        if (file2 != null && file2.exists()) {
            File w11 = w(i10, k(this.O0));
            a8Var.O0 = w11;
            AndroidUtilities.copyFileSafe(this.O0, w11);
        }
        a8Var.P0 = this.P0;
        File file3 = this.P0;
        if (file3 != null && file3.exists()) {
            File w12 = w(i10, k(this.P0));
            a8Var.P0 = w12;
            AndroidUtilities.copyFileSafe(this.P0, w12);
        }
        a8Var.W0 = this.W0;
        File file4 = this.W0;
        if (file4 != null && file4.exists()) {
            File w13 = w(i10, k(this.W0));
            a8Var.W0 = w13;
            AndroidUtilities.copyFileSafe(this.W0, w13);
        }
        a8Var.Y0 = this.Y0;
        File file5 = this.Y0;
        if (file5 != null && file5.exists()) {
            File w14 = w(i10, k(this.Y0));
            a8Var.Y0 = w14;
            AndroidUtilities.copyFileSafe(this.Y0, w14);
        }
        a8Var.Q0 = this.Q0;
        File file6 = this.Q0;
        if (file6 != null && file6.exists()) {
            File w15 = w(i10, k(this.Q0));
            a8Var.Q0 = w15;
            AndroidUtilities.copyFileSafe(this.Q0, w15);
        }
        a8Var.R0 = this.R0;
        File file7 = this.R0;
        if (file7 != null && file7.exists()) {
            File w16 = w(i10, k(this.R0));
            a8Var.R0 = w16;
            AndroidUtilities.copyFileSafe(this.R0, w16);
        }
        a8Var.S0 = this.S0;
        a8Var.T0 = new ArrayList();
        if (this.T0 != null) {
            for (int i11 = 0; i11 < this.T0.size(); i11++) {
                a8Var.T0.add(((VideoEditedInfo.MediaEntity) this.T0.get(i11)).copy());
            }
        }
        a8Var.U0 = this.U0;
        a8Var.V0 = this.V0;
        a8Var.Z0 = this.Z0;
        File file8 = this.Z0;
        if (file8 != null && file8.exists()) {
            File w17 = w(i10, k(this.Z0));
            a8Var.Z0 = w17;
            AndroidUtilities.copyFileSafe(this.Z0, w17);
        }
        a8Var.f8697a1 = this.f8697a1;
        a8Var.f8700b1 = this.f8700b1;
        a8Var.f8703c1 = this.f8703c1;
        a8Var.O = this.O;
        a8Var.f8722n = this.f8722n;
        a8Var.f8724o = this.f8724o;
        a8Var.f8725o0 = this.f8725o0;
        a8Var.f8733s0 = this.f8733s0;
        a8Var.f8735t0 = this.f8735t0;
        a8Var.f8729q0 = this.f8729q0;
        a8Var.f8727p0 = this.f8727p0;
        a8Var.f8731r0 = this.f8731r0;
        a8Var.f8737u0 = this.f8737u0;
        a8Var.f8699b0 = this.f8699b0;
        a8Var.J0 = this.J0;
        a8Var.K0 = this.K0;
        a8Var.L0 = this.L0;
        a8Var.f8706e0 = this.f8706e0;
        a8Var.T = this.T;
        a8Var.S = this.S;
        a8Var.U = this.U;
        a8Var.X = this.X;
        a8Var.P = this.P;
        return a8Var;
    }

    public final void h(String str) {
        if (str != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                this.f8718k0 = options.outWidth;
                this.f8720l0 = options.outHeight;
            } catch (Exception unused) {
            }
        }
        if (!this.K) {
            if (((int) Math.max(this.f8718k0, (this.f8720l0 / 16.0f) * 9.0f)) <= 900) {
                this.f8714i0 = 720;
                this.f8716j0 = 1280;
                return;
            }
            this.f8714i0 = 1080;
            this.f8716j0 = 1920;
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
                if (this.M && (!this.f8710g || this.f8715j)) {
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
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        mediaEntity.segmentedPath = "";
                    }
                }
            }
            File file4 = this.f8725o0;
            if (file4 != null && (!this.f8710g || this.f8715j)) {
                file4.delete();
                this.f8725o0 = null;
            }
            if (this.f8727p0 != null && (!this.f8710g || this.f8715j)) {
                try {
                    new File(this.f8727p0).delete();
                } catch (Exception unused) {
                }
                this.f8727p0 = null;
            }
        }
        this.O = null;
        if (this.T != null) {
            for (int i11 = 0; i11 < this.T.size(); i11++) {
                ((a8) this.T.get(i11)).i(z10);
            }
        }
        if (this.f8707e1 != 0) {
            ConnectionsManager.getInstance(this.f8695a).cancelRequest(this.f8707e1, true);
        }
    }

    public final int r() {
        long j10;
        if (this.K && !v() && !this.f8710g) {
            long j11 = this.f8712h0;
            if (j11 > 0 && !this.f8722n) {
                if ((this.f8696a0 - this.Z) * ((float) j11) >= 68999) {
                    return (int) Math.ceil(((float) j10) / 59000.0f);
                }
                return 1;
            }
            return 1;
        }
        return 1;
    }

    public final void s(Utilities.Callback callback) {
        String absolutePath;
        int i10;
        String absolutePath2;
        int i11;
        if (!E()) {
            callback.run(null);
            return;
        }
        if (!this.K && ((i11 = this.f8714i0) > 720 || this.f8716j0 > 1280)) {
            float f7 = 720.0f / i11;
            this.f8723n0.postScale(f7, f7, 0.0f, 0.0f);
            this.f8714i0 = 720;
            this.f8716j0 = 1280;
        }
        File file = this.L;
        if (file == null) {
            absolutePath = null;
        } else {
            absolutePath = file.getAbsolutePath();
        }
        if (v()) {
            i10 = this.T.size();
        } else {
            i10 = 0;
        }
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, Math.max(1, i10), 11);
        iArr[0] = new int[11];
        ai.y0 y0Var = new ai.y0(this, absolutePath, iArr, callback, 12);
        if (v()) {
            String[] strArr = new String[this.T.size()];
            for (int i12 = 0; i12 < this.T.size(); i12++) {
                if (((a8) this.T.get(i12)).L == null) {
                    absolutePath2 = null;
                } else {
                    absolutePath2 = ((a8) this.T.get(i12)).L.getAbsolutePath();
                }
                strArr[i12] = absolutePath2;
                iArr[i12] = new int[11];
            }
            Utilities.globalQueue.postRunnable(new z1(strArr, iArr, y0Var, 4));
        } else if (this.L == null) {
            y0Var.run();
        } else {
            Utilities.globalQueue.postRunnable(new z1(absolutePath, iArr, y0Var));
        }
    }

    public final boolean t() {
        if (v()) {
            for (int i10 = 0; i10 < this.T.size(); i10++) {
                if (((a8) this.T.get(i10)).K) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean v() {
        if (this.S != null && this.T != null) {
            return true;
        }
        return false;
    }

    public final void z(Runnable runnable) {
        Bitmap bitmap;
        if (this.K && this.A0 == 0 && this.B0 == 0) {
            if (this.N != null) {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    if (this.N.startsWith("vthumb://")) {
                        long parseInt = Integer.parseInt(this.N.substring(9));
                        options.inJustDecodeBounds = true;
                        MediaStore.Video.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), parseInt, 1, options);
                        options.inSampleSize = d(options, 240, 240);
                        options.inJustDecodeBounds = false;
                        options.inPreferredConfig = Bitmap.Config.RGB_565;
                        options.inDither = true;
                        bitmap = MediaStore.Video.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), parseInt, 1, options);
                    } else {
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(this.N);
                        options.inSampleSize = d(options, 240, 240);
                        options.inJustDecodeBounds = false;
                        options.inPreferredConfig = Bitmap.Config.RGB_565;
                        options.inDither = true;
                        bitmap = BitmapFactory.decodeFile(this.N);
                    }
                } catch (Exception unused) {
                    bitmap = null;
                }
                if (bitmap != null) {
                    int[] b10 = n0.b(bitmap, true);
                    this.A0 = b10[0];
                    this.B0 = b10[1];
                    bitmap.recycle();
                    runnable.run();
                    return;
                }
                return;
            }
            Bitmap bitmap2 = this.O;
            if (bitmap2 != null) {
                int[] b11 = n0.b(bitmap2, true);
                this.A0 = b11[0];
                this.B0 = b11[1];
                runnable.run();
            }
        }
    }
}
