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
    public long f8142a;
    public final long f8143a0;
    public final long f8144b;
    public final float f8145b0;
    public final String f8146c;
    public final float f8147c0;
    public final String d;
    public final float f8148d0;
    public final boolean e;
    public final float f8149e0;
    public final String f8150f;
    public final TLRPC.InputPeer f8151f0;
    public final boolean f8152g;
    public final long f8153g0;
    public final boolean h;
    public final String f8154h0;
    public final long f8155i;
    public final TLRPC.InputMedia f8156i0;
    public final long f8157j;
    public final t f8158j0;
    public final int f8159k;
    public final ArrayList f8160k0;
    public final int f8161l;
    public final int f8162m;
    public final int f8163n;
    public final MediaController.CropState f8164o;
    public final int f8165p;
    public final int f8166q;
    public final long f8167r;
    public final float[] f8168s;
    public final int f8169t;
    public final int f8170u;
    public final String v;
    public final ArrayList f8171w;
    public final ArrayList f8172x;
    public final String f8173y;
    public final String f8174z;

    public z0(k8 k8Var) {
        float[] fArr = new float[9];
        this.f8168s = fArr;
        ArrayList arrayList = new ArrayList();
        this.f8172x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.f8148d0 = 1.0f;
        this.f8149e0 = 1.0f;
        this.f8142a = k8Var.f7175b;
        this.f8144b = k8Var.d;
        File file = k8Var.O0;
        this.f8146c = file == null ? "" : file.toString();
        File file2 = k8Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.e = k8Var.K;
        File file3 = k8Var.L;
        this.f8150f = file3 == null ? "" : file3.toString();
        this.f8152g = k8Var.M;
        this.h = k8Var.Y;
        float f7 = k8Var.Z;
        long j10 = k8Var.f7189h0;
        this.f8155i = f7 * ((float) j10);
        this.f8157j = k8Var.f7173a0 * ((float) j10);
        this.f8159k = k8Var.Q;
        this.f8161l = k8Var.R;
        this.f8162m = k8Var.f7195k0;
        this.f8163n = k8Var.f7197l0;
        this.f8164o = k8Var.m0;
        this.f8165p = k8Var.f7191i0;
        this.f8166q = k8Var.f7193j0;
        this.f8167r = j10;
        k8Var.f7200n0.getValues(fArr);
        this.f8169t = k8Var.A0;
        this.f8170u = k8Var.B0;
        CharSequence[] charSequenceArr = {k8Var.C0};
        this.f8171w = k8Var.D0 ? MediaDataController.getInstance(k8Var.f7172a).getEntities(charSequenceArr, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(k8Var.F0);
        File file4 = k8Var.P0;
        this.f8173y = file4 == null ? "" : file4.toString();
        File file5 = k8Var.R0;
        this.f8174z = file5 == null ? "" : file5.toString();
        this.A = k8Var.S0;
        this.B = k8Var.T0;
        this.C = k8Var.U0;
        File file6 = k8Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = k8Var.f7174a1;
        this.F = k8Var.I0;
        this.M = k8Var.f7216w;
        this.N = k8Var.f7218x;
        this.O = k8Var.f7220y;
        this.P = k8Var.f7222z;
        this.Q = k8Var.A;
        this.R = k8Var.B;
        this.S = k8Var.C;
        this.T = k8Var.D;
        this.U = k8Var.E;
        this.V = k8Var.F;
        this.W = k8Var.G;
        File file7 = k8Var.f7202o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = k8Var.f7204p0;
        this.Z = k8Var.f7206q0;
        this.f8143a0 = k8Var.f7208r0;
        this.f8145b0 = k8Var.f7210s0;
        this.f8147c0 = k8Var.f7212t0;
        this.f8148d0 = k8Var.f7214u0;
        this.f8149e0 = k8Var.P;
        this.f8151f0 = k8Var.f7215v0;
        this.f8153g0 = k8Var.J0;
        this.f8154h0 = k8Var.K0;
        this.f8156i0 = k8Var.L0;
        this.f8158j0 = k8Var.S;
        this.f8160k0 = VideoEditedInfo.Part.toParts(k8Var);
    }

    public final k8 a() {
        k8 k8Var = new k8();
        k8Var.f7175b = this.f8142a;
        k8Var.f7178c = true;
        k8Var.d = this.f8144b;
        String str = this.f8146c;
        if (!TextUtils.isEmpty(str)) {
            k8Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            k8Var.N0 = new File(str2);
        }
        k8Var.K = this.e;
        String str3 = this.f8150f;
        if (str3 != null) {
            k8Var.L = new File(str3);
        }
        k8Var.M = this.f8152g;
        k8Var.Y = this.h;
        long j10 = this.f8167r;
        k8Var.f7189h0 = j10;
        if (j10 > 0) {
            k8Var.Z = ((float) this.f8155i) / ((float) j10);
            k8Var.f7173a0 = ((float) this.f8157j) / ((float) j10);
        } else {
            k8Var.Z = 0.0f;
            k8Var.f7173a0 = 1.0f;
        }
        k8Var.Q = this.f8159k;
        k8Var.R = this.f8161l;
        k8Var.f7195k0 = this.f8162m;
        k8Var.f7197l0 = this.f8163n;
        k8Var.m0 = this.f8164o;
        k8Var.f7191i0 = this.f8165p;
        k8Var.f7193j0 = this.f8166q;
        k8Var.f7200n0.setValues(this.f8168s);
        k8Var.A0 = this.f8169t;
        k8Var.B0 = this.f8170u;
        String str4 = this.v;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.g6.f20100o2 == null) {
                org.telegram.ui.ActionBar.g6.P();
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, org.telegram.ui.ActionBar.g6.f20100o2.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(replaceEmoji, this.f8171w, true, false, true, false);
            k8Var.C0 = MessageObject.replaceAnimatedEmoji(replaceEmoji, this.f8171w, org.telegram.ui.ActionBar.g6.f20100o2.getFontMetricsInt());
        } else {
            k8Var.C0 = "";
        }
        ArrayList arrayList = k8Var.F0;
        arrayList.clear();
        arrayList.addAll(this.f8172x);
        String str5 = this.f8173y;
        if (str5 != null) {
            k8Var.P0 = new File(str5);
        }
        String str6 = this.f8174z;
        if (str6 != null) {
            k8Var.R0 = new File(str6);
        }
        k8Var.S0 = this.A;
        k8Var.T0 = this.B;
        k8Var.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            k8Var.Z0 = new File(str7);
        }
        k8Var.f7174a1 = this.E;
        k8Var.I0 = this.F;
        k8Var.f7187g = this.G;
        k8Var.f7185f = this.H;
        k8Var.e = this.I;
        k8Var.J = this.L;
        k8Var.I = this.K;
        k8Var.H = this.J;
        k8Var.f7216w = this.M;
        k8Var.f7218x = this.N;
        k8Var.f7220y = this.O;
        k8Var.f7222z = this.P;
        k8Var.A = this.Q;
        k8Var.B = this.R;
        k8Var.C = this.S;
        k8Var.D = this.T;
        k8Var.E = this.U;
        k8Var.F = this.V;
        k8Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            k8Var.f7202o0 = new File(str8);
        }
        k8Var.f7204p0 = this.Y;
        k8Var.f7206q0 = this.Z;
        k8Var.f7208r0 = this.f8143a0;
        k8Var.f7210s0 = this.f8145b0;
        k8Var.f7212t0 = this.f8147c0;
        k8Var.f7214u0 = this.f8148d0;
        k8Var.P = this.f8149e0;
        k8Var.f7215v0 = this.f8151f0;
        k8Var.J0 = this.f8153g0;
        k8Var.K0 = this.f8154h0;
        k8Var.L0 = this.f8156i0;
        k8Var.S = this.f8158j0;
        k8Var.T = VideoEditedInfo.Part.toStoryEntries(this.f8160k0);
        return k8Var;
    }

    public final void b(NativeByteBuffer nativeByteBuffer) {
        int size;
        int size2;
        int size3;
        int size4;
        ArrayList arrayList;
        nativeByteBuffer.writeInt32(-1318387531);
        nativeByteBuffer.writeInt64(this.f8144b);
        nativeByteBuffer.writeString(this.f8146c);
        nativeByteBuffer.writeBool(this.e);
        nativeByteBuffer.writeString(this.f8150f);
        nativeByteBuffer.writeBool(this.f8152g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.f8155i);
        nativeByteBuffer.writeInt64(this.f8157j);
        nativeByteBuffer.writeInt32(this.f8159k);
        nativeByteBuffer.writeInt32(this.f8161l);
        nativeByteBuffer.writeInt32(this.f8162m);
        nativeByteBuffer.writeInt32(this.f8163n);
        nativeByteBuffer.writeInt32(this.f8165p);
        nativeByteBuffer.writeInt32(this.f8166q);
        nativeByteBuffer.writeInt64(this.f8167r);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f8168s;
            if (i11 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i11]);
            i11++;
        }
        nativeByteBuffer.writeInt32(this.f8169t);
        nativeByteBuffer.writeInt32(this.f8170u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList2 = this.f8171w;
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
        ArrayList arrayList3 = this.f8172x;
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
        nativeByteBuffer.writeString(this.f8173y);
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
        nativeByteBuffer.writeString(this.f8174z);
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
        TLRPC.InputPeer inputPeer = this.f8151f0;
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
            nativeByteBuffer.writeInt64(this.f8143a0);
            nativeByteBuffer.writeFloat(this.f8145b0);
            nativeByteBuffer.writeFloat(this.f8147c0);
            nativeByteBuffer.writeFloat(this.f8148d0);
        }
        nativeByteBuffer.writeFloat(this.f8149e0);
        nativeByteBuffer.writeInt64(this.f8153g0);
        String str7 = this.f8154h0;
        if (str7 != null) {
            str = str7;
        }
        nativeByteBuffer.writeString(str);
        TLRPC.InputMedia inputMedia = this.f8156i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        t tVar = this.f8158j0;
        if (tVar != null && tVar.e.size() > 1 && (arrayList = this.f8160k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(tVar.f7809a);
            int size5 = arrayList.size();
            while (i10 < size5) {
                Object obj = arrayList.get(i10);
                i10++;
                ((VideoEditedInfo.Part) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        MediaController.CropState cropState = this.f8164o;
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
        this.f8168s = new float[9];
        this.f8172x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.f8148d0 = 1.0f;
        this.f8149e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.f8144b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.f8146c = readString;
            if (readString != null && readString.length() == 0) {
                this.f8146c = null;
            }
            this.e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f8150f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f8150f = null;
            }
            this.f8152g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.f8155i = nativeByteBuffer.readInt64(true);
            this.f8157j = nativeByteBuffer.readInt64(true);
            this.f8159k = nativeByteBuffer.readInt32(true);
            this.f8161l = nativeByteBuffer.readInt32(true);
            this.f8162m = nativeByteBuffer.readInt32(true);
            this.f8163n = nativeByteBuffer.readInt32(true);
            this.f8165p = nativeByteBuffer.readInt32(true);
            this.f8166q = nativeByteBuffer.readInt32(true);
            this.f8167r = nativeByteBuffer.readInt64(true);
            int i10 = 0;
            while (true) {
                float[] fArr = this.f8168s;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = nativeByteBuffer.readFloat(true);
                i10++;
            }
            this.f8169t = nativeByteBuffer.readInt32(true);
            this.f8170u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i11 = 0; i11 < readInt322; i11++) {
                    if (this.f8171w == null) {
                        this.f8171w = new ArrayList();
                    }
                    this.f8171w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.f8172x.clear();
                    for (int i12 = 0; i12 < readInt323; i12++) {
                        this.f8172x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.f8173y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.f8173y = null;
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
                                this.f8174z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.f8174z = null;
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
                                this.f8151f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.f8143a0 = nativeByteBuffer.readInt64(true);
                                this.f8145b0 = nativeByteBuffer.readFloat(true);
                                this.f8147c0 = nativeByteBuffer.readFloat(true);
                                this.f8148d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f8149e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f8153g0 = nativeByteBuffer.readInt64(true);
                                this.f8154h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.f8156i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.f8158j0 = new t(nativeByteBuffer.readString(true));
                                this.f8160k0 = new ArrayList();
                                for (int i15 = 0; i15 < this.f8158j0.e.size(); i15++) {
                                    VideoEditedInfo.Part part = new VideoEditedInfo.Part();
                                    part.readParams(nativeByteBuffer, true);
                                    part.part = (s) this.f8158j0.e.get(i15);
                                    this.f8160k0.add(part);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                MediaController.CropState cropState = new MediaController.CropState();
                                this.f8164o = cropState;
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
