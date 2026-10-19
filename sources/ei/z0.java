package ei;

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
public final class z0 {
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
    public long f10162a;
    public final long f10163a0;
    public final long f10164b;
    public final float f10165b0;
    public final String f10166c;
    public final float f10167c0;
    public final String d;
    public final float f10168d0;
    public final boolean e;
    public final float f10169e0;
    public final String f10170f;
    public final TLRPC.InputPeer f10171f0;
    public final boolean f10172g;
    public final long f10173g0;
    public final boolean h;
    public final String f10174h0;
    public final long f10175i;
    public final TLRPC.InputMedia f10176i0;
    public final long f10177j;
    public final t f10178j0;
    public final int f10179k;
    public final ArrayList f10180k0;
    public final int f10181l;
    public final int f10182m;
    public final int f10183n;
    public final MediaController.CropState f10184o;
    public final int f10185p;
    public final int f10186q;
    public final long f10187r;
    public final float[] f10188s;
    public final int f10189t;
    public final int f10190u;
    public final String v;
    public final ArrayList f10191w;
    public final ArrayList f10192x;
    public final String f10193y;
    public final String f10194z;

    public z0(a8 a8Var) {
        float[] fArr = new float[9];
        this.f10188s = fArr;
        ArrayList arrayList = new ArrayList();
        this.f10192x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.f10168d0 = 1.0f;
        this.f10169e0 = 1.0f;
        this.f10162a = a8Var.f8699b;
        this.f10164b = a8Var.d;
        File file = a8Var.O0;
        this.f10166c = file == null ? "" : file.toString();
        File file2 = a8Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.e = a8Var.K;
        File file3 = a8Var.L;
        this.f10170f = file3 == null ? "" : file3.toString();
        this.f10172g = a8Var.M;
        this.h = a8Var.Y;
        float f7 = a8Var.Z;
        long j10 = a8Var.f8713h0;
        this.f10175i = f7 * ((float) j10);
        this.f10177j = a8Var.f8697a0 * ((float) j10);
        this.f10179k = a8Var.Q;
        this.f10181l = a8Var.R;
        this.f10182m = a8Var.f8719k0;
        this.f10183n = a8Var.f8721l0;
        this.f10184o = a8Var.m0;
        this.f10185p = a8Var.f8715i0;
        this.f10186q = a8Var.f8717j0;
        this.f10187r = j10;
        a8Var.f8724n0.getValues(fArr);
        this.f10189t = a8Var.A0;
        this.f10190u = a8Var.B0;
        CharSequence[] charSequenceArr = {a8Var.C0};
        this.f10191w = a8Var.D0 ? MediaDataController.getInstance(a8Var.f8696a).getEntities(charSequenceArr, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(a8Var.F0);
        File file4 = a8Var.P0;
        this.f10193y = file4 == null ? "" : file4.toString();
        File file5 = a8Var.R0;
        this.f10194z = file5 == null ? "" : file5.toString();
        this.A = a8Var.S0;
        this.B = a8Var.T0;
        this.C = a8Var.U0;
        File file6 = a8Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = a8Var.f8698a1;
        this.F = a8Var.I0;
        this.M = a8Var.f8740w;
        this.N = a8Var.f8742x;
        this.O = a8Var.f8744y;
        this.P = a8Var.f8746z;
        this.Q = a8Var.A;
        this.R = a8Var.B;
        this.S = a8Var.C;
        this.T = a8Var.D;
        this.U = a8Var.E;
        this.V = a8Var.F;
        this.W = a8Var.G;
        File file7 = a8Var.f8726o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = a8Var.f8728p0;
        this.Z = a8Var.f8730q0;
        this.f10163a0 = a8Var.f8732r0;
        this.f10165b0 = a8Var.f8734s0;
        this.f10167c0 = a8Var.f8736t0;
        this.f10168d0 = a8Var.f8738u0;
        this.f10169e0 = a8Var.P;
        this.f10171f0 = a8Var.f8739v0;
        this.f10173g0 = a8Var.J0;
        this.f10174h0 = a8Var.K0;
        this.f10176i0 = a8Var.L0;
        this.f10178j0 = a8Var.S;
        this.f10180k0 = VideoEditedInfo.Part.toParts(a8Var);
    }

    public final a8 a() {
        a8 a8Var = new a8();
        a8Var.f8699b = this.f10162a;
        a8Var.f8702c = true;
        a8Var.d = this.f10164b;
        String str = this.f10166c;
        if (!TextUtils.isEmpty(str)) {
            a8Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            a8Var.N0 = new File(str2);
        }
        a8Var.K = this.e;
        String str3 = this.f10170f;
        if (str3 != null) {
            a8Var.L = new File(str3);
        }
        a8Var.M = this.f10172g;
        a8Var.Y = this.h;
        long j10 = this.f10187r;
        a8Var.f8713h0 = j10;
        if (j10 > 0) {
            a8Var.Z = ((float) this.f10175i) / ((float) j10);
            a8Var.f8697a0 = ((float) this.f10177j) / ((float) j10);
        } else {
            a8Var.Z = 0.0f;
            a8Var.f8697a0 = 1.0f;
        }
        a8Var.Q = this.f10179k;
        a8Var.R = this.f10181l;
        a8Var.f8719k0 = this.f10182m;
        a8Var.f8721l0 = this.f10183n;
        a8Var.m0 = this.f10184o;
        a8Var.f8715i0 = this.f10185p;
        a8Var.f8717j0 = this.f10186q;
        a8Var.f8724n0.setValues(this.f10188s);
        a8Var.A0 = this.f10189t;
        a8Var.B0 = this.f10190u;
        String str4 = this.v;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.h6.f21188o2 == null) {
                org.telegram.ui.ActionBar.h6.P();
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, org.telegram.ui.ActionBar.h6.f21188o2.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(replaceEmoji, this.f10191w, true, false, true, false);
            a8Var.C0 = MessageObject.replaceAnimatedEmoji(replaceEmoji, this.f10191w, org.telegram.ui.ActionBar.h6.f21188o2.getFontMetricsInt());
        } else {
            a8Var.C0 = "";
        }
        ArrayList arrayList = a8Var.F0;
        arrayList.clear();
        arrayList.addAll(this.f10192x);
        String str5 = this.f10193y;
        if (str5 != null) {
            a8Var.P0 = new File(str5);
        }
        String str6 = this.f10194z;
        if (str6 != null) {
            a8Var.R0 = new File(str6);
        }
        a8Var.S0 = this.A;
        a8Var.T0 = this.B;
        a8Var.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            a8Var.Z0 = new File(str7);
        }
        a8Var.f8698a1 = this.E;
        a8Var.I0 = this.F;
        a8Var.f8711g = this.G;
        a8Var.f8709f = this.H;
        a8Var.e = this.I;
        a8Var.J = this.L;
        a8Var.I = this.K;
        a8Var.H = this.J;
        a8Var.f8740w = this.M;
        a8Var.f8742x = this.N;
        a8Var.f8744y = this.O;
        a8Var.f8746z = this.P;
        a8Var.A = this.Q;
        a8Var.B = this.R;
        a8Var.C = this.S;
        a8Var.D = this.T;
        a8Var.E = this.U;
        a8Var.F = this.V;
        a8Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            a8Var.f8726o0 = new File(str8);
        }
        a8Var.f8728p0 = this.Y;
        a8Var.f8730q0 = this.Z;
        a8Var.f8732r0 = this.f10163a0;
        a8Var.f8734s0 = this.f10165b0;
        a8Var.f8736t0 = this.f10167c0;
        a8Var.f8738u0 = this.f10168d0;
        a8Var.P = this.f10169e0;
        a8Var.f8739v0 = this.f10171f0;
        a8Var.J0 = this.f10173g0;
        a8Var.K0 = this.f10174h0;
        a8Var.L0 = this.f10176i0;
        a8Var.S = this.f10178j0;
        a8Var.T = VideoEditedInfo.Part.toStoryEntries(this.f10180k0);
        return a8Var;
    }

    public final void b(NativeByteBuffer nativeByteBuffer) {
        int size;
        int size2;
        int size3;
        int size4;
        ArrayList arrayList;
        nativeByteBuffer.writeInt32(-1318387531);
        nativeByteBuffer.writeInt64(this.f10164b);
        nativeByteBuffer.writeString(this.f10166c);
        nativeByteBuffer.writeBool(this.e);
        nativeByteBuffer.writeString(this.f10170f);
        nativeByteBuffer.writeBool(this.f10172g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.f10175i);
        nativeByteBuffer.writeInt64(this.f10177j);
        nativeByteBuffer.writeInt32(this.f10179k);
        nativeByteBuffer.writeInt32(this.f10181l);
        nativeByteBuffer.writeInt32(this.f10182m);
        nativeByteBuffer.writeInt32(this.f10183n);
        nativeByteBuffer.writeInt32(this.f10185p);
        nativeByteBuffer.writeInt32(this.f10186q);
        nativeByteBuffer.writeInt64(this.f10187r);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f10188s;
            if (i11 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i11]);
            i11++;
        }
        nativeByteBuffer.writeInt32(this.f10189t);
        nativeByteBuffer.writeInt32(this.f10190u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList2 = this.f10191w;
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
        ArrayList arrayList3 = this.f10192x;
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
        nativeByteBuffer.writeString(this.f10193y);
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
        nativeByteBuffer.writeString(this.f10194z);
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
        TLRPC.InputPeer inputPeer = this.f10171f0;
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
            nativeByteBuffer.writeInt64(this.f10163a0);
            nativeByteBuffer.writeFloat(this.f10165b0);
            nativeByteBuffer.writeFloat(this.f10167c0);
            nativeByteBuffer.writeFloat(this.f10168d0);
        }
        nativeByteBuffer.writeFloat(this.f10169e0);
        nativeByteBuffer.writeInt64(this.f10173g0);
        String str7 = this.f10174h0;
        if (str7 != null) {
            str = str7;
        }
        nativeByteBuffer.writeString(str);
        TLRPC.InputMedia inputMedia = this.f10176i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        t tVar = this.f10178j0;
        if (tVar != null && tVar.e.size() > 1 && (arrayList = this.f10180k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(tVar.f9828a);
            int size5 = arrayList.size();
            while (i10 < size5) {
                Object obj = arrayList.get(i10);
                i10++;
                ((VideoEditedInfo.Part) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        MediaController.CropState cropState = this.f10184o;
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

    public z0(NativeByteBuffer nativeByteBuffer) {
        int readInt32;
        this.f10188s = new float[9];
        this.f10192x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.f10168d0 = 1.0f;
        this.f10169e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.f10164b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.f10166c = readString;
            if (readString != null && readString.length() == 0) {
                this.f10166c = null;
            }
            this.e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f10170f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f10170f = null;
            }
            this.f10172g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.f10175i = nativeByteBuffer.readInt64(true);
            this.f10177j = nativeByteBuffer.readInt64(true);
            this.f10179k = nativeByteBuffer.readInt32(true);
            this.f10181l = nativeByteBuffer.readInt32(true);
            this.f10182m = nativeByteBuffer.readInt32(true);
            this.f10183n = nativeByteBuffer.readInt32(true);
            this.f10185p = nativeByteBuffer.readInt32(true);
            this.f10186q = nativeByteBuffer.readInt32(true);
            this.f10187r = nativeByteBuffer.readInt64(true);
            int i10 = 0;
            while (true) {
                float[] fArr = this.f10188s;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = nativeByteBuffer.readFloat(true);
                i10++;
            }
            this.f10189t = nativeByteBuffer.readInt32(true);
            this.f10190u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i11 = 0; i11 < readInt322; i11++) {
                    if (this.f10191w == null) {
                        this.f10191w = new ArrayList();
                    }
                    this.f10191w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.f10192x.clear();
                    for (int i12 = 0; i12 < readInt323; i12++) {
                        this.f10192x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.f10193y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.f10193y = null;
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
                                this.f10194z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.f10194z = null;
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
                                this.f10171f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.f10163a0 = nativeByteBuffer.readInt64(true);
                                this.f10165b0 = nativeByteBuffer.readFloat(true);
                                this.f10167c0 = nativeByteBuffer.readFloat(true);
                                this.f10168d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f10169e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f10173g0 = nativeByteBuffer.readInt64(true);
                                this.f10174h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.f10176i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.f10178j0 = new t(nativeByteBuffer.readString(true));
                                this.f10180k0 = new ArrayList();
                                for (int i15 = 0; i15 < this.f10178j0.e.size(); i15++) {
                                    VideoEditedInfo.Part part = new VideoEditedInfo.Part();
                                    part.readParams(nativeByteBuffer, true);
                                    part.part = (s) this.f10178j0.e.get(i15);
                                    this.f10180k0.add(part);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                MediaController.CropState cropState = new MediaController.CropState();
                                this.f10184o = cropState;
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
