package nh;

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
public final class o7 {
    public String A;
    public int A0;
    public String B;
    public int B0;
    public long C;
    public CharSequence C0;
    public long D;
    public float E;
    public c9 E0;
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
    public MediaController.SavedFilterState f18256a1;
    public long f18257b;
    public boolean f18258b0;
    public Bitmap f18259b1;
    public boolean f18260c;
    public TLRPC.Document f18261c0;
    public boolean f18262c1;
    public long d;
    public ih.i f18263d0;
    public n7 f18264d1;
    public long f18265e;
    public int f18268f;
    public boolean f18269f0;
    public boolean f18270g;
    public Bitmap f18271g0;
    public boolean h;
    public long f18272h0;
    public boolean f18275j;
    public boolean f18277k;
    public int f18278k0;
    public boolean f18279l;
    public int f18280l0;
    public ArrayList f18281m;
    public MediaController.CropState m0;
    public boolean f18282n;
    public boolean f18284o;
    public File f18285o0;
    public SpannableStringBuilder f18286p;
    public String f18287p0;
    public TLRPC.Peer f18288q;
    public long f18289q0;
    public int f18290r;
    public long f18291r0;
    public String f18292s;
    public float f18293s0;
    public TLRPC.MessageMedia f18294t;
    public boolean f18296u;
    public ArrayList v;
    public TLRPC.InputPeer f18298v0;
    public boolean f18299w;
    public HashSet f18300w0;
    public TLRPC.TL_error f18301x;
    public Drawable f18302x0;
    public String f18303y;
    public TLRPC.InputDocument f18305z;
    public final int f18254a = UserConfig.selectedAccount;
    public double f18273i = -1.0d;
    public float F = 1.0f;
    public float G = 1.0f;
    public float P = 1.0f;
    public boolean U = false;
    public float V = 0.0f;
    public float W = 1.0f;
    public float f18255a0 = 1.0f;
    public long f18266e0 = -1;
    public int f18274i0 = 720;
    public int f18276j0 = 1280;
    public final Matrix f18283n0 = new Matrix();
    public float f18295t0 = 1.0f;
    public float f18297u0 = 1.0f;
    public boolean f18304y0 = org.telegram.ui.ActionBar.g6.I.q();
    public long f18306z0 = Long.MIN_VALUE;
    public boolean D0 = true;
    public final ArrayList F0 = new ArrayList();
    public boolean G0 = true;
    public int I0 = 86400;
    public String K0 = "";
    public long S0 = 5000;
    public int f18267e1 = 0;

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

    public static o7 a(t tVar, ArrayList arrayList) {
        o7 o7Var = new o7();
        o7Var.S = tVar;
        o7Var.T = arrayList;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            o7 o7Var2 = (o7) obj;
            if (o7Var2.K) {
                o7Var.K = true;
                o7Var2.V = 0.0f;
                o7Var2.W = Math.min(1.0f, 59000.0f / ((float) o7Var2.f18272h0));
            }
        }
        if (o7Var.K) {
            o7Var.f18278k0 = 720;
            o7Var.f18280l0 = 1280;
            o7Var.f18274i0 = 720;
            o7Var.f18276j0 = 1280;
        } else {
            o7Var.f18278k0 = 1080;
            o7Var.f18280l0 = 1920;
            o7Var.f18274i0 = 1080;
            o7Var.f18276j0 = 1920;
        }
        o7Var.A();
        return o7Var;
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

    public static o7 l(MediaController.PhotoEntry photoEntry) {
        boolean z10;
        int i10;
        o7 o7Var = new o7();
        o7Var.L = new File(photoEntry.path);
        o7Var.Q = photoEntry.orientation;
        o7Var.R = photoEntry.invert;
        if (!photoEntry.isLivePhoto() && photoEntry.isVideo) {
            z10 = true;
        } else {
            z10 = false;
        }
        o7Var.K = z10;
        o7Var.N = photoEntry.thumbPath;
        long j10 = photoEntry.duration * 1000;
        o7Var.f18272h0 = j10;
        o7Var.Z = 0.0f;
        o7Var.f18255a0 = Math.min(1.0f, 59000.0f / ((float) j10));
        if (o7Var.K && o7Var.N == null) {
            o7Var.N = "vthumb://" + photoEntry.imageId;
        }
        o7Var.A0 = photoEntry.gradientTopColor;
        o7Var.B0 = photoEntry.gradientBottomColor;
        o7Var.h(o7Var.L.getAbsolutePath());
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            o7Var.f18278k0 = i11;
            o7Var.f18280l0 = i10;
        }
        o7Var.A();
        return o7Var;
    }

    public static o7 m(int i10, File file) {
        o7 o7Var = new o7();
        o7Var.L = file;
        o7Var.M = true;
        o7Var.Q = i10;
        o7Var.R = 0;
        o7Var.K = false;
        if (file != null) {
            o7Var.h(file.getAbsolutePath());
        }
        o7Var.A();
        return o7Var;
    }

    public static o7 n(File file, TL_stories.StoryItem storyItem) {
        o7 o7Var = new o7();
        o7Var.f18270g = true;
        o7Var.f18268f = storyItem.f22629id;
        o7Var.L = file;
        o7Var.M = false;
        o7Var.f18278k0 = 720;
        o7Var.f18280l0 = 1280;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        boolean z10 = messageMedia instanceof TLRPC.TL_messageMediaPhoto;
        int i10 = o7Var.f18254a;
        if (z10) {
            o7Var.K = false;
            if (file != null) {
                o7Var.h(file.getAbsolutePath());
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            o7Var.K = true;
            TLRPC.Document document = messageMedia.document;
            if (document != null && document.attributes != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= storyItem.media.document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i11);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        o7Var.f18278k0 = documentAttribute.f22399w;
                        o7Var.f18280l0 = documentAttribute.h;
                        o7Var.f18273i = documentAttribute.duration;
                        break;
                    }
                    i11++;
                }
            }
            TLRPC.Document document2 = storyItem.media.document;
            if (document2 != null) {
                String str = storyItem.firstFramePath;
                if (str != null) {
                    o7Var.N = str;
                } else if (document2.thumbs != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= storyItem.media.document.thumbs.size()) {
                            break;
                        }
                        TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i12);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            o7Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                            break;
                        }
                        File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(photoSize, true);
                        if (pathToAttach != null && pathToAttach.exists()) {
                            o7Var.N = pathToAttach.getAbsolutePath();
                            break;
                        }
                        i12++;
                    }
                }
            }
        }
        ArrayList arrayList = o7Var.F0;
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
        o7Var.I0 = storyItem.expire_date - storyItem.date;
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(new SpannableString(storyItem.caption), org.telegram.ui.ActionBar.g6.f23256o2.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(replaceEmoji, storyItem.entities, true, false, true, false);
            o7Var.C0 = MessageObject.replaceAnimatedEmoji(replaceEmoji, storyItem.entities, org.telegram.ui.ActionBar.g6.f23256o2.getFontMetricsInt());
        } catch (Exception unused) {
        }
        o7Var.A();
        o7Var.e(storyItem);
        o7Var.f18281m = storyItem.media_areas;
        o7Var.f18298v0 = MessagesController.getInstance(i10).getInputPeer(storyItem.dialogId);
        return o7Var;
    }

    public static o7 o(File file, String str, long j10) {
        o7 o7Var = new o7();
        o7Var.f18262c1 = true;
        o7Var.L = file;
        o7Var.M = true;
        o7Var.Q = 0;
        o7Var.R = 0;
        o7Var.K = true;
        o7Var.f18272h0 = j10;
        o7Var.N = str;
        o7Var.Z = 0.0f;
        o7Var.f18255a0 = Math.min(1.0f, 59500.0f / ((float) j10));
        return o7Var;
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

    public static Bitmap q(m7 m7Var, int i10, int i11, int i12, boolean z10) {
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
        m7Var.h(options);
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
            return m7Var.h(options);
        }
        if (z10 && z11 && SharedConfig.getDevicePerformanceClass() >= 1) {
            Bitmap h = m7Var.h(options);
            float max = Math.max(i14 / h.getWidth(), i13 / h.getHeight());
            Bitmap createBitmap = Bitmap.createBitmap((int) (h.getWidth() * max), (int) (h.getHeight() * max), Bitmap.Config.ARGB_8888);
            Utilities.libyuvARGBSaleBitmap(h, createBitmap, Utilities.libyuv_ScaleFilter.Box);
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
        return m7Var.h(options);
    }

    public static boolean u(TLRPC.Document document, String str) {
        long j10;
        if (document != null) {
            if (!"video/webm".equals(document.mime_type) && !"video/mp4".equals(document.mime_type)) {
                if (MessageObject.isAnimatedStickerDocument(document, true)) {
                    RLottieNative a2 = RLottieNative.a(str, null, 0, 0, null, false, null, false, 0, null);
                    if (a2 != null) {
                        int i10 = a2.f26476a[0];
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

    public static o7 y(ArrayList arrayList) {
        MessageObject messageObject;
        int i10;
        o7 o7Var = new o7();
        o7Var.f18296u = true;
        o7Var.v = arrayList;
        o7Var.f18274i0 = 1080;
        o7Var.f18276j0 = 1920;
        o7Var.f18306z0 = p((MessageObject) arrayList.get(0));
        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
        mediaEntity.type = (byte) 6;
        mediaEntity.f19644x = 0.5f;
        mediaEntity.f19645y = 0.5f;
        ArrayList arrayList2 = new ArrayList();
        o7Var.T0 = arrayList2;
        arrayList2.add(mediaEntity);
        if (arrayList.size() == 1 && (messageObject = (MessageObject) arrayList.get(0)) != null && ((i10 = messageObject.type) == 8 || i10 == 3 || i10 == 5)) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && message.attachPath != null) {
                o7Var.L = new File(messageObject.messageOwner.attachPath);
            }
            File file = o7Var.L;
            if (file == null || !file.exists()) {
                o7Var.L = FileLoader.getInstance(o7Var.f18254a).getPathToMessage(messageObject.messageOwner);
            }
            File file2 = o7Var.L;
            if (file2 != null && file2.exists()) {
                o7Var.K = true;
                o7Var.M = false;
                long duration = (long) (messageObject.getDuration() * 1000.0d);
                o7Var.f18272h0 = duration;
                o7Var.Z = 0.0f;
                o7Var.f18255a0 = Math.min(1.0f, 59500.0f / ((float) duration));
                return o7Var;
            }
            o7Var.L = null;
        }
        return o7Var;
    }

    public final void A() {
        float f9;
        Matrix matrix = this.f18283n0;
        matrix.reset();
        int i10 = this.f18278k0;
        int i11 = this.f18280l0;
        int i12 = this.Q;
        int i13 = this.R;
        float f10 = 1.0f;
        if (i13 == 1) {
            f9 = -1.0f;
        } else {
            f9 = 1.0f;
        }
        if (i13 == 2) {
            f10 = -1.0f;
        }
        matrix.postScale(f9, f10, i10 / 2.0f, i11 / 2.0f);
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
        float f12 = this.f18274i0 / f11;
        if (this.J0 != 0) {
            f12 = Math.min(f12, this.f18276j0 / i11);
        } else {
            float f13 = i11;
            if (f13 / f11 > 1.29f) {
                f12 = Math.max(f12, this.f18276j0 / f13);
            }
        }
        matrix.postScale(f12, f12);
        matrix.postTranslate(com.google.android.recaptcha.internal.a.w(f11, f12, this.f18274i0, 2.0f), com.google.android.recaptcha.internal.a.w(i11, f12, this.f18276j0, 2.0f));
    }

    public final void B() {
        long j10;
        if (this.K && !v() && !this.f18270g && !this.f18282n && this.f18272h0 > 69000 && UserConfig.getInstance(this.f18254a).isPremium()) {
            long j11 = this.f18272h0 - 59000;
            if (j11 > 10000) {
                j10 = Math.min(59000L, j11) + 59000;
            } else {
                j10 = 59000;
            }
            long j12 = this.f18272h0 - j10;
            if (j12 > 10000) {
                j10 += Math.min(59000L, j12);
            }
            this.f18255a0 = Math.min(1.0f, ((float) j10) / ((float) this.f18272h0));
        }
    }

    public final boolean E() {
        ArrayList arrayList;
        ArrayList<VideoEditedInfo.EmojiEntity> arrayList2;
        MessageObject messageObject;
        TLRPC.Message message;
        ArrayList arrayList3 = this.T0;
        if (!this.K && this.f18303y == null && this.f18285o0 == null && ((arrayList = this.v) == null || arrayList.size() != 1 || (messageObject = (MessageObject) this.v.get(0)) == null || (message = messageObject.messageOwner) == null || !(message.action instanceof TLRPC.TL_messageActionStarGiftUnique))) {
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
        throw new UnsupportedOperationException("Method not decompiled: nh.o7.b(android.graphics.Bitmap, float):android.graphics.Bitmap");
    }

    public final void c(File file) {
        Bitmap b10 = b(null, 1.0f);
        Bitmap bitmap = this.f18259b1;
        if (bitmap != null) {
            bitmap.recycle();
            this.f18259b1 = null;
        }
        this.f18259b1 = Bitmap.createScaledBitmap(b10, 40, 22, true);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            b10.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e10) {
            FileLog.e(e10);
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
                    tL_inputStickeredMediaPhoto.f22462id = tL_inputPhoto;
                    tL_inputPhoto.f22411id = photo.f22416id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    byte[] bArr = photo.file_reference;
                    tL_inputPhoto.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputPhoto.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
                    this.f18267e1 = ConnectionsManager.getInstance(this.f18254a).sendRequest(tL_messages_getAttachedStickers, new ih.c1(this, storyItem, tL_messages_getAttachedStickers, new ef.a(this, 16), 7));
                }
            } else {
                TLRPC.Document document = messageMedia.document;
                if (document != null && MessageObject.isDocumentHasAttachedStickers(document)) {
                    TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputStickeredMediaDocument.f22461id = tL_inputDocument;
                    tL_inputDocument.f22404id = document.f22398id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr2 = document.file_reference;
                    tL_inputDocument.file_reference = bArr2;
                    if (bArr2 == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
                    this.f18267e1 = ConnectionsManager.getInstance(this.f18254a).sendRequest(tL_messages_getAttachedStickers, new ih.c1(this, storyItem, tL_messages_getAttachedStickers, new ef.a(this, 16), 7));
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

    public final o7 g() {
        o7 o7Var = new o7();
        o7Var.f18257b = this.f18257b;
        o7Var.f18260c = this.f18260c;
        o7Var.d = this.d;
        o7Var.f18265e = this.f18265e;
        o7Var.f18268f = this.f18268f;
        o7Var.f18270g = this.f18270g;
        o7Var.h = this.h;
        o7Var.f18273i = this.f18273i;
        o7Var.f18275j = this.f18275j;
        o7Var.f18277k = this.f18277k;
        o7Var.f18279l = this.f18279l;
        o7Var.f18281m = this.f18281m;
        o7Var.f18299w = this.f18299w;
        o7Var.f18301x = this.f18301x;
        o7Var.f18303y = this.f18303y;
        o7Var.f18305z = this.f18305z;
        o7Var.A = this.A;
        o7Var.B = this.B;
        o7Var.C = this.C;
        o7Var.D = this.D;
        o7Var.E = this.E;
        o7Var.F = this.F;
        o7Var.G = this.G;
        o7Var.H = this.H;
        o7Var.I = this.I;
        o7Var.J = this.J;
        o7Var.K = this.K;
        o7Var.L = this.L;
        o7Var.M = this.M;
        boolean z10 = this.M;
        int i10 = this.f18254a;
        if (z10) {
            File w10 = w(i10, k(this.L));
            o7Var.L = w10;
            AndroidUtilities.copyFileSafe(this.L, w10);
        }
        o7Var.N = this.N;
        o7Var.Y = this.Y;
        o7Var.Z = this.Z;
        o7Var.f18255a0 = this.f18255a0;
        o7Var.f18272h0 = this.f18272h0;
        o7Var.f18278k0 = this.f18278k0;
        o7Var.f18280l0 = this.f18280l0;
        o7Var.f18274i0 = this.f18274i0;
        o7Var.f18276j0 = this.f18276j0;
        o7Var.f18298v0 = this.f18298v0;
        o7Var.R = this.R;
        o7Var.f18283n0.set(this.f18283n0);
        o7Var.A0 = this.A0;
        o7Var.B0 = this.B0;
        o7Var.C0 = this.C0;
        o7Var.D0 = this.D0;
        o7Var.E0 = this.E0;
        ArrayList arrayList = o7Var.F0;
        arrayList.clear();
        arrayList.addAll(this.F0);
        o7Var.G0 = this.G0;
        o7Var.H0 = this.H0;
        o7Var.I0 = this.I0;
        o7Var.M0 = this.M0;
        o7Var.N0 = this.N0;
        o7Var.f18300w0 = this.f18300w0;
        File file = this.N0;
        if (file != null && file.exists()) {
            File w11 = w(i10, k(this.N0));
            o7Var.N0 = w11;
            AndroidUtilities.copyFileSafe(this.N0, w11);
        }
        o7Var.O0 = this.O0;
        File file2 = this.O0;
        if (file2 != null && file2.exists()) {
            File w12 = w(i10, k(this.O0));
            o7Var.O0 = w12;
            AndroidUtilities.copyFileSafe(this.O0, w12);
        }
        o7Var.P0 = this.P0;
        File file3 = this.P0;
        if (file3 != null && file3.exists()) {
            File w13 = w(i10, k(this.P0));
            o7Var.P0 = w13;
            AndroidUtilities.copyFileSafe(this.P0, w13);
        }
        o7Var.W0 = this.W0;
        File file4 = this.W0;
        if (file4 != null && file4.exists()) {
            File w14 = w(i10, k(this.W0));
            o7Var.W0 = w14;
            AndroidUtilities.copyFileSafe(this.W0, w14);
        }
        o7Var.Y0 = this.Y0;
        File file5 = this.Y0;
        if (file5 != null && file5.exists()) {
            File w15 = w(i10, k(this.Y0));
            o7Var.Y0 = w15;
            AndroidUtilities.copyFileSafe(this.Y0, w15);
        }
        o7Var.Q0 = this.Q0;
        File file6 = this.Q0;
        if (file6 != null && file6.exists()) {
            File w16 = w(i10, k(this.Q0));
            o7Var.Q0 = w16;
            AndroidUtilities.copyFileSafe(this.Q0, w16);
        }
        o7Var.R0 = this.R0;
        File file7 = this.R0;
        if (file7 != null && file7.exists()) {
            File w17 = w(i10, k(this.R0));
            o7Var.R0 = w17;
            AndroidUtilities.copyFileSafe(this.R0, w17);
        }
        o7Var.S0 = this.S0;
        o7Var.T0 = new ArrayList();
        if (this.T0 != null) {
            for (int i11 = 0; i11 < this.T0.size(); i11++) {
                o7Var.T0.add(((VideoEditedInfo.MediaEntity) this.T0.get(i11)).copy());
            }
        }
        o7Var.U0 = this.U0;
        o7Var.V0 = this.V0;
        o7Var.Z0 = this.Z0;
        File file8 = this.Z0;
        if (file8 != null && file8.exists()) {
            File w18 = w(i10, k(this.Z0));
            o7Var.Z0 = w18;
            AndroidUtilities.copyFileSafe(this.Z0, w18);
        }
        o7Var.f18256a1 = this.f18256a1;
        o7Var.f18259b1 = this.f18259b1;
        o7Var.f18262c1 = this.f18262c1;
        o7Var.O = this.O;
        o7Var.f18282n = this.f18282n;
        o7Var.f18284o = this.f18284o;
        o7Var.f18285o0 = this.f18285o0;
        o7Var.f18293s0 = this.f18293s0;
        o7Var.f18295t0 = this.f18295t0;
        o7Var.f18289q0 = this.f18289q0;
        o7Var.f18287p0 = this.f18287p0;
        o7Var.f18291r0 = this.f18291r0;
        o7Var.f18297u0 = this.f18297u0;
        o7Var.f18258b0 = this.f18258b0;
        o7Var.J0 = this.J0;
        o7Var.K0 = this.K0;
        o7Var.L0 = this.L0;
        o7Var.f18266e0 = this.f18266e0;
        o7Var.T = this.T;
        o7Var.S = this.S;
        o7Var.U = this.U;
        o7Var.X = this.X;
        o7Var.P = this.P;
        return o7Var;
    }

    public final void h(String str) {
        if (str != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                this.f18278k0 = options.outWidth;
                this.f18280l0 = options.outHeight;
            } catch (Exception unused) {
            }
        }
        if (!this.K) {
            if (((int) Math.max(this.f18278k0, (this.f18280l0 / 16.0f) * 9.0f)) <= 900) {
                this.f18274i0 = 720;
                this.f18276j0 = 1280;
                return;
            }
            this.f18274i0 = 1080;
            this.f18276j0 = 1920;
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
                if (this.M && (!this.f18270g || this.f18275j)) {
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
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        mediaEntity.segmentedPath = "";
                    }
                }
            }
            File file4 = this.f18285o0;
            if (file4 != null && (!this.f18270g || this.f18275j)) {
                file4.delete();
                this.f18285o0 = null;
            }
            if (this.f18287p0 != null && (!this.f18270g || this.f18275j)) {
                try {
                    new File(this.f18287p0).delete();
                } catch (Exception unused) {
                }
                this.f18287p0 = null;
            }
        }
        this.O = null;
        if (this.T != null) {
            for (int i11 = 0; i11 < this.T.size(); i11++) {
                ((o7) this.T.get(i11)).i(z10);
            }
        }
        if (this.f18267e1 != 0) {
            ConnectionsManager.getInstance(this.f18254a).cancelRequest(this.f18267e1, true);
        }
    }

    public final int r() {
        long j10;
        if (this.K && !v() && !this.f18270g) {
            long j11 = this.f18272h0;
            if (j11 > 0 && !this.f18282n) {
                if ((this.f18255a0 - this.Z) * ((float) j11) >= 68999) {
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
        if (!this.K && ((i11 = this.f18274i0) > 720 || this.f18276j0 > 1280)) {
            float f9 = 720.0f / i11;
            this.f18283n0.postScale(f9, f9, 0.0f, 0.0f);
            this.f18274i0 = 720;
            this.f18276j0 = 1280;
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
        androidx.car.app.utils.c cVar = new androidx.car.app.utils.c(this, absolutePath, iArr, callback);
        if (v()) {
            String[] strArr = new String[this.T.size()];
            for (int i12 = 0; i12 < this.T.size(); i12++) {
                if (((o7) this.T.get(i12)).L == null) {
                    absolutePath2 = null;
                } else {
                    absolutePath2 = ((o7) this.T.get(i12)).L.getAbsolutePath();
                }
                strArr[i12] = absolutePath2;
                iArr[i12] = new int[11];
            }
            Utilities.globalQueue.postRunnable(new l3.m(strArr, iArr, cVar, 14));
        } else if (this.L == null) {
            cVar.run();
        } else {
            Utilities.globalQueue.postRunnable(new l3.m(absolutePath, iArr, cVar, 15));
        }
    }

    public final boolean t() {
        if (v()) {
            for (int i10 = 0; i10 < this.T.size(); i10++) {
                if (((o7) this.T.get(i10)).K) {
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
