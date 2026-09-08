package di;

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
    public long f6892a;
    public final long f6893a0;
    public final long f6894b;
    public final float f6895b0;
    public final String f6896c;
    public final float f6897c0;
    public final String d;
    public final float f6898d0;
    public final boolean f6899e;
    public final float f6900e0;
    public final String f6901f;
    public final TLRPC.InputPeer f6902f0;
    public final boolean f6903g;
    public final long f6904g0;
    public final boolean h;
    public final String f6905h0;
    public final long f6906i;
    public final TLRPC.InputMedia f6907i0;
    public final long f6908j;
    public final t f6909j0;
    public final int f6910k;
    public final ArrayList f6911k0;
    public final int f6912l;
    public final int f6913m;
    public final int f6914n;
    public final MediaController.CropState f6915o;
    public final int f6916p;
    public final int f6917q;
    public final long f6918r;
    public final float[] f6919s;
    public final int f6920t;
    public final int f6921u;
    public final String v;
    public final ArrayList f6922w;
    public final ArrayList f6923x;
    public final String f6924y;
    public final String f6925z;

    public a1(o8 o8Var) {
        float[] fArr = new float[9];
        this.f6919s = fArr;
        ArrayList arrayList = new ArrayList();
        this.f6923x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.f6898d0 = 1.0f;
        this.f6900e0 = 1.0f;
        this.f6892a = o8Var.f7771b;
        this.f6894b = o8Var.d;
        File file = o8Var.O0;
        this.f6896c = file == null ? "" : file.toString();
        File file2 = o8Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.f6899e = o8Var.K;
        File file3 = o8Var.L;
        this.f6901f = file3 == null ? "" : file3.toString();
        this.f6903g = o8Var.M;
        this.h = o8Var.Y;
        float f7 = o8Var.Z;
        long j3 = o8Var.f7786h0;
        this.f6906i = f7 * ((float) j3);
        this.f6908j = o8Var.f7769a0 * ((float) j3);
        this.f6910k = o8Var.Q;
        this.f6912l = o8Var.R;
        this.f6913m = o8Var.f7792k0;
        this.f6914n = o8Var.f7794l0;
        this.f6915o = o8Var.m0;
        this.f6916p = o8Var.f7788i0;
        this.f6917q = o8Var.f7790j0;
        this.f6918r = j3;
        o8Var.f7797n0.getValues(fArr);
        this.f6920t = o8Var.A0;
        this.f6921u = o8Var.B0;
        CharSequence[] charSequenceArr = {o8Var.C0};
        this.f6922w = o8Var.D0 ? MediaDataController.getInstance(o8Var.f7768a).getEntities(charSequenceArr, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(o8Var.F0);
        File file4 = o8Var.P0;
        this.f6924y = file4 == null ? "" : file4.toString();
        File file5 = o8Var.R0;
        this.f6925z = file5 == null ? "" : file5.toString();
        this.A = o8Var.S0;
        this.B = o8Var.T0;
        this.C = o8Var.U0;
        File file6 = o8Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = o8Var.f7770a1;
        this.F = o8Var.I0;
        this.M = o8Var.f7813w;
        this.N = o8Var.f7815x;
        this.O = o8Var.f7817y;
        this.P = o8Var.f7819z;
        this.Q = o8Var.A;
        this.R = o8Var.B;
        this.S = o8Var.C;
        this.T = o8Var.D;
        this.U = o8Var.E;
        this.V = o8Var.F;
        this.W = o8Var.G;
        File file7 = o8Var.f7799o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = o8Var.f7801p0;
        this.Z = o8Var.f7803q0;
        this.f6893a0 = o8Var.f7805r0;
        this.f6895b0 = o8Var.f7807s0;
        this.f6897c0 = o8Var.f7809t0;
        this.f6898d0 = o8Var.f7811u0;
        this.f6900e0 = o8Var.P;
        this.f6902f0 = o8Var.f7812v0;
        this.f6904g0 = o8Var.J0;
        this.f6905h0 = o8Var.K0;
        this.f6907i0 = o8Var.L0;
        this.f6909j0 = o8Var.S;
        this.f6911k0 = VideoEditedInfo.Part.toParts(o8Var);
    }

    public final o8 a() {
        o8 o8Var = new o8();
        o8Var.f7771b = this.f6892a;
        o8Var.f7774c = true;
        o8Var.d = this.f6894b;
        String str = this.f6896c;
        if (!TextUtils.isEmpty(str)) {
            o8Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            o8Var.N0 = new File(str2);
        }
        o8Var.K = this.f6899e;
        String str3 = this.f6901f;
        if (str3 != null) {
            o8Var.L = new File(str3);
        }
        o8Var.M = this.f6903g;
        o8Var.Y = this.h;
        long j3 = this.f6918r;
        o8Var.f7786h0 = j3;
        if (j3 > 0) {
            o8Var.Z = ((float) this.f6906i) / ((float) j3);
            o8Var.f7769a0 = ((float) this.f6908j) / ((float) j3);
        } else {
            o8Var.Z = 0.0f;
            o8Var.f7769a0 = 1.0f;
        }
        o8Var.Q = this.f6910k;
        o8Var.R = this.f6912l;
        o8Var.f7792k0 = this.f6913m;
        o8Var.f7794l0 = this.f6914n;
        o8Var.m0 = this.f6915o;
        o8Var.f7788i0 = this.f6916p;
        o8Var.f7790j0 = this.f6917q;
        o8Var.f7797n0.setValues(this.f6919s);
        o8Var.A0 = this.f6920t;
        o8Var.B0 = this.f6921u;
        String str4 = this.v;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.j6.f20885o2 == null) {
                org.telegram.ui.ActionBar.j6.O();
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, org.telegram.ui.ActionBar.j6.f20885o2.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(replaceEmoji, this.f6922w, true, false, true, false);
            o8Var.C0 = MessageObject.replaceAnimatedEmoji(replaceEmoji, this.f6922w, org.telegram.ui.ActionBar.j6.f20885o2.getFontMetricsInt());
        } else {
            o8Var.C0 = "";
        }
        ArrayList arrayList = o8Var.F0;
        arrayList.clear();
        arrayList.addAll(this.f6923x);
        String str5 = this.f6924y;
        if (str5 != null) {
            o8Var.P0 = new File(str5);
        }
        String str6 = this.f6925z;
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
        o8Var.f7770a1 = this.E;
        o8Var.I0 = this.F;
        o8Var.f7784g = this.G;
        o8Var.f7782f = this.H;
        o8Var.f7779e = this.I;
        o8Var.J = this.L;
        o8Var.I = this.K;
        o8Var.H = this.J;
        o8Var.f7813w = this.M;
        o8Var.f7815x = this.N;
        o8Var.f7817y = this.O;
        o8Var.f7819z = this.P;
        o8Var.A = this.Q;
        o8Var.B = this.R;
        o8Var.C = this.S;
        o8Var.D = this.T;
        o8Var.E = this.U;
        o8Var.F = this.V;
        o8Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            o8Var.f7799o0 = new File(str8);
        }
        o8Var.f7801p0 = this.Y;
        o8Var.f7803q0 = this.Z;
        o8Var.f7805r0 = this.f6893a0;
        o8Var.f7807s0 = this.f6895b0;
        o8Var.f7809t0 = this.f6897c0;
        o8Var.f7811u0 = this.f6898d0;
        o8Var.P = this.f6900e0;
        o8Var.f7812v0 = this.f6902f0;
        o8Var.J0 = this.f6904g0;
        o8Var.K0 = this.f6905h0;
        o8Var.L0 = this.f6907i0;
        o8Var.S = this.f6909j0;
        o8Var.T = VideoEditedInfo.Part.toStoryEntries(this.f6911k0);
        return o8Var;
    }

    public final void b(NativeByteBuffer nativeByteBuffer) {
        int size;
        int size2;
        int size3;
        int size4;
        ArrayList arrayList;
        nativeByteBuffer.writeInt32(-1318387531);
        nativeByteBuffer.writeInt64(this.f6894b);
        nativeByteBuffer.writeString(this.f6896c);
        nativeByteBuffer.writeBool(this.f6899e);
        nativeByteBuffer.writeString(this.f6901f);
        nativeByteBuffer.writeBool(this.f6903g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.f6906i);
        nativeByteBuffer.writeInt64(this.f6908j);
        nativeByteBuffer.writeInt32(this.f6910k);
        nativeByteBuffer.writeInt32(this.f6912l);
        nativeByteBuffer.writeInt32(this.f6913m);
        nativeByteBuffer.writeInt32(this.f6914n);
        nativeByteBuffer.writeInt32(this.f6916p);
        nativeByteBuffer.writeInt32(this.f6917q);
        nativeByteBuffer.writeInt64(this.f6918r);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f6919s;
            if (i11 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i11]);
            i11++;
        }
        nativeByteBuffer.writeInt32(this.f6920t);
        nativeByteBuffer.writeInt32(this.f6921u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList2 = this.f6922w;
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
        ArrayList arrayList3 = this.f6923x;
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
        nativeByteBuffer.writeString(this.f6924y);
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
        nativeByteBuffer.writeString(this.f6925z);
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
        TLRPC.InputPeer inputPeer = this.f6902f0;
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
            nativeByteBuffer.writeInt64(this.f6893a0);
            nativeByteBuffer.writeFloat(this.f6895b0);
            nativeByteBuffer.writeFloat(this.f6897c0);
            nativeByteBuffer.writeFloat(this.f6898d0);
        }
        nativeByteBuffer.writeFloat(this.f6900e0);
        nativeByteBuffer.writeInt64(this.f6904g0);
        String str7 = this.f6905h0;
        if (str7 != null) {
            str = str7;
        }
        nativeByteBuffer.writeString(str);
        TLRPC.InputMedia inputMedia = this.f6907i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        t tVar = this.f6909j0;
        if (tVar != null && tVar.f8179e.size() > 1 && (arrayList = this.f6911k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(tVar.f8176a);
            int size5 = arrayList.size();
            while (i10 < size5) {
                Object obj = arrayList.get(i10);
                i10++;
                ((VideoEditedInfo.Part) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        MediaController.CropState cropState = this.f6915o;
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
        this.f6919s = new float[9];
        this.f6923x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.f6898d0 = 1.0f;
        this.f6900e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.f6894b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.f6896c = readString;
            if (readString != null && readString.length() == 0) {
                this.f6896c = null;
            }
            this.f6899e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f6901f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f6901f = null;
            }
            this.f6903g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.f6906i = nativeByteBuffer.readInt64(true);
            this.f6908j = nativeByteBuffer.readInt64(true);
            this.f6910k = nativeByteBuffer.readInt32(true);
            this.f6912l = nativeByteBuffer.readInt32(true);
            this.f6913m = nativeByteBuffer.readInt32(true);
            this.f6914n = nativeByteBuffer.readInt32(true);
            this.f6916p = nativeByteBuffer.readInt32(true);
            this.f6917q = nativeByteBuffer.readInt32(true);
            this.f6918r = nativeByteBuffer.readInt64(true);
            int i10 = 0;
            while (true) {
                float[] fArr = this.f6919s;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = nativeByteBuffer.readFloat(true);
                i10++;
            }
            this.f6920t = nativeByteBuffer.readInt32(true);
            this.f6921u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i11 = 0; i11 < readInt322; i11++) {
                    if (this.f6922w == null) {
                        this.f6922w = new ArrayList();
                    }
                    this.f6922w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.f6923x.clear();
                    for (int i12 = 0; i12 < readInt323; i12++) {
                        this.f6923x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.f6924y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.f6924y = null;
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
                                this.f6925z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.f6925z = null;
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
                                this.f6902f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.f6893a0 = nativeByteBuffer.readInt64(true);
                                this.f6895b0 = nativeByteBuffer.readFloat(true);
                                this.f6897c0 = nativeByteBuffer.readFloat(true);
                                this.f6898d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f6900e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f6904g0 = nativeByteBuffer.readInt64(true);
                                this.f6905h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.f6907i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.f6909j0 = new t(nativeByteBuffer.readString(true));
                                this.f6911k0 = new ArrayList();
                                for (int i15 = 0; i15 < this.f6909j0.f8179e.size(); i15++) {
                                    VideoEditedInfo.Part part = new VideoEditedInfo.Part();
                                    part.readParams(nativeByteBuffer, true);
                                    part.part = (s) this.f6909j0.f8179e.get(i15);
                                    this.f6911k0.add(part);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                MediaController.CropState cropState = new MediaController.CropState();
                                this.f6915o = cropState;
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
