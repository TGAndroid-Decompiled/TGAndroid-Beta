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
    public long f4305a;
    public final long f4306a0;
    public final long f4307b;
    public final float f4308b0;
    public final String f4309c;
    public final float f4310c0;
    public final String d;
    public final float f4311d0;
    public final boolean e;
    public final float f4312e0;
    public final String f4313f;
    public final TLRPC.InputPeer f4314f0;
    public final boolean f4315g;
    public final long f4316g0;
    public final boolean h;
    public final String f4317h0;
    public final long f4318i;
    public final TLRPC.InputMedia f4319i0;
    public final long f4320j;
    public final t f4321j0;
    public final int f4322k;
    public final ArrayList f4323k0;
    public final int f4324l;
    public final int f4325m;
    public final int f4326n;
    public final MediaController.CropState f4327o;
    public final int f4328p;
    public final int f4329q;
    public final long f4330r;
    public final float[] f4331s;
    public final int f4332t;
    public final int f4333u;
    public final String v;
    public final ArrayList f4334w;
    public final ArrayList f4335x;
    public final String f4336y;
    public final String f4337z;

    public a1(l8 l8Var) {
        float[] fArr = new float[9];
        this.f4331s = fArr;
        ArrayList arrayList = new ArrayList();
        this.f4335x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.f4311d0 = 1.0f;
        this.f4312e0 = 1.0f;
        this.f4305a = l8Var.f4967b;
        this.f4307b = l8Var.d;
        File file = l8Var.O0;
        this.f4309c = file == null ? "" : file.toString();
        File file2 = l8Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.e = l8Var.K;
        File file3 = l8Var.L;
        this.f4313f = file3 == null ? "" : file3.toString();
        this.f4315g = l8Var.M;
        this.h = l8Var.Y;
        float f7 = l8Var.Z;
        long j3 = l8Var.f4981h0;
        this.f4318i = f7 * ((float) j3);
        this.f4320j = l8Var.f4965a0 * ((float) j3);
        this.f4322k = l8Var.Q;
        this.f4324l = l8Var.R;
        this.f4325m = l8Var.f4987k0;
        this.f4326n = l8Var.f4989l0;
        this.f4327o = l8Var.m0;
        this.f4328p = l8Var.f4983i0;
        this.f4329q = l8Var.f4985j0;
        this.f4330r = j3;
        l8Var.f4992n0.getValues(fArr);
        this.f4332t = l8Var.A0;
        this.f4333u = l8Var.B0;
        CharSequence[] charSequenceArr = {l8Var.C0};
        this.f4334w = l8Var.D0 ? MediaDataController.getInstance(l8Var.f4964a).getEntities(charSequenceArr, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(l8Var.F0);
        File file4 = l8Var.P0;
        this.f4336y = file4 == null ? "" : file4.toString();
        File file5 = l8Var.R0;
        this.f4337z = file5 == null ? "" : file5.toString();
        this.A = l8Var.S0;
        this.B = l8Var.T0;
        this.C = l8Var.U0;
        File file6 = l8Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = l8Var.f4966a1;
        this.F = l8Var.I0;
        this.M = l8Var.f5008w;
        this.N = l8Var.f5010x;
        this.O = l8Var.f5012y;
        this.P = l8Var.f5014z;
        this.Q = l8Var.A;
        this.R = l8Var.B;
        this.S = l8Var.C;
        this.T = l8Var.D;
        this.U = l8Var.E;
        this.V = l8Var.F;
        this.W = l8Var.G;
        File file7 = l8Var.f4994o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = l8Var.f4996p0;
        this.Z = l8Var.f4998q0;
        this.f4306a0 = l8Var.f5000r0;
        this.f4308b0 = l8Var.f5002s0;
        this.f4310c0 = l8Var.f5004t0;
        this.f4311d0 = l8Var.f5006u0;
        this.f4312e0 = l8Var.P;
        this.f4314f0 = l8Var.f5007v0;
        this.f4316g0 = l8Var.J0;
        this.f4317h0 = l8Var.K0;
        this.f4319i0 = l8Var.L0;
        this.f4321j0 = l8Var.S;
        this.f4323k0 = VideoEditedInfo.Part.toParts(l8Var);
    }

    public final l8 a() {
        l8 l8Var = new l8();
        l8Var.f4967b = this.f4305a;
        l8Var.f4970c = true;
        l8Var.d = this.f4307b;
        String str = this.f4309c;
        if (!TextUtils.isEmpty(str)) {
            l8Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            l8Var.N0 = new File(str2);
        }
        l8Var.K = this.e;
        String str3 = this.f4313f;
        if (str3 != null) {
            l8Var.L = new File(str3);
        }
        l8Var.M = this.f4315g;
        l8Var.Y = this.h;
        long j3 = this.f4330r;
        l8Var.f4981h0 = j3;
        if (j3 > 0) {
            l8Var.Z = ((float) this.f4318i) / ((float) j3);
            l8Var.f4965a0 = ((float) this.f4320j) / ((float) j3);
        } else {
            l8Var.Z = 0.0f;
            l8Var.f4965a0 = 1.0f;
        }
        l8Var.Q = this.f4322k;
        l8Var.R = this.f4324l;
        l8Var.f4987k0 = this.f4325m;
        l8Var.f4989l0 = this.f4326n;
        l8Var.m0 = this.f4327o;
        l8Var.f4983i0 = this.f4328p;
        l8Var.f4985j0 = this.f4329q;
        l8Var.f4992n0.setValues(this.f4331s);
        l8Var.A0 = this.f4332t;
        l8Var.B0 = this.f4333u;
        String str4 = this.v;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.h6.f19242o2 == null) {
                org.telegram.ui.ActionBar.h6.O();
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, org.telegram.ui.ActionBar.h6.f19242o2.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(replaceEmoji, this.f4334w, true, false, true, false);
            l8Var.C0 = MessageObject.replaceAnimatedEmoji(replaceEmoji, this.f4334w, org.telegram.ui.ActionBar.h6.f19242o2.getFontMetricsInt());
        } else {
            l8Var.C0 = "";
        }
        ArrayList arrayList = l8Var.F0;
        arrayList.clear();
        arrayList.addAll(this.f4335x);
        String str5 = this.f4336y;
        if (str5 != null) {
            l8Var.P0 = new File(str5);
        }
        String str6 = this.f4337z;
        if (str6 != null) {
            l8Var.R0 = new File(str6);
        }
        l8Var.S0 = this.A;
        l8Var.T0 = this.B;
        l8Var.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            l8Var.Z0 = new File(str7);
        }
        l8Var.f4966a1 = this.E;
        l8Var.I0 = this.F;
        l8Var.f4979g = this.G;
        l8Var.f4977f = this.H;
        l8Var.e = this.I;
        l8Var.J = this.L;
        l8Var.I = this.K;
        l8Var.H = this.J;
        l8Var.f5008w = this.M;
        l8Var.f5010x = this.N;
        l8Var.f5012y = this.O;
        l8Var.f5014z = this.P;
        l8Var.A = this.Q;
        l8Var.B = this.R;
        l8Var.C = this.S;
        l8Var.D = this.T;
        l8Var.E = this.U;
        l8Var.F = this.V;
        l8Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            l8Var.f4994o0 = new File(str8);
        }
        l8Var.f4996p0 = this.Y;
        l8Var.f4998q0 = this.Z;
        l8Var.f5000r0 = this.f4306a0;
        l8Var.f5002s0 = this.f4308b0;
        l8Var.f5004t0 = this.f4310c0;
        l8Var.f5006u0 = this.f4311d0;
        l8Var.P = this.f4312e0;
        l8Var.f5007v0 = this.f4314f0;
        l8Var.J0 = this.f4316g0;
        l8Var.K0 = this.f4317h0;
        l8Var.L0 = this.f4319i0;
        l8Var.S = this.f4321j0;
        l8Var.T = VideoEditedInfo.Part.toStoryEntries(this.f4323k0);
        return l8Var;
    }

    public final void b(NativeByteBuffer nativeByteBuffer) {
        int size;
        int size2;
        int size3;
        int size4;
        ArrayList arrayList;
        nativeByteBuffer.writeInt32(-1318387531);
        nativeByteBuffer.writeInt64(this.f4307b);
        nativeByteBuffer.writeString(this.f4309c);
        nativeByteBuffer.writeBool(this.e);
        nativeByteBuffer.writeString(this.f4313f);
        nativeByteBuffer.writeBool(this.f4315g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.f4318i);
        nativeByteBuffer.writeInt64(this.f4320j);
        nativeByteBuffer.writeInt32(this.f4322k);
        nativeByteBuffer.writeInt32(this.f4324l);
        nativeByteBuffer.writeInt32(this.f4325m);
        nativeByteBuffer.writeInt32(this.f4326n);
        nativeByteBuffer.writeInt32(this.f4328p);
        nativeByteBuffer.writeInt32(this.f4329q);
        nativeByteBuffer.writeInt64(this.f4330r);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f4331s;
            if (i11 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i11]);
            i11++;
        }
        nativeByteBuffer.writeInt32(this.f4332t);
        nativeByteBuffer.writeInt32(this.f4333u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList2 = this.f4334w;
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
        ArrayList arrayList3 = this.f4335x;
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
        nativeByteBuffer.writeString(this.f4336y);
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
        nativeByteBuffer.writeString(this.f4337z);
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
        TLRPC.InputPeer inputPeer = this.f4314f0;
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
            nativeByteBuffer.writeInt64(this.f4306a0);
            nativeByteBuffer.writeFloat(this.f4308b0);
            nativeByteBuffer.writeFloat(this.f4310c0);
            nativeByteBuffer.writeFloat(this.f4311d0);
        }
        nativeByteBuffer.writeFloat(this.f4312e0);
        nativeByteBuffer.writeInt64(this.f4316g0);
        String str7 = this.f4317h0;
        if (str7 != null) {
            str = str7;
        }
        nativeByteBuffer.writeString(str);
        TLRPC.InputMedia inputMedia = this.f4319i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        t tVar = this.f4321j0;
        if (tVar != null && tVar.e.size() > 1 && (arrayList = this.f4323k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(tVar.f5512a);
            int size5 = arrayList.size();
            while (i10 < size5) {
                Object obj = arrayList.get(i10);
                i10++;
                ((VideoEditedInfo.Part) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        MediaController.CropState cropState = this.f4327o;
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
        this.f4331s = new float[9];
        this.f4335x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.f4311d0 = 1.0f;
        this.f4312e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.f4307b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.f4309c = readString;
            if (readString != null && readString.length() == 0) {
                this.f4309c = null;
            }
            this.e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f4313f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f4313f = null;
            }
            this.f4315g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.f4318i = nativeByteBuffer.readInt64(true);
            this.f4320j = nativeByteBuffer.readInt64(true);
            this.f4322k = nativeByteBuffer.readInt32(true);
            this.f4324l = nativeByteBuffer.readInt32(true);
            this.f4325m = nativeByteBuffer.readInt32(true);
            this.f4326n = nativeByteBuffer.readInt32(true);
            this.f4328p = nativeByteBuffer.readInt32(true);
            this.f4329q = nativeByteBuffer.readInt32(true);
            this.f4330r = nativeByteBuffer.readInt64(true);
            int i10 = 0;
            while (true) {
                float[] fArr = this.f4331s;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = nativeByteBuffer.readFloat(true);
                i10++;
            }
            this.f4332t = nativeByteBuffer.readInt32(true);
            this.f4333u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i11 = 0; i11 < readInt322; i11++) {
                    if (this.f4334w == null) {
                        this.f4334w = new ArrayList();
                    }
                    this.f4334w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.f4335x.clear();
                    for (int i12 = 0; i12 < readInt323; i12++) {
                        this.f4335x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.f4336y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.f4336y = null;
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
                                this.f4337z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.f4337z = null;
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
                                this.f4314f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.f4306a0 = nativeByteBuffer.readInt64(true);
                                this.f4308b0 = nativeByteBuffer.readFloat(true);
                                this.f4310c0 = nativeByteBuffer.readFloat(true);
                                this.f4311d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f4312e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f4316g0 = nativeByteBuffer.readInt64(true);
                                this.f4317h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.f4319i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.f4321j0 = new t(nativeByteBuffer.readString(true));
                                this.f4323k0 = new ArrayList();
                                for (int i15 = 0; i15 < this.f4321j0.e.size(); i15++) {
                                    VideoEditedInfo.Part part = new VideoEditedInfo.Part();
                                    part.readParams(nativeByteBuffer, true);
                                    part.part = (s) this.f4321j0.e.get(i15);
                                    this.f4323k0.add(part);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                MediaController.CropState cropState = new MediaController.CropState();
                                this.f4327o = cropState;
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
