package fi;

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
    public long f12017a;
    public final long f12018a0;
    public final long f12019b;
    public final float f12020b0;
    public final String f12021c;
    public final float f12022c0;
    public final String d;
    public final float f12023d0;
    public final boolean e;
    public final float f12024e0;
    public final String f12025f;
    public final TLRPC.InputPeer f12026f0;
    public final boolean f12027g;
    public final long f12028g0;
    public final boolean h;
    public final String f12029h0;
    public final long f12030i;
    public final TLRPC.InputMedia f12031i0;
    public final long f12032j;
    public final t f12033j0;
    public final int f12034k;
    public final ArrayList f12035k0;
    public final int f12036l;
    public final int f12037m;
    public final int f12038n;
    public final MediaController.CropState f12039o;
    public final int f12040p;
    public final int f12041q;
    public final long f12042r;
    public final float[] f12043s;
    public final int f12044t;
    public final int f12045u;
    public final String v;
    public final ArrayList f12046w;
    public final ArrayList f12047x;
    public final String f12048y;
    public final String f12049z;

    public z0(w7 w7Var) {
        float[] fArr = new float[9];
        this.f12043s = fArr;
        ArrayList arrayList = new ArrayList();
        this.f12047x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.f12023d0 = 1.0f;
        this.f12024e0 = 1.0f;
        this.f12017a = w7Var.f11891b;
        this.f12019b = w7Var.d;
        File file = w7Var.O0;
        this.f12021c = file == null ? "" : file.toString();
        File file2 = w7Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.e = w7Var.K;
        File file3 = w7Var.L;
        this.f12025f = file3 == null ? "" : file3.toString();
        this.f12027g = w7Var.M;
        this.h = w7Var.Y;
        float f7 = w7Var.Z;
        long j10 = w7Var.f11905h0;
        this.f12030i = f7 * ((float) j10);
        this.f12032j = w7Var.f11889a0 * ((float) j10);
        this.f12034k = w7Var.Q;
        this.f12036l = w7Var.R;
        this.f12037m = w7Var.f11911k0;
        this.f12038n = w7Var.f11913l0;
        this.f12039o = w7Var.m0;
        this.f12040p = w7Var.f11907i0;
        this.f12041q = w7Var.f11909j0;
        this.f12042r = j10;
        w7Var.f11916n0.getValues(fArr);
        this.f12044t = w7Var.A0;
        this.f12045u = w7Var.B0;
        CharSequence[] charSequenceArr = {w7Var.C0};
        this.f12046w = w7Var.D0 ? MediaDataController.getInstance(w7Var.f11888a).getEntities(charSequenceArr, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(w7Var.F0);
        File file4 = w7Var.P0;
        this.f12048y = file4 == null ? "" : file4.toString();
        File file5 = w7Var.R0;
        this.f12049z = file5 == null ? "" : file5.toString();
        this.A = w7Var.S0;
        this.B = w7Var.T0;
        this.C = w7Var.U0;
        File file6 = w7Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = w7Var.f11890a1;
        this.F = w7Var.I0;
        this.M = w7Var.f11932w;
        this.N = w7Var.f11934x;
        this.O = w7Var.f11936y;
        this.P = w7Var.f11938z;
        this.Q = w7Var.A;
        this.R = w7Var.B;
        this.S = w7Var.C;
        this.T = w7Var.D;
        this.U = w7Var.E;
        this.V = w7Var.F;
        this.W = w7Var.G;
        File file7 = w7Var.f11918o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = w7Var.f11920p0;
        this.Z = w7Var.f11922q0;
        this.f12018a0 = w7Var.f11924r0;
        this.f12020b0 = w7Var.f11926s0;
        this.f12022c0 = w7Var.f11928t0;
        this.f12023d0 = w7Var.f11930u0;
        this.f12024e0 = w7Var.P;
        this.f12026f0 = w7Var.f11931v0;
        this.f12028g0 = w7Var.J0;
        this.f12029h0 = w7Var.K0;
        this.f12031i0 = w7Var.L0;
        this.f12033j0 = w7Var.S;
        this.f12035k0 = VideoEditedInfo.Part.toParts(w7Var);
    }

    public final w7 a() {
        w7 w7Var = new w7();
        w7Var.f11891b = this.f12017a;
        w7Var.f11894c = true;
        w7Var.d = this.f12019b;
        String str = this.f12021c;
        if (!TextUtils.isEmpty(str)) {
            w7Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            w7Var.N0 = new File(str2);
        }
        w7Var.K = this.e;
        String str3 = this.f12025f;
        if (str3 != null) {
            w7Var.L = new File(str3);
        }
        w7Var.M = this.f12027g;
        w7Var.Y = this.h;
        long j10 = this.f12042r;
        w7Var.f11905h0 = j10;
        if (j10 > 0) {
            w7Var.Z = ((float) this.f12030i) / ((float) j10);
            w7Var.f11889a0 = ((float) this.f12032j) / ((float) j10);
        } else {
            w7Var.Z = 0.0f;
            w7Var.f11889a0 = 1.0f;
        }
        w7Var.Q = this.f12034k;
        w7Var.R = this.f12036l;
        w7Var.f11911k0 = this.f12037m;
        w7Var.f11913l0 = this.f12038n;
        w7Var.m0 = this.f12039o;
        w7Var.f11907i0 = this.f12040p;
        w7Var.f11909j0 = this.f12041q;
        w7Var.f11916n0.setValues(this.f12043s);
        w7Var.A0 = this.f12044t;
        w7Var.B0 = this.f12045u;
        String str4 = this.v;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.y6.f23556o2 == null) {
                org.telegram.ui.ActionBar.y6.P();
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, org.telegram.ui.ActionBar.y6.f23556o2.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(replaceEmoji, this.f12046w, true, false, true, false);
            w7Var.C0 = MessageObject.replaceAnimatedEmoji(replaceEmoji, this.f12046w, org.telegram.ui.ActionBar.y6.f23556o2.getFontMetricsInt());
        } else {
            w7Var.C0 = "";
        }
        ArrayList arrayList = w7Var.F0;
        arrayList.clear();
        arrayList.addAll(this.f12047x);
        String str5 = this.f12048y;
        if (str5 != null) {
            w7Var.P0 = new File(str5);
        }
        String str6 = this.f12049z;
        if (str6 != null) {
            w7Var.R0 = new File(str6);
        }
        w7Var.S0 = this.A;
        w7Var.T0 = this.B;
        w7Var.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            w7Var.Z0 = new File(str7);
        }
        w7Var.f11890a1 = this.E;
        w7Var.I0 = this.F;
        w7Var.f11903g = this.G;
        w7Var.f11901f = this.H;
        w7Var.e = this.I;
        w7Var.J = this.L;
        w7Var.I = this.K;
        w7Var.H = this.J;
        w7Var.f11932w = this.M;
        w7Var.f11934x = this.N;
        w7Var.f11936y = this.O;
        w7Var.f11938z = this.P;
        w7Var.A = this.Q;
        w7Var.B = this.R;
        w7Var.C = this.S;
        w7Var.D = this.T;
        w7Var.E = this.U;
        w7Var.F = this.V;
        w7Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            w7Var.f11918o0 = new File(str8);
        }
        w7Var.f11920p0 = this.Y;
        w7Var.f11922q0 = this.Z;
        w7Var.f11924r0 = this.f12018a0;
        w7Var.f11926s0 = this.f12020b0;
        w7Var.f11928t0 = this.f12022c0;
        w7Var.f11930u0 = this.f12023d0;
        w7Var.P = this.f12024e0;
        w7Var.f11931v0 = this.f12026f0;
        w7Var.J0 = this.f12028g0;
        w7Var.K0 = this.f12029h0;
        w7Var.L0 = this.f12031i0;
        w7Var.S = this.f12033j0;
        w7Var.T = VideoEditedInfo.Part.toStoryEntries(this.f12035k0);
        return w7Var;
    }

    public final void b(NativeByteBuffer nativeByteBuffer) {
        int size;
        int size2;
        int size3;
        int size4;
        ArrayList arrayList;
        nativeByteBuffer.writeInt32(-1318387531);
        nativeByteBuffer.writeInt64(this.f12019b);
        nativeByteBuffer.writeString(this.f12021c);
        nativeByteBuffer.writeBool(this.e);
        nativeByteBuffer.writeString(this.f12025f);
        nativeByteBuffer.writeBool(this.f12027g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.f12030i);
        nativeByteBuffer.writeInt64(this.f12032j);
        nativeByteBuffer.writeInt32(this.f12034k);
        nativeByteBuffer.writeInt32(this.f12036l);
        nativeByteBuffer.writeInt32(this.f12037m);
        nativeByteBuffer.writeInt32(this.f12038n);
        nativeByteBuffer.writeInt32(this.f12040p);
        nativeByteBuffer.writeInt32(this.f12041q);
        nativeByteBuffer.writeInt64(this.f12042r);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f12043s;
            if (i11 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i11]);
            i11++;
        }
        nativeByteBuffer.writeInt32(this.f12044t);
        nativeByteBuffer.writeInt32(this.f12045u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList2 = this.f12046w;
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
        ArrayList arrayList3 = this.f12047x;
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
        nativeByteBuffer.writeString(this.f12048y);
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
        nativeByteBuffer.writeString(this.f12049z);
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
        TLRPC.InputPeer inputPeer = this.f12026f0;
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
            nativeByteBuffer.writeInt64(this.f12018a0);
            nativeByteBuffer.writeFloat(this.f12020b0);
            nativeByteBuffer.writeFloat(this.f12022c0);
            nativeByteBuffer.writeFloat(this.f12023d0);
        }
        nativeByteBuffer.writeFloat(this.f12024e0);
        nativeByteBuffer.writeInt64(this.f12028g0);
        String str7 = this.f12029h0;
        if (str7 != null) {
            str = str7;
        }
        nativeByteBuffer.writeString(str);
        TLRPC.InputMedia inputMedia = this.f12031i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        t tVar = this.f12033j0;
        if (tVar != null && tVar.e.size() > 1 && (arrayList = this.f12035k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(tVar.f11691a);
            int size5 = arrayList.size();
            while (i10 < size5) {
                Object obj = arrayList.get(i10);
                i10++;
                ((VideoEditedInfo.Part) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        MediaController.CropState cropState = this.f12039o;
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
        this.f12043s = new float[9];
        this.f12047x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.f12023d0 = 1.0f;
        this.f12024e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.f12019b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.f12021c = readString;
            if (readString != null && readString.length() == 0) {
                this.f12021c = null;
            }
            this.e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f12025f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f12025f = null;
            }
            this.f12027g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.f12030i = nativeByteBuffer.readInt64(true);
            this.f12032j = nativeByteBuffer.readInt64(true);
            this.f12034k = nativeByteBuffer.readInt32(true);
            this.f12036l = nativeByteBuffer.readInt32(true);
            this.f12037m = nativeByteBuffer.readInt32(true);
            this.f12038n = nativeByteBuffer.readInt32(true);
            this.f12040p = nativeByteBuffer.readInt32(true);
            this.f12041q = nativeByteBuffer.readInt32(true);
            this.f12042r = nativeByteBuffer.readInt64(true);
            int i10 = 0;
            while (true) {
                float[] fArr = this.f12043s;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = nativeByteBuffer.readFloat(true);
                i10++;
            }
            this.f12044t = nativeByteBuffer.readInt32(true);
            this.f12045u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i11 = 0; i11 < readInt322; i11++) {
                    if (this.f12046w == null) {
                        this.f12046w = new ArrayList();
                    }
                    this.f12046w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.f12047x.clear();
                    for (int i12 = 0; i12 < readInt323; i12++) {
                        this.f12047x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.f12048y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.f12048y = null;
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
                                this.f12049z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.f12049z = null;
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
                                this.f12026f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.f12018a0 = nativeByteBuffer.readInt64(true);
                                this.f12020b0 = nativeByteBuffer.readFloat(true);
                                this.f12022c0 = nativeByteBuffer.readFloat(true);
                                this.f12023d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f12024e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f12028g0 = nativeByteBuffer.readInt64(true);
                                this.f12029h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.f12031i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.f12033j0 = new t(nativeByteBuffer.readString(true));
                                this.f12035k0 = new ArrayList();
                                for (int i15 = 0; i15 < this.f12033j0.e.size(); i15++) {
                                    VideoEditedInfo.Part part = new VideoEditedInfo.Part();
                                    part.readParams(nativeByteBuffer, true);
                                    part.part = (s) this.f12033j0.e.get(i15);
                                    this.f12035k0.add(part);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                MediaController.CropState cropState = new MediaController.CropState();
                                this.f12039o = cropState;
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
