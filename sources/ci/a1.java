package ci;

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
public final class a1 {
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
    public long f4310a;
    public final long f4311a0;
    public final long f4312b;
    public final float f4313b0;
    public final String f4314c;
    public final float f4315c0;
    public final String d;
    public final float f4316d0;
    public final boolean e;
    public final float f4317e0;
    public final String f4318f;
    public final TLRPC.InputPeer f4319f0;
    public final boolean f4320g;
    public final long f4321g0;
    public final boolean h;
    public final String f4322h0;
    public final long f4323i;
    public final TLRPC.InputMedia f4324i0;
    public final long f4325j;
    public final t f4326j0;
    public final int f4327k;
    public final ArrayList f4328k0;
    public final int f4329l;
    public final int f4330m;
    public final int f4331n;
    public final MediaController.CropState f4332o;
    public final int f4333p;
    public final int f4334q;
    public final long f4335r;
    public final float[] f4336s;
    public final int f4337t;
    public final int f4338u;
    public final String v;
    public final ArrayList f4339w;
    public final ArrayList f4340x;
    public final String f4341y;
    public final String f4342z;

    public a1(o8 o8Var) {
        float[] fArr = new float[9];
        this.f4336s = fArr;
        ArrayList arrayList = new ArrayList();
        this.f4340x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.f4316d0 = 1.0f;
        this.f4317e0 = 1.0f;
        this.f4310a = o8Var.f5142b;
        this.f4312b = o8Var.d;
        File file = o8Var.O0;
        this.f4314c = file == null ? "" : file.toString();
        File file2 = o8Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.e = o8Var.K;
        File file3 = o8Var.L;
        this.f4318f = file3 == null ? "" : file3.toString();
        this.f4320g = o8Var.M;
        this.h = o8Var.Y;
        float f7 = o8Var.Z;
        long j3 = o8Var.f5156h0;
        this.f4323i = f7 * ((float) j3);
        this.f4325j = o8Var.f5140a0 * ((float) j3);
        this.f4327k = o8Var.Q;
        this.f4329l = o8Var.R;
        this.f4330m = o8Var.f5162k0;
        this.f4331n = o8Var.f5164l0;
        this.f4332o = o8Var.m0;
        this.f4333p = o8Var.f5158i0;
        this.f4334q = o8Var.f5160j0;
        this.f4335r = j3;
        o8Var.f5167n0.getValues(fArr);
        this.f4337t = o8Var.A0;
        this.f4338u = o8Var.B0;
        CharSequence[] charSequenceArr = {o8Var.C0};
        this.f4339w = o8Var.D0 ? MediaDataController.getInstance(o8Var.f5139a).getEntities(charSequenceArr, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(o8Var.F0);
        File file4 = o8Var.P0;
        this.f4341y = file4 == null ? "" : file4.toString();
        File file5 = o8Var.R0;
        this.f4342z = file5 == null ? "" : file5.toString();
        this.A = o8Var.S0;
        this.B = o8Var.T0;
        this.C = o8Var.U0;
        File file6 = o8Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = o8Var.f5141a1;
        this.F = o8Var.I0;
        this.M = o8Var.f5183w;
        this.N = o8Var.f5185x;
        this.O = o8Var.f5187y;
        this.P = o8Var.f5189z;
        this.Q = o8Var.A;
        this.R = o8Var.B;
        this.S = o8Var.C;
        this.T = o8Var.D;
        this.U = o8Var.E;
        this.V = o8Var.F;
        this.W = o8Var.G;
        File file7 = o8Var.f5169o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = o8Var.f5171p0;
        this.Z = o8Var.f5173q0;
        this.f4311a0 = o8Var.f5175r0;
        this.f4313b0 = o8Var.f5177s0;
        this.f4315c0 = o8Var.f5179t0;
        this.f4316d0 = o8Var.f5181u0;
        this.f4317e0 = o8Var.P;
        this.f4319f0 = o8Var.f5182v0;
        this.f4321g0 = o8Var.J0;
        this.f4322h0 = o8Var.K0;
        this.f4324i0 = o8Var.L0;
        this.f4326j0 = o8Var.S;
        this.f4328k0 = VideoEditedInfo.Part.toParts(o8Var);
    }

    public final o8 a() {
        o8 o8Var = new o8();
        o8Var.f5142b = this.f4310a;
        o8Var.f5145c = true;
        o8Var.d = this.f4312b;
        String str = this.f4314c;
        if (!TextUtils.isEmpty(str)) {
            o8Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            o8Var.N0 = new File(str2);
        }
        o8Var.K = this.e;
        String str3 = this.f4318f;
        if (str3 != null) {
            o8Var.L = new File(str3);
        }
        o8Var.M = this.f4320g;
        o8Var.Y = this.h;
        long j3 = this.f4335r;
        o8Var.f5156h0 = j3;
        if (j3 > 0) {
            o8Var.Z = ((float) this.f4323i) / ((float) j3);
            o8Var.f5140a0 = ((float) this.f4325j) / ((float) j3);
        } else {
            o8Var.Z = 0.0f;
            o8Var.f5140a0 = 1.0f;
        }
        o8Var.Q = this.f4327k;
        o8Var.R = this.f4329l;
        o8Var.f5162k0 = this.f4330m;
        o8Var.f5164l0 = this.f4331n;
        o8Var.m0 = this.f4332o;
        o8Var.f5158i0 = this.f4333p;
        o8Var.f5160j0 = this.f4334q;
        o8Var.f5167n0.setValues(this.f4336s);
        o8Var.A0 = this.f4337t;
        o8Var.B0 = this.f4338u;
        String str4 = this.v;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.i6.f19031o2 == null) {
                org.telegram.ui.ActionBar.i6.O();
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, org.telegram.ui.ActionBar.i6.f19031o2.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(replaceEmoji, this.f4339w, true, false, true, false);
            o8Var.C0 = MessageObject.replaceAnimatedEmoji(replaceEmoji, this.f4339w, org.telegram.ui.ActionBar.i6.f19031o2.getFontMetricsInt());
        } else {
            o8Var.C0 = "";
        }
        ArrayList arrayList = o8Var.F0;
        arrayList.clear();
        arrayList.addAll(this.f4340x);
        String str5 = this.f4341y;
        if (str5 != null) {
            o8Var.P0 = new File(str5);
        }
        String str6 = this.f4342z;
        if (str6 != null) {
            o8Var.R0 = new File(str6);
        }
        o8Var.S0 = this.A;
        o8Var.T0 = this.B;
        o8Var.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            o8Var.Z0 = new File(str7);
        }
        o8Var.f5141a1 = this.E;
        o8Var.I0 = this.F;
        o8Var.f5154g = this.G;
        o8Var.f5152f = this.H;
        o8Var.e = this.I;
        o8Var.J = this.L;
        o8Var.I = this.K;
        o8Var.H = this.J;
        o8Var.f5183w = this.M;
        o8Var.f5185x = this.N;
        o8Var.f5187y = this.O;
        o8Var.f5189z = this.P;
        o8Var.A = this.Q;
        o8Var.B = this.R;
        o8Var.C = this.S;
        o8Var.D = this.T;
        o8Var.E = this.U;
        o8Var.F = this.V;
        o8Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            o8Var.f5169o0 = new File(str8);
        }
        o8Var.f5171p0 = this.Y;
        o8Var.f5173q0 = this.Z;
        o8Var.f5175r0 = this.f4311a0;
        o8Var.f5177s0 = this.f4313b0;
        o8Var.f5179t0 = this.f4315c0;
        o8Var.f5181u0 = this.f4316d0;
        o8Var.P = this.f4317e0;
        o8Var.f5182v0 = this.f4319f0;
        o8Var.J0 = this.f4321g0;
        o8Var.K0 = this.f4322h0;
        o8Var.L0 = this.f4324i0;
        o8Var.S = this.f4326j0;
        o8Var.T = VideoEditedInfo.Part.toStoryEntries(this.f4328k0);
        return o8Var;
    }

    public final void b(NativeByteBuffer nativeByteBuffer) {
        int size;
        int size2;
        int size3;
        int size4;
        ArrayList arrayList;
        nativeByteBuffer.writeInt32(-1318387531);
        nativeByteBuffer.writeInt64(this.f4312b);
        nativeByteBuffer.writeString(this.f4314c);
        nativeByteBuffer.writeBool(this.e);
        nativeByteBuffer.writeString(this.f4318f);
        nativeByteBuffer.writeBool(this.f4320g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.f4323i);
        nativeByteBuffer.writeInt64(this.f4325j);
        nativeByteBuffer.writeInt32(this.f4327k);
        nativeByteBuffer.writeInt32(this.f4329l);
        nativeByteBuffer.writeInt32(this.f4330m);
        nativeByteBuffer.writeInt32(this.f4331n);
        nativeByteBuffer.writeInt32(this.f4333p);
        nativeByteBuffer.writeInt32(this.f4334q);
        nativeByteBuffer.writeInt64(this.f4335r);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f4336s;
            if (i11 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i11]);
            i11++;
        }
        nativeByteBuffer.writeInt32(this.f4337t);
        nativeByteBuffer.writeInt32(this.f4338u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList2 = this.f4339w;
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
        ArrayList arrayList3 = this.f4340x;
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
        nativeByteBuffer.writeString(this.f4341y);
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
        nativeByteBuffer.writeString(this.f4342z);
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
        TLRPC.InputPeer inputPeer = this.f4319f0;
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
            nativeByteBuffer.writeInt64(this.f4311a0);
            nativeByteBuffer.writeFloat(this.f4313b0);
            nativeByteBuffer.writeFloat(this.f4315c0);
            nativeByteBuffer.writeFloat(this.f4316d0);
        }
        nativeByteBuffer.writeFloat(this.f4317e0);
        nativeByteBuffer.writeInt64(this.f4321g0);
        String str7 = this.f4322h0;
        if (str7 != null) {
            str = str7;
        }
        nativeByteBuffer.writeString(str);
        TLRPC.InputMedia inputMedia = this.f4324i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        t tVar = this.f4326j0;
        if (tVar != null && tVar.e.size() > 1 && (arrayList = this.f4328k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(tVar.f5528a);
            int size5 = arrayList.size();
            while (i10 < size5) {
                Object obj = arrayList.get(i10);
                i10++;
                ((VideoEditedInfo.Part) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        MediaController.CropState cropState = this.f4332o;
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

    public a1(NativeByteBuffer nativeByteBuffer) {
        int readInt32;
        this.f4336s = new float[9];
        this.f4340x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.f4316d0 = 1.0f;
        this.f4317e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.f4312b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.f4314c = readString;
            if (readString != null && readString.length() == 0) {
                this.f4314c = null;
            }
            this.e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f4318f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f4318f = null;
            }
            this.f4320g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.f4323i = nativeByteBuffer.readInt64(true);
            this.f4325j = nativeByteBuffer.readInt64(true);
            this.f4327k = nativeByteBuffer.readInt32(true);
            this.f4329l = nativeByteBuffer.readInt32(true);
            this.f4330m = nativeByteBuffer.readInt32(true);
            this.f4331n = nativeByteBuffer.readInt32(true);
            this.f4333p = nativeByteBuffer.readInt32(true);
            this.f4334q = nativeByteBuffer.readInt32(true);
            this.f4335r = nativeByteBuffer.readInt64(true);
            int i10 = 0;
            while (true) {
                float[] fArr = this.f4336s;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = nativeByteBuffer.readFloat(true);
                i10++;
            }
            this.f4337t = nativeByteBuffer.readInt32(true);
            this.f4338u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i11 = 0; i11 < readInt322; i11++) {
                    if (this.f4339w == null) {
                        this.f4339w = new ArrayList();
                    }
                    this.f4339w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.f4340x.clear();
                    for (int i12 = 0; i12 < readInt323; i12++) {
                        this.f4340x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.f4341y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.f4341y = null;
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
                                this.f4342z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.f4342z = null;
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
                                this.f4319f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.f4311a0 = nativeByteBuffer.readInt64(true);
                                this.f4313b0 = nativeByteBuffer.readFloat(true);
                                this.f4315c0 = nativeByteBuffer.readFloat(true);
                                this.f4316d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f4317e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f4321g0 = nativeByteBuffer.readInt64(true);
                                this.f4322h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.f4324i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.f4326j0 = new t(nativeByteBuffer.readString(true));
                                this.f4328k0 = new ArrayList();
                                for (int i15 = 0; i15 < this.f4326j0.e.size(); i15++) {
                                    VideoEditedInfo.Part part = new VideoEditedInfo.Part();
                                    part.readParams(nativeByteBuffer, true);
                                    part.part = (s) this.f4326j0.e.get(i15);
                                    this.f4328k0.add(part);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                MediaController.CropState cropState = new MediaController.CropState();
                                this.f4332o = cropState;
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
