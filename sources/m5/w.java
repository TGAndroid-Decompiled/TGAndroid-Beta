package m5;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import h7.q8;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public final class w implements Parcelable.Creator {

    public final int f17861a;

    public w(int i10) {
        this.f17861a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        float fR = 0.0f;
        double dQ = 0.0d;
        long jW = 0;
        boolean zN = false;
        int iU = 0;
        int iU2 = 0;
        int iU3 = 0;
        int iU4 = 0;
        String strH = null;
        String strH2 = null;
        jSONObject = null;
        JSONObject jSONObject4 = null;
        String strH3 = null;
        String strH4 = null;
        ArrayList arrayListL = null;
        String strH5 = null;
        x xVar = null;
        switch (this.f17861a) {
            case 0:
                int iZ = q8.z(parcel);
                long jW2 = 0;
                long jW3 = 0;
                String strH6 = null;
                String strH7 = null;
                String strH8 = null;
                String strH9 = null;
                String strH10 = null;
                String strH11 = null;
                String strH12 = null;
                String strH13 = null;
                String strH14 = null;
                u uVar = null;
                while (parcel.dataPosition() < iZ) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 2:
                            strH6 = q8.h(parcel, i10);
                            break;
                        case 3:
                            strH7 = q8.h(parcel, i10);
                            break;
                        case 4:
                            jW2 = q8.w(parcel, i10);
                            break;
                        case 5:
                            strH8 = q8.h(parcel, i10);
                            break;
                        case 6:
                            strH9 = q8.h(parcel, i10);
                            break;
                        case 7:
                            strH10 = q8.h(parcel, i10);
                            break;
                        case '\b':
                            strH11 = q8.h(parcel, i10);
                            break;
                        case '\t':
                            strH12 = q8.h(parcel, i10);
                            break;
                        case '\n':
                            strH13 = q8.h(parcel, i10);
                            break;
                        case 11:
                            jW3 = q8.w(parcel, i10);
                            break;
                        case '\f':
                            strH14 = q8.h(parcel, i10);
                            break;
                        case '\r':
                            uVar = (u) q8.g(parcel, i10, u.CREATOR);
                            break;
                        default:
                            q8.y(parcel, i10);
                            break;
                    }
                }
                q8.m(parcel, iZ);
                return new a(strH6, strH7, jW2, strH8, strH9, strH10, strH11, strH12, strH13, jW3, strH14, uVar);
            case 1:
                int iZ2 = q8.z(parcel);
                String strH15 = null;
                while (parcel.dataPosition() < iZ2) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 1) {
                        strH = q8.h(parcel, i11);
                    } else if (c10 != 2) {
                        q8.y(parcel, i11);
                    } else {
                        strH15 = q8.h(parcel, i11);
                    }
                }
                q8.m(parcel, iZ2);
                return new h(strH, strH15);
            case 2:
                int iZ3 = q8.z(parcel);
                float fR2 = 0.0f;
                float fR3 = 0.0f;
                while (parcel.dataPosition() < iZ3) {
                    int i12 = parcel.readInt();
                    char c11 = (char) i12;
                    if (c11 == 2) {
                        fR = q8.r(parcel, i12);
                    } else if (c11 == 3) {
                        fR2 = q8.r(parcel, i12);
                    } else if (c11 != 4) {
                        q8.y(parcel, i12);
                    } else {
                        fR3 = q8.r(parcel, i12);
                    }
                }
                q8.m(parcel, iZ3);
                return new x(fR, fR2, fR3);
            case 3:
                int iZ4 = q8.z(parcel);
                x xVar2 = null;
                while (parcel.dataPosition() < iZ4) {
                    int i13 = parcel.readInt();
                    char c12 = (char) i13;
                    if (c12 == 2) {
                        xVar = (x) q8.g(parcel, i13, x.CREATOR);
                    } else if (c12 != 3) {
                        q8.y(parcel, i13);
                    } else {
                        xVar2 = (x) q8.g(parcel, i13, x.CREATOR);
                    }
                }
                q8.m(parcel, iZ4);
                return new y(xVar, xVar2);
            case 4:
                int iZ5 = q8.z(parcel);
                long jW4 = 0;
                long jW5 = 0;
                String strH16 = null;
                String[] strArrI = null;
                boolean zN2 = false;
                boolean zN3 = false;
                boolean zN4 = false;
                while (parcel.dataPosition() < iZ5) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 2:
                            jW4 = q8.w(parcel, i14);
                            break;
                        case 3:
                            strH16 = q8.h(parcel, i14);
                            break;
                        case 4:
                            jW5 = q8.w(parcel, i14);
                            break;
                        case 5:
                            zN2 = q8.n(parcel, i14);
                            break;
                        case 6:
                            strArrI = q8.i(parcel, i14);
                            break;
                        case 7:
                            zN3 = q8.n(parcel, i14);
                            break;
                        case '\b':
                            zN4 = q8.n(parcel, i14);
                            break;
                        default:
                            q8.y(parcel, i14);
                            break;
                    }
                }
                q8.m(parcel, iZ5);
                return new b(jW4, strH16, jW5, zN2, strArrI, zN3, zN4);
            case 5:
                int iZ6 = q8.z(parcel);
                h hVar = null;
                boolean zN5 = false;
                while (parcel.dataPosition() < iZ6) {
                    int i15 = parcel.readInt();
                    char c13 = (char) i15;
                    if (c13 == 2) {
                        zN = q8.n(parcel, i15);
                    } else if (c13 == 3) {
                        strH5 = q8.h(parcel, i15);
                    } else if (c13 == 4) {
                        zN5 = q8.n(parcel, i15);
                    } else if (c13 != 5) {
                        q8.y(parcel, i15);
                    } else {
                        hVar = (h) q8.g(parcel, i15, h.CREATOR);
                    }
                }
                q8.m(parcel, iZ6);
                return new i(zN, strH5, zN5, hVar);
            case 6:
                int iZ7 = q8.z(parcel);
                long jW6 = 0;
                String strH17 = null;
                String strH18 = null;
                Integer numV = null;
                String strH19 = null;
                while (parcel.dataPosition() < iZ7) {
                    int i16 = parcel.readInt();
                    char c14 = (char) i16;
                    if (c14 == 2) {
                        strH18 = q8.h(parcel, i16);
                    } else if (c14 == 3) {
                        jW6 = q8.w(parcel, i16);
                    } else if (c14 == 4) {
                        numV = q8.v(parcel, i16);
                    } else if (c14 == 5) {
                        strH19 = q8.h(parcel, i16);
                    } else if (c14 != 6) {
                        q8.y(parcel, i16);
                    } else {
                        strH17 = q8.h(parcel, i16);
                    }
                }
                q8.m(parcel, iZ7);
                Pattern pattern = r5.a.f46766a;
                if (strH17 == null) {
                    jSONObject = null;
                } else {
                    try {
                        jSONObject = new JSONObject(strH17);
                    } catch (JSONException unused) {
                        jSONObject = null;
                    }
                }
                return new MediaError(strH18, jW6, numV, strH19, jSONObject);
            case 7:
                int iZ8 = q8.z(parcel);
                long jW7 = 0;
                long jW8 = 0;
                String strH20 = null;
                String strH21 = null;
                l lVar = null;
                ArrayList arrayListL2 = null;
                t tVar = null;
                String strH22 = null;
                ArrayList arrayListL3 = null;
                ArrayList arrayListL4 = null;
                String strH23 = null;
                u uVar2 = null;
                String strH24 = null;
                String strH25 = null;
                String strH26 = null;
                String strH27 = null;
                int iU5 = 0;
                while (parcel.dataPosition() < iZ8) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 2:
                            strH20 = q8.h(parcel, i17);
                            break;
                        case 3:
                            iU5 = q8.u(parcel, i17);
                            break;
                        case 4:
                            strH21 = q8.h(parcel, i17);
                            break;
                        case 5:
                            lVar = (l) q8.g(parcel, i17, l.CREATOR);
                            break;
                        case 6:
                            jW7 = q8.w(parcel, i17);
                            break;
                        case 7:
                            arrayListL2 = q8.l(parcel, i17, MediaTrack.CREATOR);
                            break;
                        case '\b':
                            tVar = (t) q8.g(parcel, i17, t.CREATOR);
                            break;
                        case '\t':
                            strH22 = q8.h(parcel, i17);
                            break;
                        case '\n':
                            arrayListL3 = q8.l(parcel, i17, b.CREATOR);
                            break;
                        case 11:
                            arrayListL4 = q8.l(parcel, i17, a.CREATOR);
                            break;
                        case '\f':
                            strH23 = q8.h(parcel, i17);
                            break;
                        case '\r':
                            uVar2 = (u) q8.g(parcel, i17, u.CREATOR);
                            break;
                        case 14:
                            jW8 = q8.w(parcel, i17);
                            break;
                        case 15:
                            strH24 = q8.h(parcel, i17);
                            break;
                        case 16:
                            strH25 = q8.h(parcel, i17);
                            break;
                        case 17:
                            strH26 = q8.h(parcel, i17);
                            break;
                        case 18:
                            strH27 = q8.h(parcel, i17);
                            break;
                        default:
                            q8.y(parcel, i17);
                            break;
                    }
                }
                q8.m(parcel, iZ8);
                return new MediaInfo(strH20, iU5, strH21, lVar, jW7, arrayListL2, tVar, strH22, arrayListL3, arrayListL4, strH23, uVar2, jW8, strH24, strH25, strH26, strH27);
            case 8:
                int iZ9 = q8.z(parcel);
                long jW9 = 0;
                long jW10 = 0;
                boolean zN6 = false;
                boolean zN7 = false;
                while (parcel.dataPosition() < iZ9) {
                    int i18 = parcel.readInt();
                    char c15 = (char) i18;
                    if (c15 == 2) {
                        jW9 = q8.w(parcel, i18);
                    } else if (c15 == 3) {
                        jW10 = q8.w(parcel, i18);
                    } else if (c15 == 4) {
                        zN6 = q8.n(parcel, i18);
                    } else if (c15 != 5) {
                        q8.y(parcel, i18);
                    } else {
                        zN7 = q8.n(parcel, i18);
                    }
                }
                q8.m(parcel, iZ9);
                return new j(jW9, jW10, zN6, zN7);
            case 9:
                int iZ10 = q8.z(parcel);
                long jW11 = 0;
                long jW12 = 0;
                long jW13 = 0;
                String strH28 = null;
                String strH29 = null;
                while (parcel.dataPosition() < iZ10) {
                    int i19 = parcel.readInt();
                    char c16 = (char) i19;
                    if (c16 == 2) {
                        jW11 = q8.w(parcel, i19);
                    } else if (c16 == 3) {
                        jW12 = q8.w(parcel, i19);
                    } else if (c16 == 4) {
                        strH28 = q8.h(parcel, i19);
                    } else if (c16 == 5) {
                        strH29 = q8.h(parcel, i19);
                    } else if (c16 != 6) {
                        q8.y(parcel, i19);
                    } else {
                        jW13 = q8.w(parcel, i19);
                    }
                }
                q8.m(parcel, iZ10);
                return new c(jW11, jW12, strH28, strH29, jW13);
            case 10:
                int iZ11 = q8.z(parcel);
                double dQ2 = 0.0d;
                long jW14 = 0;
                long jW15 = 0;
                String strH30 = null;
                MediaInfo mediaInfo = null;
                n nVar = null;
                Boolean boolO = null;
                long[] jArrF = null;
                String strH31 = null;
                String strH32 = null;
                String strH33 = null;
                String strH34 = null;
                while (parcel.dataPosition() < iZ11) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 2:
                            mediaInfo = (MediaInfo) q8.g(parcel, i20, MediaInfo.CREATOR);
                            break;
                        case 3:
                            nVar = (n) q8.g(parcel, i20, n.CREATOR);
                            break;
                        case 4:
                            boolO = q8.o(parcel, i20);
                            break;
                        case 5:
                            jW14 = q8.w(parcel, i20);
                            break;
                        case 6:
                            dQ2 = q8.q(parcel, i20);
                            break;
                        case 7:
                            jArrF = q8.f(parcel, i20);
                            break;
                        case '\b':
                            strH30 = q8.h(parcel, i20);
                            break;
                        case '\t':
                            strH31 = q8.h(parcel, i20);
                            break;
                        case '\n':
                            strH32 = q8.h(parcel, i20);
                            break;
                        case 11:
                            strH33 = q8.h(parcel, i20);
                            break;
                        case '\f':
                            strH34 = q8.h(parcel, i20);
                            break;
                        case '\r':
                            jW15 = q8.w(parcel, i20);
                            break;
                        default:
                            q8.y(parcel, i20);
                            break;
                    }
                }
                q8.m(parcel, iZ11);
                Pattern pattern2 = r5.a.f46766a;
                if (strH30 == null) {
                    jSONObject2 = null;
                } else {
                    try {
                        jSONObject2 = new JSONObject(strH30);
                    } catch (JSONException unused2) {
                        jSONObject2 = null;
                    }
                }
                return new k(mediaInfo, nVar, boolO, jW14, dQ2, jArrF, jSONObject2, strH31, strH32, strH33, strH34, jW15);
            case 11:
                int iZ12 = q8.z(parcel);
                Bundle bundleA = null;
                while (parcel.dataPosition() < iZ12) {
                    int i21 = parcel.readInt();
                    char c17 = (char) i21;
                    if (c17 == 2) {
                        arrayListL = q8.l(parcel, i21, x5.a.CREATOR);
                    } else if (c17 == 3) {
                        bundleA = q8.a(parcel, i21);
                    } else if (c17 != 4) {
                        q8.y(parcel, i21);
                    } else {
                        iU4 = q8.u(parcel, i21);
                    }
                }
                q8.m(parcel, iZ12);
                return new l(arrayListL, bundleA, iU4);
            case 12:
                int iZ13 = q8.z(parcel);
                ArrayList arrayListL5 = null;
                ArrayList arrayListL6 = null;
                while (parcel.dataPosition() < iZ13) {
                    int i22 = parcel.readInt();
                    char c18 = (char) i22;
                    if (c18 == 2) {
                        iU3 = q8.u(parcel, i22);
                    } else if (c18 == 3) {
                        strH4 = q8.h(parcel, i22);
                    } else if (c18 == 4) {
                        arrayListL5 = q8.l(parcel, i22, l.CREATOR);
                    } else if (c18 == 5) {
                        arrayListL6 = q8.l(parcel, i22, x5.a.CREATOR);
                    } else if (c18 != 6) {
                        q8.y(parcel, i22);
                    } else {
                        dQ = q8.q(parcel, i22);
                    }
                }
                q8.m(parcel, iZ13);
                m mVar = new m();
                mVar.f17810a = iU3;
                mVar.f17811b = strH4;
                mVar.f17812c = arrayListL5;
                mVar.d = arrayListL6;
                mVar.f17813e = dQ;
                return mVar;
            case 13:
                int iZ14 = q8.z(parcel);
                String strH35 = null;
                String strH36 = null;
                m mVar2 = null;
                ArrayList arrayListL7 = null;
                int iU6 = 0;
                int iU7 = 0;
                boolean zN8 = false;
                while (parcel.dataPosition() < iZ14) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 2:
                            strH3 = q8.h(parcel, i23);
                            break;
                        case 3:
                            strH35 = q8.h(parcel, i23);
                            break;
                        case 4:
                            iU2 = q8.u(parcel, i23);
                            break;
                        case 5:
                            strH36 = q8.h(parcel, i23);
                            break;
                        case 6:
                            mVar2 = (m) q8.g(parcel, i23, m.CREATOR);
                            break;
                        case 7:
                            iU6 = q8.u(parcel, i23);
                            break;
                        case '\b':
                            arrayListL7 = q8.l(parcel, i23, p.CREATOR);
                            break;
                        case '\t':
                            iU7 = q8.u(parcel, i23);
                            break;
                        case '\n':
                            jW = q8.w(parcel, i23);
                            break;
                        case 11:
                            zN8 = q8.n(parcel, i23);
                            break;
                        default:
                            q8.y(parcel, i23);
                            break;
                    }
                }
                q8.m(parcel, iZ14);
                n nVar2 = new n();
                nVar2.f17814a = strH3;
                nVar2.f17815b = strH35;
                nVar2.f17816c = iU2;
                nVar2.d = strH36;
                nVar2.f17817e = mVar2;
                nVar2.f17818f = iU6;
                nVar2.h = arrayListL7;
                nVar2.f17819n = iU7;
                nVar2.f17820r = jW;
                nVar2.f17821s = zN8;
                return nVar2;
            case 14:
                int iZ15 = q8.z(parcel);
                double dQ3 = 0.0d;
                double dQ4 = 0.0d;
                double dQ5 = 0.0d;
                MediaInfo mediaInfo2 = null;
                long[] jArrF2 = null;
                String strH37 = null;
                int iU8 = 0;
                boolean zN9 = false;
                while (parcel.dataPosition() < iZ15) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 2:
                            mediaInfo2 = (MediaInfo) q8.g(parcel, i24, MediaInfo.CREATOR);
                            break;
                        case 3:
                            iU8 = q8.u(parcel, i24);
                            break;
                        case 4:
                            zN9 = q8.n(parcel, i24);
                            break;
                        case 5:
                            dQ3 = q8.q(parcel, i24);
                            break;
                        case 6:
                            dQ4 = q8.q(parcel, i24);
                            break;
                        case 7:
                            dQ5 = q8.q(parcel, i24);
                            break;
                        case '\b':
                            jArrF2 = q8.f(parcel, i24);
                            break;
                        case '\t':
                            strH37 = q8.h(parcel, i24);
                            break;
                        default:
                            q8.y(parcel, i24);
                            break;
                    }
                }
                q8.m(parcel, iZ15);
                return new p(mediaInfo2, iU8, zN9, dQ3, dQ4, dQ5, jArrF2, strH37);
            case 15:
                int iZ16 = q8.z(parcel);
                double dQ6 = 0.0d;
                double dQ7 = 0.0d;
                long jW16 = 0;
                long jW17 = 0;
                long jW18 = 0;
                MediaInfo mediaInfo3 = null;
                long[] jArrF3 = null;
                String strH38 = null;
                ArrayList arrayListL8 = null;
                c cVar = null;
                v vVar = null;
                j jVar = null;
                n nVar3 = null;
                int iU9 = 0;
                int iU10 = 0;
                int iU11 = 0;
                boolean zN10 = false;
                int iU12 = 0;
                int iU13 = 0;
                int iU14 = 0;
                boolean zN11 = false;
                while (parcel.dataPosition() < iZ16) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 2:
                            mediaInfo3 = (MediaInfo) q8.g(parcel, i25, MediaInfo.CREATOR);
                            break;
                        case 3:
                            jW16 = q8.w(parcel, i25);
                            break;
                        case 4:
                            iU9 = q8.u(parcel, i25);
                            break;
                        case 5:
                            dQ6 = q8.q(parcel, i25);
                            break;
                        case 6:
                            iU10 = q8.u(parcel, i25);
                            break;
                        case 7:
                            iU11 = q8.u(parcel, i25);
                            break;
                        case '\b':
                            jW17 = q8.w(parcel, i25);
                            break;
                        case '\t':
                            jW18 = q8.w(parcel, i25);
                            break;
                        case '\n':
                            dQ7 = q8.q(parcel, i25);
                            break;
                        case 11:
                            zN10 = q8.n(parcel, i25);
                            break;
                        case '\f':
                            jArrF3 = q8.f(parcel, i25);
                            break;
                        case '\r':
                            iU12 = q8.u(parcel, i25);
                            break;
                        case 14:
                            iU13 = q8.u(parcel, i25);
                            break;
                        case 15:
                            strH38 = q8.h(parcel, i25);
                            break;
                        case 16:
                            iU14 = q8.u(parcel, i25);
                            break;
                        case 17:
                            arrayListL8 = q8.l(parcel, i25, p.CREATOR);
                            break;
                        case 18:
                            zN11 = q8.n(parcel, i25);
                            break;
                        case 19:
                            cVar = (c) q8.g(parcel, i25, c.CREATOR);
                            break;
                        case 20:
                            vVar = (v) q8.g(parcel, i25, v.CREATOR);
                            break;
                        case 21:
                            jVar = (j) q8.g(parcel, i25, j.CREATOR);
                            break;
                        case 22:
                            nVar3 = (n) q8.g(parcel, i25, n.CREATOR);
                            break;
                        default:
                            q8.y(parcel, i25);
                            break;
                    }
                }
                q8.m(parcel, iZ16);
                return new r(mediaInfo3, jW16, iU9, dQ6, iU10, iU11, jW17, jW18, dQ7, zN10, jArrF3, iU12, iU13, strH38, iU14, arrayListL8, zN11, cVar, vVar, jVar, nVar3);
            case 16:
                int iZ17 = q8.z(parcel);
                long jW19 = 0;
                String strH39 = null;
                String strH40 = null;
                String strH41 = null;
                String strH42 = null;
                String strH43 = null;
                ArrayList arrayListJ = null;
                int iU15 = 0;
                int iU16 = 0;
                while (parcel.dataPosition() < iZ17) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 2:
                            jW19 = q8.w(parcel, i26);
                            break;
                        case 3:
                            iU15 = q8.u(parcel, i26);
                            break;
                        case 4:
                            strH40 = q8.h(parcel, i26);
                            break;
                        case 5:
                            strH41 = q8.h(parcel, i26);
                            break;
                        case 6:
                            strH42 = q8.h(parcel, i26);
                            break;
                        case 7:
                            strH43 = q8.h(parcel, i26);
                            break;
                        case '\b':
                            iU16 = q8.u(parcel, i26);
                            break;
                        case '\t':
                            arrayListJ = q8.j(parcel, i26);
                            break;
                        case '\n':
                            strH39 = q8.h(parcel, i26);
                            break;
                        default:
                            q8.y(parcel, i26);
                            break;
                    }
                }
                q8.m(parcel, iZ17);
                Pattern pattern3 = r5.a.f46766a;
                if (strH39 == null) {
                    jSONObject3 = null;
                } else {
                    try {
                        jSONObject3 = new JSONObject(strH39);
                    } catch (JSONException unused3) {
                        jSONObject3 = null;
                    }
                }
                return new MediaTrack(jW19, iU15, strH40, strH41, strH42, strH43, iU16, arrayListJ, jSONObject3);
            case 17:
                int iZ18 = q8.z(parcel);
                String strH44 = null;
                String strH45 = null;
                ArrayList arrayListJ2 = null;
                String strH46 = null;
                Uri uri = null;
                String strH47 = null;
                String strH48 = null;
                Boolean boolO2 = null;
                Boolean boolO3 = null;
                while (parcel.dataPosition() < iZ18) {
                    int i27 = parcel.readInt();
                    switch ((char) i27) {
                        case 2:
                            strH44 = q8.h(parcel, i27);
                            break;
                        case 3:
                            strH45 = q8.h(parcel, i27);
                            break;
                        case 4:
                            q8.l(parcel, i27, x5.a.CREATOR);
                            break;
                        case 5:
                            arrayListJ2 = q8.j(parcel, i27);
                            break;
                        case 6:
                            strH46 = q8.h(parcel, i27);
                            break;
                        case 7:
                            uri = (Uri) q8.g(parcel, i27, Uri.CREATOR);
                            break;
                        case '\b':
                            strH47 = q8.h(parcel, i27);
                            break;
                        case '\t':
                            strH48 = q8.h(parcel, i27);
                            break;
                        case '\n':
                            boolO2 = q8.o(parcel, i27);
                            break;
                        case 11:
                            boolO3 = q8.o(parcel, i27);
                            break;
                        default:
                            q8.y(parcel, i27);
                            break;
                    }
                }
                q8.m(parcel, iZ18);
                return new d(strH44, strH45, arrayListJ2, strH46, uri, strH47, strH48, boolO2, boolO3);
            case 18:
                int iZ19 = q8.z(parcel);
                k kVar = null;
                String strH49 = null;
                while (parcel.dataPosition() < iZ19) {
                    int i28 = parcel.readInt();
                    char c19 = (char) i28;
                    if (c19 == 2) {
                        kVar = (k) q8.g(parcel, i28, k.CREATOR);
                    } else if (c19 != 3) {
                        q8.y(parcel, i28);
                    } else {
                        strH49 = q8.h(parcel, i28);
                    }
                }
                q8.m(parcel, iZ19);
                Pattern pattern4 = r5.a.f46766a;
                if (strH49 != null) {
                    try {
                        jSONObject4 = new JSONObject(strH49);
                    } catch (JSONException unused4) {
                    }
                }
                return new s(kVar, jSONObject4);
            case 19:
                int iZ20 = q8.z(parcel);
                String strH50 = null;
                String strH51 = null;
                float fR4 = 0.0f;
                int iU17 = 0;
                int iU18 = 0;
                int iU19 = 0;
                int iU20 = 0;
                int iU21 = 0;
                int iU22 = 0;
                int iU23 = 0;
                int iU24 = 0;
                int iU25 = 0;
                while (parcel.dataPosition() < iZ20) {
                    int i29 = parcel.readInt();
                    switch ((char) i29) {
                        case 2:
                            fR4 = q8.r(parcel, i29);
                            break;
                        case 3:
                            iU17 = q8.u(parcel, i29);
                            break;
                        case 4:
                            iU18 = q8.u(parcel, i29);
                            break;
                        case 5:
                            iU19 = q8.u(parcel, i29);
                            break;
                        case 6:
                            iU20 = q8.u(parcel, i29);
                            break;
                        case 7:
                            iU21 = q8.u(parcel, i29);
                            break;
                        case '\b':
                            iU22 = q8.u(parcel, i29);
                            break;
                        case '\t':
                            iU23 = q8.u(parcel, i29);
                            break;
                        case '\n':
                            strH50 = q8.h(parcel, i29);
                            break;
                        case 11:
                            iU24 = q8.u(parcel, i29);
                            break;
                        case '\f':
                            iU25 = q8.u(parcel, i29);
                            break;
                        case '\r':
                            strH51 = q8.h(parcel, i29);
                            break;
                        default:
                            q8.y(parcel, i29);
                            break;
                    }
                }
                q8.m(parcel, iZ20);
                return new t(fR4, iU17, iU18, iU19, iU20, iU21, iU22, iU23, strH50, iU24, iU25, strH51);
            case 20:
                int iZ21 = q8.z(parcel);
                String strH52 = null;
                while (parcel.dataPosition() < iZ21) {
                    int i30 = parcel.readInt();
                    char c20 = (char) i30;
                    if (c20 == 2) {
                        strH2 = q8.h(parcel, i30);
                    } else if (c20 != 3) {
                        q8.y(parcel, i30);
                    } else {
                        strH52 = q8.h(parcel, i30);
                    }
                }
                q8.m(parcel, iZ21);
                return new u(strH2, strH52);
            case 21:
                int iZ22 = q8.z(parcel);
                int iU26 = 0;
                int iU27 = 0;
                while (parcel.dataPosition() < iZ22) {
                    int i31 = parcel.readInt();
                    char c21 = (char) i31;
                    if (c21 == 2) {
                        iU = q8.u(parcel, i31);
                    } else if (c21 == 3) {
                        iU26 = q8.u(parcel, i31);
                    } else if (c21 != 4) {
                        q8.y(parcel, i31);
                    } else {
                        iU27 = q8.u(parcel, i31);
                    }
                }
                q8.m(parcel, iZ22);
                return new v(iU, iU26, iU27);
            default:
                int iZ23 = q8.z(parcel);
                String strH53 = null;
                String strH54 = null;
                String strH55 = null;
                String strH56 = null;
                String strH57 = null;
                ArrayList arrayListL9 = null;
                String strH58 = null;
                String strH59 = null;
                String strH60 = null;
                byte[] bArrB = null;
                String strH61 = null;
                r5.y yVar = null;
                Integer numV2 = null;
                int iU28 = 0;
                int iU29 = 0;
                int iU30 = -1;
                int iU31 = 0;
                boolean zN12 = false;
                while (parcel.dataPosition() < iZ23) {
                    int i32 = parcel.readInt();
                    switch ((char) i32) {
                        case 2:
                            strH53 = q8.h(parcel, i32);
                            break;
                        case 3:
                            strH54 = q8.h(parcel, i32);
                            break;
                        case 4:
                            strH55 = q8.h(parcel, i32);
                            break;
                        case 5:
                            strH56 = q8.h(parcel, i32);
                            break;
                        case 6:
                            strH57 = q8.h(parcel, i32);
                            break;
                        case 7:
                            iU28 = q8.u(parcel, i32);
                            break;
                        case '\b':
                            arrayListL9 = q8.l(parcel, i32, x5.a.CREATOR);
                            break;
                        case '\t':
                            iU29 = q8.u(parcel, i32);
                            break;
                        case '\n':
                            iU30 = q8.u(parcel, i32);
                            break;
                        case 11:
                            strH58 = q8.h(parcel, i32);
                            break;
                        case '\f':
                            strH59 = q8.h(parcel, i32);
                            break;
                        case '\r':
                            iU31 = q8.u(parcel, i32);
                            break;
                        case 14:
                            strH60 = q8.h(parcel, i32);
                            break;
                        case 15:
                            bArrB = q8.b(parcel, i32);
                            break;
                        case 16:
                            strH61 = q8.h(parcel, i32);
                            break;
                        case 17:
                            zN12 = q8.n(parcel, i32);
                            break;
                        case 18:
                            yVar = (r5.y) q8.g(parcel, i32, r5.y.CREATOR);
                            break;
                        case 19:
                            numV2 = q8.v(parcel, i32);
                            break;
                        default:
                            q8.y(parcel, i32);
                            break;
                    }
                }
                q8.m(parcel, iZ23);
                return new CastDevice(strH53, strH54, strH55, strH56, strH57, iU28, arrayListL9, iU29, iU30, strH58, strH59, iU31, strH60, bArrB, strH61, zN12, yVar, numV2);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f17861a) {
            case 0:
                return new a[i10];
            case 1:
                return new h[i10];
            case 2:
                return new x[i10];
            case 3:
                return new y[i10];
            case 4:
                return new b[i10];
            case 5:
                return new i[i10];
            case 6:
                return new MediaError[i10];
            case 7:
                return new MediaInfo[i10];
            case 8:
                return new j[i10];
            case 9:
                return new c[i10];
            case 10:
                return new k[i10];
            case 11:
                return new l[i10];
            case 12:
                return new m[i10];
            case 13:
                return new n[i10];
            case 14:
                return new p[i10];
            case 15:
                return new r[i10];
            case 16:
                return new MediaTrack[i10];
            case 17:
                return new d[i10];
            case 18:
                return new s[i10];
            case 19:
                return new t[i10];
            case 20:
                return new u[i10];
            case 21:
                return new v[i10];
            default:
                return new CastDevice[i10];
        }
    }
}
