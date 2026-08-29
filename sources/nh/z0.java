package nh;

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
    public long f18919a;
    public final long f18920a0;
    public final long f18921b;
    public final float f18922b0;
    public final String f18923c;
    public final float f18924c0;
    public final String d;
    public final float f18925d0;
    public final boolean f18926e;
    public final float f18927e0;
    public final String f18928f;
    public final TLRPC.InputPeer f18929f0;
    public final boolean f18930g;
    public final long f18931g0;
    public final boolean h;
    public final String f18932h0;
    public final long f18933i;
    public final TLRPC.InputMedia f18934i0;
    public final long f18935j;
    public final t f18936j0;
    public final int f18937k;
    public final ArrayList f18938k0;
    public final int f18939l;
    public final int f18940m;
    public final int f18941n;
    public final MediaController.CropState f18942o;
    public final int f18943p;
    public final int f18944q;
    public final long f18945r;
    public final float[] f18946s;
    public final int f18947t;
    public final int f18948u;
    public final String v;
    public final ArrayList f18949w;
    public final ArrayList f18950x;
    public final String f18951y;
    public final String f18952z;

    public z0(o7 o7Var) {
        float[] fArr = new float[9];
        this.f18946s = fArr;
        ArrayList arrayList = new ArrayList();
        this.f18950x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.f18925d0 = 1.0f;
        this.f18927e0 = 1.0f;
        this.f18919a = o7Var.f18257b;
        this.f18921b = o7Var.d;
        File file = o7Var.O0;
        this.f18923c = file == null ? "" : file.toString();
        File file2 = o7Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.f18926e = o7Var.K;
        File file3 = o7Var.L;
        this.f18928f = file3 == null ? "" : file3.toString();
        this.f18930g = o7Var.M;
        this.h = o7Var.Y;
        float f9 = o7Var.Z;
        long j10 = o7Var.f18272h0;
        this.f18933i = f9 * ((float) j10);
        this.f18935j = o7Var.f18255a0 * ((float) j10);
        this.f18937k = o7Var.Q;
        this.f18939l = o7Var.R;
        this.f18940m = o7Var.f18278k0;
        this.f18941n = o7Var.f18280l0;
        this.f18942o = o7Var.m0;
        this.f18943p = o7Var.f18274i0;
        this.f18944q = o7Var.f18276j0;
        this.f18945r = j10;
        o7Var.f18283n0.getValues(fArr);
        this.f18947t = o7Var.A0;
        this.f18948u = o7Var.B0;
        CharSequence[] charSequenceArr = {o7Var.C0};
        this.f18949w = o7Var.D0 ? MediaDataController.getInstance(o7Var.f18254a).getEntities(charSequenceArr, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(o7Var.F0);
        File file4 = o7Var.P0;
        this.f18951y = file4 == null ? "" : file4.toString();
        File file5 = o7Var.R0;
        this.f18952z = file5 == null ? "" : file5.toString();
        this.A = o7Var.S0;
        this.B = o7Var.T0;
        this.C = o7Var.U0;
        File file6 = o7Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = o7Var.f18256a1;
        this.F = o7Var.I0;
        this.M = o7Var.f18299w;
        this.N = o7Var.f18301x;
        this.O = o7Var.f18303y;
        this.P = o7Var.f18305z;
        this.Q = o7Var.A;
        this.R = o7Var.B;
        this.S = o7Var.C;
        this.T = o7Var.D;
        this.U = o7Var.E;
        this.V = o7Var.F;
        this.W = o7Var.G;
        File file7 = o7Var.f18285o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = o7Var.f18287p0;
        this.Z = o7Var.f18289q0;
        this.f18920a0 = o7Var.f18291r0;
        this.f18922b0 = o7Var.f18293s0;
        this.f18924c0 = o7Var.f18295t0;
        this.f18925d0 = o7Var.f18297u0;
        this.f18927e0 = o7Var.P;
        this.f18929f0 = o7Var.f18298v0;
        this.f18931g0 = o7Var.J0;
        this.f18932h0 = o7Var.K0;
        this.f18934i0 = o7Var.L0;
        this.f18936j0 = o7Var.S;
        this.f18938k0 = VideoEditedInfo.Part.toParts(o7Var);
    }

    public final o7 a() {
        o7 o7Var = new o7();
        o7Var.f18257b = this.f18919a;
        o7Var.f18260c = true;
        o7Var.d = this.f18921b;
        String str = this.f18923c;
        if (!TextUtils.isEmpty(str)) {
            o7Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            o7Var.N0 = new File(str2);
        }
        o7Var.K = this.f18926e;
        String str3 = this.f18928f;
        if (str3 != null) {
            o7Var.L = new File(str3);
        }
        o7Var.M = this.f18930g;
        o7Var.Y = this.h;
        long j10 = this.f18945r;
        o7Var.f18272h0 = j10;
        if (j10 > 0) {
            o7Var.Z = ((float) this.f18933i) / ((float) j10);
            o7Var.f18255a0 = ((float) this.f18935j) / ((float) j10);
        } else {
            o7Var.Z = 0.0f;
            o7Var.f18255a0 = 1.0f;
        }
        o7Var.Q = this.f18937k;
        o7Var.R = this.f18939l;
        o7Var.f18278k0 = this.f18940m;
        o7Var.f18280l0 = this.f18941n;
        o7Var.m0 = this.f18942o;
        o7Var.f18274i0 = this.f18943p;
        o7Var.f18276j0 = this.f18944q;
        o7Var.f18283n0.setValues(this.f18946s);
        o7Var.A0 = this.f18947t;
        o7Var.B0 = this.f18948u;
        String str4 = this.v;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.g6.f23256o2 == null) {
                org.telegram.ui.ActionBar.g6.O();
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, org.telegram.ui.ActionBar.g6.f23256o2.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(replaceEmoji, this.f18949w, true, false, true, false);
            o7Var.C0 = MessageObject.replaceAnimatedEmoji(replaceEmoji, this.f18949w, org.telegram.ui.ActionBar.g6.f23256o2.getFontMetricsInt());
        } else {
            o7Var.C0 = "";
        }
        ArrayList arrayList = o7Var.F0;
        arrayList.clear();
        arrayList.addAll(this.f18950x);
        String str5 = this.f18951y;
        if (str5 != null) {
            o7Var.P0 = new File(str5);
        }
        String str6 = this.f18952z;
        if (str6 != null) {
            o7Var.R0 = new File(str6);
        }
        o7Var.S0 = this.A;
        o7Var.T0 = this.B;
        o7Var.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            o7Var.Z0 = new File(str7);
        }
        o7Var.f18256a1 = this.E;
        o7Var.I0 = this.F;
        o7Var.f18270g = this.G;
        o7Var.f18268f = this.H;
        o7Var.f18265e = this.I;
        o7Var.J = this.L;
        o7Var.I = this.K;
        o7Var.H = this.J;
        o7Var.f18299w = this.M;
        o7Var.f18301x = this.N;
        o7Var.f18303y = this.O;
        o7Var.f18305z = this.P;
        o7Var.A = this.Q;
        o7Var.B = this.R;
        o7Var.C = this.S;
        o7Var.D = this.T;
        o7Var.E = this.U;
        o7Var.F = this.V;
        o7Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            o7Var.f18285o0 = new File(str8);
        }
        o7Var.f18287p0 = this.Y;
        o7Var.f18289q0 = this.Z;
        o7Var.f18291r0 = this.f18920a0;
        o7Var.f18293s0 = this.f18922b0;
        o7Var.f18295t0 = this.f18924c0;
        o7Var.f18297u0 = this.f18925d0;
        o7Var.P = this.f18927e0;
        o7Var.f18298v0 = this.f18929f0;
        o7Var.J0 = this.f18931g0;
        o7Var.K0 = this.f18932h0;
        o7Var.L0 = this.f18934i0;
        o7Var.S = this.f18936j0;
        o7Var.T = VideoEditedInfo.Part.toStoryEntries(this.f18938k0);
        return o7Var;
    }

    public final void b(NativeByteBuffer nativeByteBuffer) {
        int size;
        int size2;
        int size3;
        int size4;
        ArrayList arrayList;
        nativeByteBuffer.writeInt32(-1318387531);
        nativeByteBuffer.writeInt64(this.f18921b);
        nativeByteBuffer.writeString(this.f18923c);
        nativeByteBuffer.writeBool(this.f18926e);
        nativeByteBuffer.writeString(this.f18928f);
        nativeByteBuffer.writeBool(this.f18930g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.f18933i);
        nativeByteBuffer.writeInt64(this.f18935j);
        nativeByteBuffer.writeInt32(this.f18937k);
        nativeByteBuffer.writeInt32(this.f18939l);
        nativeByteBuffer.writeInt32(this.f18940m);
        nativeByteBuffer.writeInt32(this.f18941n);
        nativeByteBuffer.writeInt32(this.f18943p);
        nativeByteBuffer.writeInt32(this.f18944q);
        nativeByteBuffer.writeInt64(this.f18945r);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f18946s;
            if (i11 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i11]);
            i11++;
        }
        nativeByteBuffer.writeInt32(this.f18947t);
        nativeByteBuffer.writeInt32(this.f18948u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList2 = this.f18949w;
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
        ArrayList arrayList3 = this.f18950x;
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
        nativeByteBuffer.writeString(this.f18951y);
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
        nativeByteBuffer.writeString(this.f18952z);
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
        TLRPC.InputPeer inputPeer = this.f18929f0;
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
            nativeByteBuffer.writeInt64(this.f18920a0);
            nativeByteBuffer.writeFloat(this.f18922b0);
            nativeByteBuffer.writeFloat(this.f18924c0);
            nativeByteBuffer.writeFloat(this.f18925d0);
        }
        nativeByteBuffer.writeFloat(this.f18927e0);
        nativeByteBuffer.writeInt64(this.f18931g0);
        String str7 = this.f18932h0;
        if (str7 != null) {
            str = str7;
        }
        nativeByteBuffer.writeString(str);
        TLRPC.InputMedia inputMedia = this.f18934i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        t tVar = this.f18936j0;
        if (tVar != null && tVar.f18567e.size() > 1 && (arrayList = this.f18938k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(tVar.f18564a);
            int size5 = arrayList.size();
            while (i10 < size5) {
                Object obj = arrayList.get(i10);
                i10++;
                ((VideoEditedInfo.Part) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        MediaController.CropState cropState = this.f18942o;
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
        this.f18946s = new float[9];
        this.f18950x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.f18925d0 = 1.0f;
        this.f18927e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.f18921b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.f18923c = readString;
            if (readString != null && readString.length() == 0) {
                this.f18923c = null;
            }
            this.f18926e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f18928f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f18928f = null;
            }
            this.f18930g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.f18933i = nativeByteBuffer.readInt64(true);
            this.f18935j = nativeByteBuffer.readInt64(true);
            this.f18937k = nativeByteBuffer.readInt32(true);
            this.f18939l = nativeByteBuffer.readInt32(true);
            this.f18940m = nativeByteBuffer.readInt32(true);
            this.f18941n = nativeByteBuffer.readInt32(true);
            this.f18943p = nativeByteBuffer.readInt32(true);
            this.f18944q = nativeByteBuffer.readInt32(true);
            this.f18945r = nativeByteBuffer.readInt64(true);
            int i10 = 0;
            while (true) {
                float[] fArr = this.f18946s;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = nativeByteBuffer.readFloat(true);
                i10++;
            }
            this.f18947t = nativeByteBuffer.readInt32(true);
            this.f18948u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i11 = 0; i11 < readInt322; i11++) {
                    if (this.f18949w == null) {
                        this.f18949w = new ArrayList();
                    }
                    this.f18949w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.f18950x.clear();
                    for (int i12 = 0; i12 < readInt323; i12++) {
                        this.f18950x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.f18951y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.f18951y = null;
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
                                this.f18952z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.f18952z = null;
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
                                this.f18929f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.f18920a0 = nativeByteBuffer.readInt64(true);
                                this.f18922b0 = nativeByteBuffer.readFloat(true);
                                this.f18924c0 = nativeByteBuffer.readFloat(true);
                                this.f18925d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f18927e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f18931g0 = nativeByteBuffer.readInt64(true);
                                this.f18932h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.f18934i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.f18936j0 = new t(nativeByteBuffer.readString(true));
                                this.f18938k0 = new ArrayList();
                                for (int i15 = 0; i15 < this.f18936j0.f18567e.size(); i15++) {
                                    VideoEditedInfo.Part part = new VideoEditedInfo.Part();
                                    part.readParams(nativeByteBuffer, true);
                                    part.part = (s) this.f18936j0.f18567e.get(i15);
                                    this.f18938k0.add(part);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                MediaController.CropState cropState = new MediaController.CropState();
                                this.f18942o = cropState;
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
