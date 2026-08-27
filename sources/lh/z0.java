package lh;

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

    public long f17139a;

    public final long f17140a0;

    public final long f17141b;

    public final float f17142b0;

    public final String f17143c;

    public final float f17144c0;
    public final String d;

    public final float f17145d0;

    public final boolean f17146e;

    public final float f17147e0;

    public final String f17148f;

    public final TLRPC.InputPeer f17149f0;

    public final boolean f17150g;

    public final long f17151g0;
    public final boolean h;

    public final String f17152h0;

    public final long f17153i;

    public final TLRPC.InputMedia f17154i0;

    public final long f17155j;

    public final u f17156j0;

    public final int f17157k;

    public final ArrayList f17158k0;

    public final int f17159l;

    public final int f17160m;

    public final int f17161n;

    public final MediaController.CropState f17162o;

    public final int f17163p;

    public final int f17164q;

    public final long f17165r;

    public final float[] f17166s;

    public final int f17167t;

    public final int f17168u;
    public final String v;

    public final ArrayList f17169w;

    public final ArrayList f17170x;

    public final String f17171y;

    public final String f17172z;

    public z0(z7 z7Var) {
        float[] fArr = new float[9];
        this.f17166s = fArr;
        ArrayList arrayList = new ArrayList();
        this.f17170x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.f17145d0 = 1.0f;
        this.f17147e0 = 1.0f;
        this.f17139a = z7Var.f17196b;
        this.f17141b = z7Var.d;
        File file = z7Var.O0;
        this.f17143c = file == null ? "" : file.toString();
        File file2 = z7Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.f17146e = z7Var.K;
        File file3 = z7Var.L;
        this.f17148f = file3 == null ? "" : file3.toString();
        this.f17150g = z7Var.M;
        this.h = z7Var.Y;
        float f10 = z7Var.Z;
        long j10 = z7Var.f17211h0;
        this.f17153i = (long) (f10 * j10);
        this.f17155j = (long) (z7Var.f17194a0 * j10);
        this.f17157k = z7Var.Q;
        this.f17159l = z7Var.R;
        this.f17160m = z7Var.f17217k0;
        this.f17161n = z7Var.f17219l0;
        this.f17162o = z7Var.m0;
        this.f17163p = z7Var.f17213i0;
        this.f17164q = z7Var.f17215j0;
        this.f17165r = j10;
        z7Var.f17222n0.getValues(fArr);
        this.f17167t = z7Var.A0;
        this.f17168u = z7Var.B0;
        CharSequence[] charSequenceArr = {z7Var.C0};
        this.f17169w = z7Var.D0 ? MediaDataController.getInstance(z7Var.f17193a).getEntities(charSequenceArr, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(z7Var.F0);
        File file4 = z7Var.P0;
        this.f17171y = file4 == null ? "" : file4.toString();
        File file5 = z7Var.R0;
        this.f17172z = file5 == null ? "" : file5.toString();
        this.A = z7Var.S0;
        this.B = z7Var.T0;
        this.C = z7Var.U0;
        File file6 = z7Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = z7Var.f17195a1;
        this.F = z7Var.I0;
        this.M = z7Var.f17238w;
        this.N = z7Var.f17240x;
        this.O = z7Var.f17242y;
        this.P = z7Var.f17244z;
        this.Q = z7Var.A;
        this.R = z7Var.B;
        this.S = z7Var.C;
        this.T = z7Var.D;
        this.U = z7Var.E;
        this.V = z7Var.F;
        this.W = z7Var.G;
        File file7 = z7Var.f17224o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = z7Var.f17226p0;
        this.Z = z7Var.f17228q0;
        this.f17140a0 = z7Var.f17230r0;
        this.f17142b0 = z7Var.f17232s0;
        this.f17144c0 = z7Var.f17234t0;
        this.f17145d0 = z7Var.f17236u0;
        this.f17147e0 = z7Var.P;
        this.f17149f0 = z7Var.f17237v0;
        this.f17151g0 = z7Var.J0;
        this.f17152h0 = z7Var.K0;
        this.f17154i0 = z7Var.L0;
        this.f17156j0 = z7Var.S;
        this.f17158k0 = VideoEditedInfo.Part.toParts(z7Var);
    }

    public final z7 a() {
        z7 z7Var = new z7();
        z7Var.f17196b = this.f17139a;
        z7Var.f17199c = true;
        z7Var.d = this.f17141b;
        String str = this.f17143c;
        if (!TextUtils.isEmpty(str)) {
            z7Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            z7Var.N0 = new File(str2);
        }
        z7Var.K = this.f17146e;
        String str3 = this.f17148f;
        if (str3 != null) {
            z7Var.L = new File(str3);
        }
        z7Var.M = this.f17150g;
        z7Var.Y = this.h;
        long j10 = this.f17165r;
        z7Var.f17211h0 = j10;
        if (j10 > 0) {
            z7Var.Z = this.f17153i / j10;
            z7Var.f17194a0 = this.f17155j / j10;
        } else {
            z7Var.Z = 0.0f;
            z7Var.f17194a0 = 1.0f;
        }
        z7Var.Q = this.f17157k;
        z7Var.R = this.f17159l;
        z7Var.f17217k0 = this.f17160m;
        z7Var.f17219l0 = this.f17161n;
        z7Var.m0 = this.f17162o;
        z7Var.f17213i0 = this.f17163p;
        z7Var.f17215j0 = this.f17164q;
        z7Var.f17222n0.setValues(this.f17166s);
        z7Var.A0 = this.f17167t;
        z7Var.B0 = this.f17168u;
        String str4 = this.v;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.g6.f23247o2 == null) {
                org.telegram.ui.ActionBar.g6.O();
            }
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableString, org.telegram.ui.ActionBar.g6.f23247o2.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(charSequenceReplaceEmoji, this.f17169w, true, false, true, false);
            z7Var.C0 = MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, this.f17169w, org.telegram.ui.ActionBar.g6.f23247o2.getFontMetricsInt());
        } else {
            z7Var.C0 = "";
        }
        ArrayList arrayList = z7Var.F0;
        arrayList.clear();
        arrayList.addAll(this.f17170x);
        String str5 = this.f17171y;
        if (str5 != null) {
            z7Var.P0 = new File(str5);
        }
        String str6 = this.f17172z;
        if (str6 != null) {
            z7Var.R0 = new File(str6);
        }
        z7Var.S0 = this.A;
        z7Var.T0 = this.B;
        z7Var.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            z7Var.Z0 = new File(str7);
        }
        z7Var.f17195a1 = this.E;
        z7Var.I0 = this.F;
        z7Var.f17209g = this.G;
        z7Var.f17207f = this.H;
        z7Var.f17204e = this.I;
        z7Var.J = this.L;
        z7Var.I = this.K;
        z7Var.H = this.J;
        z7Var.f17238w = this.M;
        z7Var.f17240x = this.N;
        z7Var.f17242y = this.O;
        z7Var.f17244z = this.P;
        z7Var.A = this.Q;
        z7Var.B = this.R;
        z7Var.C = this.S;
        z7Var.D = this.T;
        z7Var.E = this.U;
        z7Var.F = this.V;
        z7Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            z7Var.f17224o0 = new File(str8);
        }
        z7Var.f17226p0 = this.Y;
        z7Var.f17228q0 = this.Z;
        z7Var.f17230r0 = this.f17140a0;
        z7Var.f17232s0 = this.f17142b0;
        z7Var.f17234t0 = this.f17144c0;
        z7Var.f17236u0 = this.f17145d0;
        z7Var.P = this.f17147e0;
        z7Var.f17237v0 = this.f17149f0;
        z7Var.J0 = this.f17151g0;
        z7Var.K0 = this.f17152h0;
        z7Var.L0 = this.f17154i0;
        z7Var.S = this.f17156j0;
        z7Var.T = VideoEditedInfo.Part.toStoryEntries(this.f17158k0);
        return z7Var;
    }

    public final void b(NativeByteBuffer nativeByteBuffer) {
        ArrayList arrayList;
        nativeByteBuffer.writeInt32(-1318387531);
        nativeByteBuffer.writeInt64(this.f17141b);
        nativeByteBuffer.writeString(this.f17143c);
        nativeByteBuffer.writeBool(this.f17146e);
        nativeByteBuffer.writeString(this.f17148f);
        nativeByteBuffer.writeBool(this.f17150g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.f17153i);
        nativeByteBuffer.writeInt64(this.f17155j);
        nativeByteBuffer.writeInt32(this.f17157k);
        nativeByteBuffer.writeInt32(this.f17159l);
        nativeByteBuffer.writeInt32(this.f17160m);
        nativeByteBuffer.writeInt32(this.f17161n);
        nativeByteBuffer.writeInt32(this.f17163p);
        nativeByteBuffer.writeInt32(this.f17164q);
        nativeByteBuffer.writeInt64(this.f17165r);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f17166s;
            if (i11 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i11]);
            i11++;
        }
        nativeByteBuffer.writeInt32(this.f17167t);
        nativeByteBuffer.writeInt32(this.f17168u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList2 = this.f17169w;
        nativeByteBuffer.writeInt32(arrayList2 == null ? 0 : arrayList2.size());
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                ((TLRPC.MessageEntity) arrayList2.get(i12)).serializeToStream(nativeByteBuffer);
            }
        }
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList3 = this.f17170x;
        nativeByteBuffer.writeInt32(arrayList3 == null ? 0 : arrayList3.size());
        if (arrayList3 != null) {
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                ((TLRPC.InputPrivacyRule) arrayList3.get(i13)).serializeToStream(nativeByteBuffer);
            }
        }
        nativeByteBuffer.writeBool(false);
        nativeByteBuffer.writeString(this.f17171y);
        nativeByteBuffer.writeInt64(this.A);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList4 = this.B;
        nativeByteBuffer.writeInt32(arrayList4 == null ? 0 : arrayList4.size());
        if (arrayList4 != null) {
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                ((VideoEditedInfo.MediaEntity) arrayList4.get(i14)).serializeTo(nativeByteBuffer, true);
            }
        }
        nativeByteBuffer.writeInt32(481674261);
        List list = this.C;
        nativeByteBuffer.writeInt32(list == null ? 0 : list.size());
        if (list != null) {
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((TLRPC.InputDocument) list.get(i15)).serializeToStream(nativeByteBuffer);
            }
        }
        String str = this.D;
        if (str == null) {
            str = "";
        }
        nativeByteBuffer.writeString(str);
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
        nativeByteBuffer.writeString(this.f17172z);
        nativeByteBuffer.writeBool(this.M);
        TLRPC.TL_error tL_error = this.N;
        if (tL_error == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            tL_error.serializeToStream(nativeByteBuffer);
        }
        nativeByteBuffer.writeString(this.d);
        String str2 = this.O;
        if (str2 == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            nativeByteBuffer.writeInt32(-1739392570);
            nativeByteBuffer.writeString(str2);
            String str3 = this.Q;
            if (str3 == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-1222740358);
                nativeByteBuffer.writeString(str3);
            }
            String str4 = this.R;
            if (str4 == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-1222740358);
                nativeByteBuffer.writeString(str4);
            }
            nativeByteBuffer.writeInt64(this.S);
            nativeByteBuffer.writeInt64(this.T);
            nativeByteBuffer.writeFloat(this.U);
            nativeByteBuffer.writeFloat(this.V);
            nativeByteBuffer.writeFloat(this.W);
        }
        TLRPC.InputPeer inputPeer = this.f17149f0;
        if (inputPeer != null) {
            inputPeer.serializeToStream(nativeByteBuffer);
        } else {
            new TLRPC.TL_inputPeerSelf().serializeToStream(nativeByteBuffer);
        }
        String str5 = this.X;
        if (TextUtils.isEmpty(str5)) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            nativeByteBuffer.writeInt32(1137015880);
            nativeByteBuffer.writeString(str5);
            nativeByteBuffer.writeInt64(this.Z);
            nativeByteBuffer.writeInt64(this.f17140a0);
            nativeByteBuffer.writeFloat(this.f17142b0);
            nativeByteBuffer.writeFloat(this.f17144c0);
            nativeByteBuffer.writeFloat(this.f17145d0);
        }
        nativeByteBuffer.writeFloat(this.f17147e0);
        nativeByteBuffer.writeInt64(this.f17151g0);
        String str6 = this.f17152h0;
        nativeByteBuffer.writeString(str6 != null ? str6 : "");
        TLRPC.InputMedia inputMedia = this.f17154i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        u uVar = this.f17156j0;
        if (uVar == null || uVar.f16885e.size() <= 1 || (arrayList = this.f17158k0) == null || arrayList.size() <= 1) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(uVar.f16882a);
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((VideoEditedInfo.Part) obj).serializeToStream(nativeByteBuffer);
            }
        }
        MediaController.CropState cropState = this.f17162o;
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
        int int32;
        this.f17166s = new float[9];
        this.f17170x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.f17145d0 = 1.0f;
        this.f17147e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.f17141b = nativeByteBuffer.readInt64(true);
            String string = nativeByteBuffer.readString(true);
            this.f17143c = string;
            if (string != null && string.length() == 0) {
                this.f17143c = null;
            }
            this.f17146e = nativeByteBuffer.readBool(true);
            String string2 = nativeByteBuffer.readString(true);
            this.f17148f = string2;
            if (string2 != null && string2.length() == 0) {
                this.f17148f = null;
            }
            this.f17150g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.f17153i = nativeByteBuffer.readInt64(true);
            this.f17155j = nativeByteBuffer.readInt64(true);
            this.f17157k = nativeByteBuffer.readInt32(true);
            this.f17159l = nativeByteBuffer.readInt32(true);
            this.f17160m = nativeByteBuffer.readInt32(true);
            this.f17161n = nativeByteBuffer.readInt32(true);
            this.f17163p = nativeByteBuffer.readInt32(true);
            this.f17164q = nativeByteBuffer.readInt32(true);
            this.f17165r = nativeByteBuffer.readInt64(true);
            int i10 = 0;
            while (true) {
                float[] fArr = this.f17166s;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = nativeByteBuffer.readFloat(true);
                i10++;
            }
            this.f17167t = nativeByteBuffer.readInt32(true);
            this.f17168u = nativeByteBuffer.readInt32(true);
            String string3 = nativeByteBuffer.readString(true);
            this.v = string3;
            if (string3 != null && string3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int int33 = nativeByteBuffer.readInt32(true);
                for (int i11 = 0; i11 < int33; i11++) {
                    if (this.f17169w == null) {
                        this.f17169w = new ArrayList();
                    }
                    this.f17169w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int int34 = nativeByteBuffer.readInt32(true);
                    this.f17170x.clear();
                    for (int i12 = 0; i12 < int34; i12++) {
                        this.f17170x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String string4 = nativeByteBuffer.readString(true);
                    this.f17171y = string4;
                    if (string4 != null && string4.length() == 0) {
                        this.f17171y = null;
                    }
                    this.A = nativeByteBuffer.readInt64(true);
                    if (nativeByteBuffer.readInt32(true) == 481674261) {
                        int int35 = nativeByteBuffer.readInt32(true);
                        for (int i13 = 0; i13 < int35; i13++) {
                            if (this.B == null) {
                                this.B = new ArrayList();
                            }
                            this.B.add(new VideoEditedInfo.MediaEntity(nativeByteBuffer, true, true));
                        }
                        if (nativeByteBuffer.readInt32(true) == 481674261) {
                            int int36 = nativeByteBuffer.readInt32(true);
                            for (int i14 = 0; i14 < int36; i14++) {
                                if (this.C == null) {
                                    this.C = new ArrayList();
                                }
                                this.C.add(TLRPC.InputDocument.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                            }
                            String string5 = nativeByteBuffer.readString(true);
                            this.D = string5;
                            if (string5 != null && string5.length() == 0) {
                                this.D = null;
                            }
                            int int37 = nativeByteBuffer.readInt32(true);
                            if (int37 == 1450380236) {
                                this.E = null;
                            } else if (int37 == -1318387530) {
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
                                String string6 = nativeByteBuffer.readString(true);
                                this.f17172z = string6;
                                if (string6 != null && string6.length() == 0) {
                                    this.f17172z = null;
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.M = nativeByteBuffer.readBool(true);
                                int int38 = nativeByteBuffer.readInt32(true);
                                if (int38 == 1450380236) {
                                    this.N = null;
                                } else {
                                    this.N = TLRPC.TL_error.TLdeserialize(nativeByteBuffer, int38, true);
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
                                this.f17149f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.f17140a0 = nativeByteBuffer.readInt64(true);
                                this.f17142b0 = nativeByteBuffer.readFloat(true);
                                this.f17144c0 = nativeByteBuffer.readFloat(true);
                                this.f17145d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f17147e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f17151g0 = nativeByteBuffer.readInt64(true);
                                this.f17152h0 = nativeByteBuffer.readString(true);
                                int int39 = nativeByteBuffer.readInt32(true);
                                if (int39 != 1450380236) {
                                    this.f17154i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, int39, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.f17156j0 = new u(nativeByteBuffer.readString(true));
                                this.f17158k0 = new ArrayList();
                                for (int i15 = 0; i15 < this.f17156j0.f16885e.size(); i15++) {
                                    VideoEditedInfo.Part part = new VideoEditedInfo.Part();
                                    part.readParams(nativeByteBuffer, true);
                                    part.part = (t) this.f17156j0.f16885e.get(i15);
                                    this.f17158k0.add(part);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                MediaController.CropState cropState = new MediaController.CropState();
                                this.f17162o = cropState;
                                cropState.readParams(nativeByteBuffer, true);
                            }
                            if (nativeByteBuffer.remaining() <= 0 || (int32 = nativeByteBuffer.readInt32(true)) != 448771445) {
                                return;
                            }
                            this.P = TLRPC.InputDocument.TLdeserialize(nativeByteBuffer, int32, true);
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
