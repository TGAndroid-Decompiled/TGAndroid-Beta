package bi;

import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class e1 {
    public final long A;
    public final ArrayList B;
    public final List C;
    public final String D;
    public final MediaController.SavedFilterState E;
    public final int F;
    public boolean G;
    public int H;
    public long I;
    public long J;
    public long K;
    public long L;
    public final boolean M;
    public final TLRPC.TL_error N;
    public final String O;
    public final TLRPC.InputDocument P;
    public final String Q;
    public final String R;
    public final long S;
    public final long T;
    public final float U;
    public final float V;
    public final float W;
    public final String X;
    public final String Y;
    public final long Z;
    public long f2578a;
    public final long f2579a0;
    public final long f2580b;
    public final float f2581b0;
    public final String f2582c;
    public final float f2583c0;
    public final String d;
    public final float f2584d0;
    public final boolean e;
    public final float f2585e0;
    public final String f2586f;
    public final TLRPC.InputPeer f2587f0;
    public final boolean f2588g;
    public final long f2589g0;
    public final boolean h;
    public final String f2590h0;
    public final long f2591i;
    public final TLRPC.InputMedia f2592i0;
    public final long f2593j;
    public final x f2594j0;
    public final int f2595k;
    public final ArrayList f2596k0;
    public final int f2597l;
    public final int f2598m;
    public final int f2599n;
    public final MediaController.CropState f2600o;
    public final int f2601p;
    public final int f2602q;
    public final long f2603r;
    public final float[] f2604s;
    public final int f2605t;
    public final int f2606u;
    public final String v;
    public final ArrayList f2607w;
    public final ArrayList f2608x;
    public final String f2609y;
    public final String f2610z;

    public e1(r9 r9Var) {
        float[] fArr = new float[9];
        this.f2604s = fArr;
        ArrayList arrayList = new ArrayList();
        this.f2608x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.f2584d0 = 1.0f;
        this.f2585e0 = 1.0f;
        this.f2578a = r9Var.f3562b;
        this.f2580b = r9Var.d;
        File file = r9Var.O0;
        this.f2582c = file == null ? "" : file.toString();
        File file2 = r9Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.e = r9Var.K;
        File file3 = r9Var.L;
        this.f2586f = file3 == null ? "" : file3.toString();
        this.f2588g = r9Var.M;
        this.h = r9Var.Y;
        float f7 = r9Var.Z;
        long j3 = r9Var.f3576h0;
        this.f2591i = f7 * ((float) j3);
        this.f2593j = r9Var.f3560a0 * ((float) j3);
        this.f2595k = r9Var.Q;
        this.f2597l = r9Var.R;
        this.f2598m = r9Var.f3582k0;
        this.f2599n = r9Var.f3584l0;
        this.f2600o = r9Var.m0;
        this.f2601p = r9Var.f3578i0;
        this.f2602q = r9Var.f3580j0;
        this.f2603r = j3;
        r9Var.f3587n0.getValues(fArr);
        this.f2605t = r9Var.A0;
        this.f2606u = r9Var.B0;
        CharSequence[] charSequenceArr = {r9Var.C0};
        this.f2607w = r9Var.D0 ? MediaDataController.getInstance(r9Var.f3559a).getEntities(charSequenceArr, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(r9Var.F0);
        File file4 = r9Var.P0;
        this.f2609y = file4 == null ? "" : file4.toString();
        File file5 = r9Var.R0;
        this.f2610z = file5 == null ? "" : file5.toString();
        this.A = r9Var.S0;
        this.B = r9Var.T0;
        this.C = r9Var.U0;
        File file6 = r9Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = r9Var.f3561a1;
        this.F = r9Var.I0;
        this.M = r9Var.f3603w;
        this.N = r9Var.f3605x;
        this.O = r9Var.f3607y;
        this.P = r9Var.f3609z;
        this.Q = r9Var.A;
        this.R = r9Var.B;
        this.S = r9Var.C;
        this.T = r9Var.D;
        this.U = r9Var.E;
        this.V = r9Var.F;
        this.W = r9Var.G;
        File file7 = r9Var.f3589o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = r9Var.f3591p0;
        this.Z = r9Var.f3593q0;
        this.f2579a0 = r9Var.f3595r0;
        this.f2581b0 = r9Var.f3597s0;
        this.f2583c0 = r9Var.f3599t0;
        this.f2584d0 = r9Var.f3601u0;
        this.f2585e0 = r9Var.P;
        this.f2587f0 = r9Var.f3602v0;
        this.f2589g0 = r9Var.J0;
        this.f2590h0 = r9Var.K0;
        this.f2592i0 = r9Var.L0;
        this.f2594j0 = r9Var.S;
        this.f2596k0 = VideoEditedInfo.Part.toParts(r9Var);
    }

    public final r9 a() {
        r9 r9Var = new r9();
        r9Var.f3562b = this.f2578a;
        r9Var.f3565c = true;
        r9Var.d = this.f2580b;
        String str = this.f2582c;
        if (!TextUtils.isEmpty(str)) {
            r9Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            r9Var.N0 = new File(str2);
        }
        r9Var.K = this.e;
        String str3 = this.f2586f;
        if (str3 != null) {
            r9Var.L = new File(str3);
        }
        r9Var.M = this.f2588g;
        r9Var.Y = this.h;
        long j3 = this.f2603r;
        r9Var.f3576h0 = j3;
        if (j3 > 0) {
            r9Var.Z = ((float) this.f2591i) / ((float) j3);
            r9Var.f3560a0 = ((float) this.f2593j) / ((float) j3);
        } else {
            r9Var.Z = 0.0f;
            r9Var.f3560a0 = 1.0f;
        }
        r9Var.Q = this.f2595k;
        r9Var.R = this.f2597l;
        r9Var.f3582k0 = this.f2598m;
        r9Var.f3584l0 = this.f2599n;
        r9Var.m0 = this.f2600o;
        r9Var.f3578i0 = this.f2601p;
        r9Var.f3580j0 = this.f2602q;
        r9Var.f3587n0.setValues(this.f2604s);
        r9Var.A0 = this.f2605t;
        r9Var.B0 = this.f2606u;
        String str4 = this.v;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.j6.f18122o2 == null) {
                org.telegram.ui.ActionBar.j6.O();
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, org.telegram.ui.ActionBar.j6.f18122o2.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(replaceEmoji, this.f2607w, true, false, true, false);
            r9Var.C0 = MessageObject.replaceAnimatedEmoji(replaceEmoji, this.f2607w, org.telegram.ui.ActionBar.j6.f18122o2.getFontMetricsInt());
        } else {
            r9Var.C0 = "";
        }
        ArrayList arrayList = r9Var.F0;
        arrayList.clear();
        arrayList.addAll(this.f2608x);
        String str5 = this.f2609y;
        if (str5 != null) {
            r9Var.P0 = new File(str5);
        }
        String str6 = this.f2610z;
        if (str6 != null) {
            r9Var.R0 = new File(str6);
        }
        r9Var.S0 = this.A;
        r9Var.T0 = this.B;
        r9Var.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            r9Var.Z0 = new File(str7);
        }
        r9Var.f3561a1 = this.E;
        r9Var.I0 = this.F;
        r9Var.f3574g = this.G;
        r9Var.f3572f = this.H;
        r9Var.e = this.I;
        r9Var.J = this.L;
        r9Var.I = this.K;
        r9Var.H = this.J;
        r9Var.f3603w = this.M;
        r9Var.f3605x = this.N;
        r9Var.f3607y = this.O;
        r9Var.f3609z = this.P;
        r9Var.A = this.Q;
        r9Var.B = this.R;
        r9Var.C = this.S;
        r9Var.D = this.T;
        r9Var.E = this.U;
        r9Var.F = this.V;
        r9Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            r9Var.f3589o0 = new File(str8);
        }
        r9Var.f3591p0 = this.Y;
        r9Var.f3593q0 = this.Z;
        r9Var.f3595r0 = this.f2579a0;
        r9Var.f3597s0 = this.f2581b0;
        r9Var.f3599t0 = this.f2583c0;
        r9Var.f3601u0 = this.f2584d0;
        r9Var.P = this.f2585e0;
        r9Var.f3602v0 = this.f2587f0;
        r9Var.J0 = this.f2589g0;
        r9Var.K0 = this.f2590h0;
        r9Var.L0 = this.f2592i0;
        r9Var.S = this.f2594j0;
        r9Var.T = VideoEditedInfo.Part.toStoryEntries(this.f2596k0);
        return r9Var;
    }

    public final void b(NativeByteBuffer nativeByteBuffer) {
        int size;
        int size2;
        int size3;
        int size4;
        ArrayList arrayList;
        nativeByteBuffer.writeInt32(-1318387531);
        nativeByteBuffer.writeInt64(this.f2580b);
        nativeByteBuffer.writeString(this.f2582c);
        nativeByteBuffer.writeBool(this.e);
        nativeByteBuffer.writeString(this.f2586f);
        nativeByteBuffer.writeBool(this.f2588g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.f2591i);
        nativeByteBuffer.writeInt64(this.f2593j);
        nativeByteBuffer.writeInt32(this.f2595k);
        nativeByteBuffer.writeInt32(this.f2597l);
        nativeByteBuffer.writeInt32(this.f2598m);
        nativeByteBuffer.writeInt32(this.f2599n);
        nativeByteBuffer.writeInt32(this.f2601p);
        nativeByteBuffer.writeInt32(this.f2602q);
        nativeByteBuffer.writeInt64(this.f2603r);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f2604s;
            if (i11 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i11]);
            i11++;
        }
        nativeByteBuffer.writeInt32(this.f2605t);
        nativeByteBuffer.writeInt32(this.f2606u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList2 = this.f2607w;
        if (arrayList2 == null) {
            size = 0;
        } else {
            size = arrayList2.size();
        }
        nativeByteBuffer.writeInt32(size);
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                ((TLRPC.MessageEntity) arrayList2.get(i12)).serializeToStream(nativeByteBuffer);
            }
        }
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList3 = this.f2608x;
        if (arrayList3 == null) {
            size2 = 0;
        } else {
            size2 = arrayList3.size();
        }
        nativeByteBuffer.writeInt32(size2);
        if (arrayList3 != null) {
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                ((TLRPC.InputPrivacyRule) arrayList3.get(i13)).serializeToStream(nativeByteBuffer);
            }
        }
        nativeByteBuffer.writeBool(false);
        nativeByteBuffer.writeString(this.f2609y);
        nativeByteBuffer.writeInt64(this.A);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList4 = this.B;
        if (arrayList4 == null) {
            size3 = 0;
        } else {
            size3 = arrayList4.size();
        }
        nativeByteBuffer.writeInt32(size3);
        if (arrayList4 != null) {
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                ((VideoEditedInfo.MediaEntity) arrayList4.get(i14)).serializeTo(nativeByteBuffer, true);
            }
        }
        nativeByteBuffer.writeInt32(481674261);
        List list = this.C;
        if (list == null) {
            size4 = 0;
        } else {
            size4 = list.size();
        }
        nativeByteBuffer.writeInt32(size4);
        if (list != null) {
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((TLRPC.InputDocument) list.get(i15)).serializeToStream(nativeByteBuffer);
            }
        }
        String str = "";
        String str2 = this.D;
        if (str2 == null) {
            str2 = "";
        }
        nativeByteBuffer.writeString(str2);
        MediaController.SavedFilterState savedFilterState = this.E;
        if (savedFilterState == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            nativeByteBuffer.writeInt32(-1318387530);
            savedFilterState.serializeToStream(nativeByteBuffer);
        }
        nativeByteBuffer.writeInt32(this.F);
        nativeByteBuffer.writeInt32(481674261);
        nativeByteBuffer.writeInt32(0);
        nativeByteBuffer.writeBool(this.G);
        nativeByteBuffer.writeInt32(this.H);
        nativeByteBuffer.writeInt64(this.I);
        nativeByteBuffer.writeInt64(this.L);
        nativeByteBuffer.writeInt64(this.K);
        nativeByteBuffer.writeInt64(this.J);
        nativeByteBuffer.writeString(this.f2610z);
        nativeByteBuffer.writeBool(this.M);
        TLRPC.TL_error tL_error = this.N;
        if (tL_error == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            tL_error.serializeToStream(nativeByteBuffer);
        }
        nativeByteBuffer.writeString(this.d);
        String str3 = this.O;
        if (str3 == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            nativeByteBuffer.writeInt32(-1739392570);
            nativeByteBuffer.writeString(str3);
            String str4 = this.Q;
            if (str4 == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-1222740358);
                nativeByteBuffer.writeString(str4);
            }
            String str5 = this.R;
            if (str5 == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-1222740358);
                nativeByteBuffer.writeString(str5);
            }
            nativeByteBuffer.writeInt64(this.S);
            nativeByteBuffer.writeInt64(this.T);
            nativeByteBuffer.writeFloat(this.U);
            nativeByteBuffer.writeFloat(this.V);
            nativeByteBuffer.writeFloat(this.W);
        }
        TLRPC.InputPeer inputPeer = this.f2587f0;
        if (inputPeer != null) {
            inputPeer.serializeToStream(nativeByteBuffer);
        } else {
            new TLRPC.TL_inputPeerSelf().serializeToStream(nativeByteBuffer);
        }
        String str6 = this.X;
        if (TextUtils.isEmpty(str6)) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            nativeByteBuffer.writeInt32(1137015880);
            nativeByteBuffer.writeString(str6);
            nativeByteBuffer.writeInt64(this.Z);
            nativeByteBuffer.writeInt64(this.f2579a0);
            nativeByteBuffer.writeFloat(this.f2581b0);
            nativeByteBuffer.writeFloat(this.f2583c0);
            nativeByteBuffer.writeFloat(this.f2584d0);
        }
        nativeByteBuffer.writeFloat(this.f2585e0);
        nativeByteBuffer.writeInt64(this.f2589g0);
        String str7 = this.f2590h0;
        if (str7 != null) {
            str = str7;
        }
        nativeByteBuffer.writeString(str);
        TLRPC.InputMedia inputMedia = this.f2592i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        x xVar = this.f2594j0;
        if (xVar != null && xVar.e.size() > 1 && (arrayList = this.f2596k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(xVar.f3852a);
            int size5 = arrayList.size();
            while (i10 < size5) {
                Object obj = arrayList.get(i10);
                i10++;
                ((VideoEditedInfo.Part) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        MediaController.CropState cropState = this.f2600o;
        if (cropState == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            cropState.serializeToStream(nativeByteBuffer);
        }
        TLRPC.InputDocument inputDocument = this.P;
        if (inputDocument == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputDocument.serializeToStream(nativeByteBuffer);
        }
    }

    public e1(NativeByteBuffer nativeByteBuffer) {
        int readInt32;
        this.f2604s = new float[9];
        this.f2608x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.f2584d0 = 1.0f;
        this.f2585e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.f2580b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.f2582c = readString;
            if (readString != null && readString.length() == 0) {
                this.f2582c = null;
            }
            this.e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f2586f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f2586f = null;
            }
            this.f2588g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.f2591i = nativeByteBuffer.readInt64(true);
            this.f2593j = nativeByteBuffer.readInt64(true);
            this.f2595k = nativeByteBuffer.readInt32(true);
            this.f2597l = nativeByteBuffer.readInt32(true);
            this.f2598m = nativeByteBuffer.readInt32(true);
            this.f2599n = nativeByteBuffer.readInt32(true);
            this.f2601p = nativeByteBuffer.readInt32(true);
            this.f2602q = nativeByteBuffer.readInt32(true);
            this.f2603r = nativeByteBuffer.readInt64(true);
            int i10 = 0;
            while (true) {
                float[] fArr = this.f2604s;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = nativeByteBuffer.readFloat(true);
                i10++;
            }
            this.f2605t = nativeByteBuffer.readInt32(true);
            this.f2606u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i11 = 0; i11 < readInt322; i11++) {
                    if (this.f2607w == null) {
                        this.f2607w = new ArrayList();
                    }
                    this.f2607w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.f2608x.clear();
                    for (int i12 = 0; i12 < readInt323; i12++) {
                        this.f2608x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.f2609y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.f2609y = null;
                    }
                    this.A = nativeByteBuffer.readInt64(true);
                    if (nativeByteBuffer.readInt32(true) == 481674261) {
                        int readInt324 = nativeByteBuffer.readInt32(true);
                        for (int i13 = 0; i13 < readInt324; i13++) {
                            if (this.B == null) {
                                this.B = new ArrayList();
                            }
                            this.B.add(new VideoEditedInfo.MediaEntity(nativeByteBuffer, true, true));
                        }
                        if (nativeByteBuffer.readInt32(true) == 481674261) {
                            int readInt325 = nativeByteBuffer.readInt32(true);
                            for (int i14 = 0; i14 < readInt325; i14++) {
                                if (this.C == null) {
                                    this.C = new ArrayList();
                                }
                                this.C.add(TLRPC.InputDocument.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                            }
                            String readString5 = nativeByteBuffer.readString(true);
                            this.D = readString5;
                            if (readString5 != null && readString5.length() == 0) {
                                this.D = null;
                            }
                            int readInt326 = nativeByteBuffer.readInt32(true);
                            if (readInt326 == 1450380236) {
                                this.E = null;
                            } else if (readInt326 == -1318387530) {
                                MediaController.SavedFilterState savedFilterState = new MediaController.SavedFilterState();
                                this.E = savedFilterState;
                                savedFilterState.readParams(nativeByteBuffer, true);
                            }
                            if (nativeByteBuffer.remaining() >= 4) {
                                this.F = nativeByteBuffer.readInt32(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                if (nativeByteBuffer.readInt32(true) == 481674261) {
                                    nativeByteBuffer.readInt32(true);
                                } else {
                                    throw new RuntimeException("Vector magic in StoryDraft parse error (5)");
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.G = nativeByteBuffer.readBool(true);
                                this.H = nativeByteBuffer.readInt32(true);
                                this.I = nativeByteBuffer.readInt64(true);
                                this.L = nativeByteBuffer.readInt64(true);
                                this.K = nativeByteBuffer.readInt64(true);
                                this.J = nativeByteBuffer.readInt64(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                String readString6 = nativeByteBuffer.readString(true);
                                this.f2610z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.f2610z = null;
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.M = nativeByteBuffer.readBool(true);
                                int readInt327 = nativeByteBuffer.readInt32(true);
                                if (readInt327 == 1450380236) {
                                    this.N = null;
                                } else {
                                    this.N = TLRPC.TL_error.TLdeserialize(nativeByteBuffer, readInt327, true);
                                }
                                this.d = nativeByteBuffer.readString(true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -1739392570) {
                                this.O = nativeByteBuffer.readString(true);
                                if (nativeByteBuffer.readInt32(true) == -1222740358) {
                                    this.Q = nativeByteBuffer.readString(true);
                                }
                                if (nativeByteBuffer.readInt32(true) == -1222740358) {
                                    this.R = nativeByteBuffer.readString(true);
                                }
                                this.S = nativeByteBuffer.readInt64(true);
                                this.T = nativeByteBuffer.readInt64(true);
                                this.U = nativeByteBuffer.readFloat(true);
                                this.V = nativeByteBuffer.readFloat(true);
                                this.W = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f2587f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.f2579a0 = nativeByteBuffer.readInt64(true);
                                this.f2581b0 = nativeByteBuffer.readFloat(true);
                                this.f2583c0 = nativeByteBuffer.readFloat(true);
                                this.f2584d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f2585e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f2589g0 = nativeByteBuffer.readInt64(true);
                                this.f2590h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.f2592i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.f2594j0 = new x(nativeByteBuffer.readString(true));
                                this.f2596k0 = new ArrayList();
                                for (int i15 = 0; i15 < this.f2594j0.e.size(); i15++) {
                                    VideoEditedInfo.Part part = new VideoEditedInfo.Part();
                                    part.readParams(nativeByteBuffer, true);
                                    part.part = (w) this.f2594j0.e.get(i15);
                                    this.f2596k0.add(part);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                MediaController.CropState cropState = new MediaController.CropState();
                                this.f2600o = cropState;
                                cropState.readParams(nativeByteBuffer, true);
                            }
                            if (nativeByteBuffer.remaining() <= 0 || (readInt32 = nativeByteBuffer.readInt32(true)) != 448771445) {
                                return;
                            }
                            this.P = TLRPC.InputDocument.TLdeserialize(nativeByteBuffer, readInt32, true);
                            return;
                        }
                        throw new RuntimeException("Vector magic in StoryDraft parse error (4)");
                    }
                    throw new RuntimeException("Vector magic in StoryDraft parse error (3)");
                }
                throw new RuntimeException("Vector magic in StoryDraft parse error (2)");
            }
            throw new RuntimeException("Vector magic in StoryDraft parse error (1)");
        }
        throw new RuntimeException("StoryDraft parse error");
    }
}
