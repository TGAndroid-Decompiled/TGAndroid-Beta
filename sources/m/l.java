package m;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.net.Uri;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import ji.h5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.uf0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.xq0;
import org.telegram.ui.Components.z71;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.a5;
import org.telegram.ui.gu0;
import org.telegram.ui.ic0;
import org.telegram.ui.o9;
import org.telegram.ui.y9;
import org.telegram.ui.zs0;
public final class l implements l.i, l2.h, o0.a, z71, f5, lb0, mg.o, bh.h, y9, com.google.android.gms.common.api.internal.o, rg.x1, n5.b, w2.a, OnCompleteListener, xq0 {
    public Object f14889a;

    public l(Object obj) {
        this.f14889a = obj;
    }

    public static float[] B(ArrayList arrayList) {
        float f7;
        int i10;
        int i11;
        float f10;
        double d;
        double d10;
        double[] dArr;
        ArrayList arrayList2;
        float f11;
        float f12;
        int i12;
        float f13;
        int size = arrayList.size();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            f7 = 255.0f;
            if (i14 >= size) {
                break;
            }
            PointF pointF = (PointF) arrayList.get(i14);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
            i14++;
        }
        int size2 = arrayList.size();
        int i15 = 1;
        double d11 = 1.0d;
        if (size2 <= 0 || size2 == 1) {
            i10 = 0;
            i11 = 1;
            f10 = 255.0f;
            d = 1.0d;
            d10 = 6.0d;
            dArr = null;
        } else {
            char c10 = 2;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d12 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i16 = 1;
            while (true) {
                i12 = size2 - 1;
                if (i16 >= i12) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i16 - 1);
                PointF pointF3 = (PointF) arrayList.get(i16);
                int i17 = i16 + 1;
                double d13 = d11;
                PointF pointF4 = (PointF) arrayList.get(i17);
                double[] dArr5 = dArr2[i16];
                char c11 = c10;
                float f14 = pointF3.x;
                double d14 = d12;
                int i18 = i13;
                int i19 = i15;
                double d15 = f14 - pointF2.x;
                dArr5[i18] = d15 / 6.0d;
                float f15 = pointF4.x;
                float f16 = f7;
                dArr5[i19] = (f15 - f13) / 3.0d;
                double d16 = f15 - f14;
                dArr5[c11] = d16 / 6.0d;
                float f17 = pointF4.y;
                float f18 = pointF3.y;
                dArr3[i16] = ((f17 - f18) / d16) - ((f18 - pointF2.y) / d15);
                i16 = i17;
                c10 = c11;
                d11 = d13;
                d12 = d14;
                i13 = i18;
                i15 = i19;
                f7 = f16;
            }
            i10 = i13;
            i11 = i15;
            f10 = f7;
            d = d11;
            char c12 = c10;
            double d17 = d12;
            d10 = 6.0d;
            dArr3[i10] = d17;
            dArr3[i12] = d17;
            double[] dArr6 = dArr2[i12];
            dArr6[i11] = d;
            dArr6[i10] = d17;
            dArr6[c12] = d17;
            for (int i20 = i11; i20 < size2; i20++) {
                double[] dArr7 = dArr2[i20];
                double d18 = dArr7[i10];
                int i21 = i20 - 1;
                double[] dArr8 = dArr2[i21];
                double d19 = d18 / dArr8[i11];
                dArr7[i11] = dArr7[i11] - (dArr8[c12] * d19);
                dArr7[i10] = d17;
                dArr3[i20] = dArr3[i20] - (d19 * dArr3[i21]);
            }
            for (int i22 = size2 - 2; i22 >= 0; i22--) {
                double[] dArr9 = dArr2[i22];
                double d20 = dArr9[c12];
                int i23 = i22 + 1;
                double[] dArr10 = dArr2[i23];
                double d21 = d20 / dArr10[i11];
                dArr9[i11] = dArr9[i11] - (dArr10[i10] * d21);
                dArr9[c12] = d17;
                dArr3[i22] = dArr3[i22] - (d21 * dArr3[i23]);
            }
            dArr = new double[size2];
            for (int i24 = i10; i24 < size2; i24++) {
                dArr[i24] = dArr3[i24] / dArr2[i24][i11];
            }
        }
        int length = dArr.length;
        if (length < i11) {
            arrayList2 = null;
            f11 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i25 = i10;
            while (i25 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i25);
                int i26 = i25 + 1;
                PointF pointF6 = (PointF) arrayList.get(i26);
                int i27 = (int) pointF5.x;
                while (true) {
                    float f19 = pointF6.x;
                    if (i27 < ((int) f19)) {
                        float f20 = i27;
                        PointF pointF7 = pointF5;
                        double d22 = f19 - pointF5.x;
                        double d23 = (f20 - f12) / d22;
                        double d24 = d - d23;
                        int i28 = length;
                        double[] dArr11 = dArr;
                        float f21 = (float) (((((((d23 * d23) * d23) - d23) * dArr11[i26]) + ((((d24 * d24) * d24) - d24) * dArr11[i25])) * ((d22 * d22) / d10)) + (pointF6.y * d23) + (pointF7.y * d24));
                        if (f21 > f10) {
                            f21 = f10;
                        } else if (f21 < 0.0f) {
                            f21 = 0.0f;
                        }
                        arrayList2.add(new PointF(f20, f21));
                        i27++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i28;
                    }
                }
                i25 = i26;
            }
            f11 = 0.0f;
            arrayList2.add((PointF) i2.d.h(1, arrayList));
        }
        int i29 = i10;
        float f22 = ((PointF) arrayList2.get(i29)).x;
        if (f22 > f11) {
            for (int i30 = (int) f22; i30 >= 0; i30--) {
                arrayList2.add(i29, new PointF(i30, f11));
            }
        }
        float f23 = ((PointF) i2.d.h(1, arrayList2)).x;
        if (f23 < f10) {
            for (int i31 = ((int) f23) + 1; i31 <= 255; i31++) {
                arrayList2.add(new PointF(i31, f10));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        while (i29 < size3) {
            PointF pointF8 = (PointF) arrayList2.get(i29);
            float sqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                sqrt = -sqrt;
            }
            fArr[i29] = sqrt;
            i29++;
        }
        return fArr;
    }

    public static l D(float f7, int i10) {
        boolean z10;
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f7);
        int i12 = (int) (point.y * f7);
        if (i11 == i12) {
            return new l(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new l(i11, i12, i12, i11);
        }
        boolean z11 = true;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 >= i12) {
            z11 = false;
        }
        if (z10 == z11) {
            return new l(i11, i12, new int[0]);
        }
        return new l(i12, i11, new int[0]);
    }

    public static void E(String str, TreeMap treeMap) {
        String[] split = str.split(":", 2);
        if (split.length < 2) {
            return;
        }
        String trim = split[0].trim();
        String trim2 = split[1].trim();
        List list = (List) treeMap.get(trim);
        if (list == null) {
            list = new ArrayList();
            treeMap.put(trim, list);
        }
        list.add(trim2);
    }

    @Override
    public void A() {
        tf0 tf0Var = ((uf0) this.f14889a).f29366a;
        if (tf0Var != null) {
            ((zs0) tf0Var).f42417a.f31928e0.invalidate();
        }
    }

    public void C(int i10, long j10) {
        u3.f fVar = (u3.f) this.f14889a;
        if (i10 != 240) {
            if (i10 != 241) {
                if (i10 != 20529) {
                    if (i10 != 20530) {
                        boolean z10 = false;
                        switch (i10) {
                            case 131:
                                int i11 = (int) j10;
                                if (i11 != 1) {
                                    if (i11 != 2) {
                                        if (i11 != 17) {
                                            if (i11 != 33) {
                                                fVar.h(i10);
                                                fVar.f46186y.e = -1;
                                                return;
                                            }
                                            fVar.h(i10);
                                            fVar.f46186y.e = 5;
                                            return;
                                        }
                                        fVar.h(i10);
                                        fVar.f46186y.e = 3;
                                        return;
                                    }
                                    fVar.h(i10);
                                    fVar.f46186y.e = 1;
                                    return;
                                }
                                fVar.h(i10);
                                fVar.f46186y.e = 2;
                                return;
                            case 136:
                                fVar.h(i10);
                                u3.e eVar = fVar.f46186y;
                                if (j10 == 1) {
                                    z10 = true;
                                }
                                eVar.Y = z10;
                                return;
                            case 155:
                                fVar.Q = fVar.n(j10);
                                return;
                            case 159:
                                fVar.h(i10);
                                fVar.f46186y.Q = (int) j10;
                                return;
                            case 176:
                                fVar.h(i10);
                                fVar.f46186y.f46139n = (int) j10;
                                return;
                            case 179:
                                if (!fVar.f46187z) {
                                    fVar.g(i10);
                                    fVar.E = fVar.n(j10);
                                    return;
                                }
                                return;
                            case 186:
                                fVar.h(i10);
                                fVar.f46186y.f46140o = (int) j10;
                                return;
                            case 215:
                                fVar.h(i10);
                                fVar.f46186y.d = (int) j10;
                                return;
                            case 231:
                                fVar.M = fVar.n(j10);
                                return;
                            case 238:
                                fVar.X = (int) j10;
                                return;
                            case 247:
                                if (!fVar.f46187z) {
                                    fVar.g(i10);
                                    fVar.F = (int) j10;
                                    return;
                                }
                                return;
                            case 251:
                                fVar.Y = true;
                                return;
                            case 16871:
                                fVar.h(i10);
                                fVar.f46186y.h = (int) j10;
                                return;
                            case 16980:
                                if (j10 != 3) {
                                    throw b2.x0.a(null, "ContentCompAlgo " + j10 + " not supported");
                                }
                                return;
                            case 17029:
                                if (j10 < 1 || j10 > 2) {
                                    throw b2.x0.a(null, "DocTypeReadVersion " + j10 + " not supported");
                                }
                                return;
                            case 17143:
                                if (j10 != 1) {
                                    throw b2.x0.a(null, "EBMLReadVersion " + j10 + " not supported");
                                }
                                return;
                            case 18401:
                                if (j10 != 5) {
                                    throw b2.x0.a(null, "ContentEncAlgo " + j10 + " not supported");
                                }
                                return;
                            case 18408:
                                if (j10 != 1) {
                                    throw b2.x0.a(null, "AESSettingsCipherMode " + j10 + " not supported");
                                }
                                return;
                            case 21420:
                                fVar.B = j10 + fVar.f46181s;
                                return;
                            case 21432:
                                int i12 = (int) j10;
                                fVar.h(i10);
                                if (i12 != 0) {
                                    if (i12 != 1) {
                                        if (i12 != 3) {
                                            if (i12 == 15) {
                                                fVar.f46186y.f46149y = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f46186y.f46149y = 1;
                                        return;
                                    }
                                    fVar.f46186y.f46149y = 2;
                                    return;
                                }
                                fVar.f46186y.f46149y = 0;
                                return;
                            case 21680:
                                fVar.h(i10);
                                fVar.f46186y.f46142q = (int) j10;
                                return;
                            case 21682:
                                fVar.h(i10);
                                fVar.f46186y.f46144s = (int) j10;
                                return;
                            case 21690:
                                fVar.h(i10);
                                fVar.f46186y.f46143r = (int) j10;
                                return;
                            case 21930:
                                fVar.h(i10);
                                u3.e eVar2 = fVar.f46186y;
                                if (j10 == 1) {
                                    z10 = true;
                                }
                                eVar2.X = z10;
                                return;
                            case 21938:
                                fVar.h(i10);
                                u3.e eVar3 = fVar.f46186y;
                                eVar3.f46150z = true;
                                eVar3.f46141p = (int) j10;
                                return;
                            case 21998:
                                fVar.h(i10);
                                fVar.f46186y.f46133g = (int) j10;
                                return;
                            case 22186:
                                fVar.h(i10);
                                fVar.f46186y.T = j10;
                                return;
                            case 22203:
                                fVar.h(i10);
                                fVar.f46186y.U = j10;
                                return;
                            case 25188:
                                fVar.h(i10);
                                fVar.f46186y.R = (int) j10;
                                return;
                            case 30114:
                                fVar.Z = j10;
                                return;
                            case 30321:
                                fVar.h(i10);
                                int i13 = (int) j10;
                                if (i13 != 0) {
                                    if (i13 != 1) {
                                        if (i13 != 2) {
                                            if (i13 == 3) {
                                                fVar.f46186y.f46145t = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f46186y.f46145t = 2;
                                        return;
                                    }
                                    fVar.f46186y.f46145t = 1;
                                    return;
                                }
                                fVar.f46186y.f46145t = 0;
                                return;
                            case 2352003:
                                fVar.h(i10);
                                fVar.f46186y.f46132f = (int) j10;
                                return;
                            case 2807729:
                                fVar.f46182t = j10;
                                return;
                            default:
                                switch (i10) {
                                    case 21945:
                                        fVar.h(i10);
                                        int i14 = (int) j10;
                                        if (i14 != 1) {
                                            if (i14 == 2) {
                                                fVar.f46186y.C = 1;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f46186y.C = 2;
                                        return;
                                    case 21946:
                                        fVar.h(i10);
                                        int g10 = b2.o.g((int) j10);
                                        if (g10 != -1) {
                                            fVar.f46186y.B = g10;
                                            return;
                                        }
                                        return;
                                    case 21947:
                                        fVar.h(i10);
                                        fVar.f46186y.f46150z = true;
                                        int f7 = b2.o.f((int) j10);
                                        if (f7 != -1) {
                                            fVar.f46186y.A = f7;
                                            return;
                                        }
                                        return;
                                    case 21948:
                                        fVar.h(i10);
                                        fVar.f46186y.D = (int) j10;
                                        return;
                                    case 21949:
                                        fVar.h(i10);
                                        fVar.f46186y.E = (int) j10;
                                        return;
                                    default:
                                        return;
                                }
                        }
                    } else if (j10 != 1) {
                        throw b2.x0.a(null, "ContentEncodingScope " + j10 + " not supported");
                    }
                } else if (j10 != 0) {
                    throw b2.x0.a(null, "ContentEncodingOrder " + j10 + " not supported");
                }
            } else if (!fVar.f46187z) {
                fVar.g(i10);
                if (fVar.G == -1) {
                    fVar.G = j10;
                }
            }
        } else if (!fVar.f46187z) {
            fVar.g(i10);
            if (fVar.H == -1) {
                fVar.H = j10;
            }
        }
    }

    public void F(int i10, long j10, long j11) {
        u3.f fVar = (u3.f) this.f14889a;
        fVar.f46172j0.getClass();
        if (i10 != 160) {
            if (i10 != 174) {
                if (i10 != 183) {
                    if (i10 != 187) {
                        if (i10 != 19899) {
                            if (i10 != 20533) {
                                if (i10 != 21968) {
                                    if (i10 != 408125543) {
                                        if (i10 != 475249515) {
                                            if (i10 == 524531317 && !fVar.f46187z) {
                                                if (fVar.d && fVar.K != -1) {
                                                    fVar.J = true;
                                                    return;
                                                }
                                                fVar.f46172j0.K(new c3.t(fVar.v));
                                                fVar.f46187z = true;
                                                return;
                                            }
                                            return;
                                        } else if (!fVar.f46187z) {
                                            fVar.D = true;
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    long j12 = fVar.f46181s;
                                    if (j12 != -1 && j12 != j10) {
                                        throw b2.x0.a(null, "Multiple Segment elements not supported");
                                    }
                                    fVar.f46181s = j10;
                                    fVar.f46180r = j11;
                                    return;
                                }
                                fVar.h(i10);
                                fVar.f46186y.f46150z = true;
                                return;
                            }
                            fVar.h(i10);
                            fVar.f46186y.f46134i = true;
                            return;
                        }
                        fVar.A = -1;
                        fVar.B = -1L;
                        return;
                    } else if (!fVar.f46187z) {
                        fVar.g(i10);
                        fVar.E = -9223372036854775807L;
                        return;
                    } else {
                        return;
                    }
                } else if (!fVar.f46187z) {
                    fVar.g(i10);
                    fVar.F = -1;
                    fVar.G = -1L;
                    fVar.H = -1L;
                    return;
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f46139n = -1;
            obj.f46140o = -1;
            obj.f46141p = -1;
            obj.f46142q = -1;
            obj.f46143r = -1;
            obj.f46144s = 0;
            obj.f46145t = -1;
            obj.f46146u = 0.0f;
            obj.v = 0.0f;
            obj.f46147w = 0.0f;
            obj.f46148x = null;
            obj.f46149y = -1;
            obj.f46150z = false;
            obj.A = -1;
            obj.B = -1;
            obj.C = -1;
            obj.D = 1000;
            obj.E = 200;
            obj.F = -1.0f;
            obj.G = -1.0f;
            obj.H = -1.0f;
            obj.I = -1.0f;
            obj.J = -1.0f;
            obj.K = -1.0f;
            obj.L = -1.0f;
            obj.M = -1.0f;
            obj.N = -1.0f;
            obj.O = -1.0f;
            obj.Q = 1;
            obj.R = -1;
            obj.S = 8000;
            obj.T = 0L;
            obj.U = 0L;
            obj.W = false;
            obj.Y = true;
            obj.Z = "eng";
            fVar.f46186y = obj;
            obj.f46126a = fVar.f46184w;
            return;
        }
        fVar.Y = false;
        fVar.Z = 0L;
    }

    public void G(int i10, String str) {
        u3.f fVar = (u3.f) this.f14889a;
        if (i10 != 134) {
            if (i10 != 17026) {
                if (i10 != 21358) {
                    if (i10 != 2274716) {
                        return;
                    }
                    fVar.h(i10);
                    fVar.f46186y.Z = str;
                    return;
                }
                fVar.h(i10);
                fVar.f46186y.f46128b = str;
                return;
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw b2.x0.a(null, "DocType " + str + " not supported");
            } else {
                fVar.f46184w = str.equals("webm");
                return;
            }
        }
        fVar.h(i10);
        fVar.f46186y.f46130c = str;
    }

    @Override
    public void G0(float f7) {
        gu0 gu0Var = (gu0) this.f14889a;
        qg.s0.e(gu0Var.P1).k(String.valueOf(qg.m.f43227a.indexOf(gu0Var.W0.getCurrentBrush())), f7);
        qg.q1 q1Var = gu0Var.K1;
        q1Var.f43287c = f7;
        gu0Var.t0(q1Var, null);
    }

    public void H(ba.a aVar, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list != null && (str = (String) list.get(0)) != null && str.length() != 0) {
            synchronized (((tc.u) this.f14889a).f45609c) {
            }
            throw new tc.n(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), aVar);
        }
    }

    @Override
    public void I(boolean z10) {
        ((uf0) this.f14889a).f29368c.setAspectLock(z10);
    }

    @Override
    public String I0() {
        return null;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ((ChatActivityEnterView) this.f14889a).R0(i10, z10, 0, true, 0L);
    }

    @Override
    public void K(String str) {
        String trim;
        a5 a5Var = (a5) this.f14889a;
        if (str == null) {
            trim = "";
        } else {
            try {
                trim = str.trim();
            } catch (Throwable unused) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.g3(a5Var, 7));
                return;
            }
        }
        Uri parse = Uri.parse(trim);
        String scheme = parse.getScheme();
        if (("ton".equalsIgnoreCase(scheme) || "tc".equalsIgnoreCase(scheme)) && (a5Var.getParentActivity() instanceof LaunchActivity) && new ic0((LaunchActivity) a5Var.getParentActivity(), a5.g0(a5Var), null, false).g(parse)) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.g3(a5Var, 7));
    }

    @Override
    public Cursor X(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f14889a;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override
    public long a(long j10) {
        return 0L;
    }

    @Override
    public long b(long j10) {
        ArrayList arrayList = (ArrayList) this.f14889a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((z3.b) arrayList.get(0)).f49252b) {
            return ((z3.b) arrayList.get(0)).f49252b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.b bVar = (z3.b) arrayList.get(i10);
            long j11 = bVar.f49252b;
            long j12 = bVar.f49252b;
            if (j10 < j11) {
                long j13 = ((z3.b) arrayList.get(i10 - 1)).d;
                if (j13 != -9223372036854775807L && j13 > j10 && j13 < j12) {
                    return j13;
                }
                return j12;
            }
        }
        long j14 = ((z3.b) e9.s.m(arrayList)).d;
        if (j14 == -9223372036854775807L || j10 >= j14) {
            return Long.MIN_VALUE;
        }
        return j14;
    }

    @Override
    public void clear() {
        ((ArrayList) this.f14889a).clear();
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f14889a;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public e9.n0 d(long j10) {
        int z10 = z(j10);
        if (z10 == 0) {
            e9.l0 l0Var = e9.n0.f8595b;
            return e9.x1.e;
        }
        z3.b bVar = (z3.b) ((ArrayList) this.f14889a).get(z10 - 1);
        long j11 = bVar.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            e9.l0 l0Var2 = e9.n0.f8595b;
            return e9.x1.e;
        }
        return bVar.f49251a;
    }

    @Override
    public void d0(boolean z10) {
        uf0 uf0Var = (uf0) this.f14889a;
        uf0Var.getClass();
        tf0 tf0Var = uf0Var.f29366a;
        if (tf0Var != null) {
            ((zs0) tf0Var).a(z10);
        }
    }

    @Override
    public boolean d1(String str, o9 o9Var) {
        return false;
    }

    @Override
    public long e(long j10, long j11) {
        return 0L;
    }

    @Override
    public long f(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override
    public Object mo27get() {
        return new s5.i((Context) ((hd.a) this.f14889a).mo27get(), "com.google.android.datatransport.events", Integer.valueOf(s5.i.d).intValue());
    }

    @Override
    public m2.j h(long j10) {
        return (m2.j) this.f14889a;
    }

    @Override
    public void h0() {
        tf0 tf0Var = ((uf0) this.f14889a).f29366a;
        if (tf0Var != null) {
            PhotoViewer photoViewer = ((zs0) tf0Var).f42417a;
            if (photoViewer.f31912c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override
    public Paint.FontMetricsInt i() {
        return ((vi) this.f14889a).H0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void invalidate() {
        ((org.telegram.ui.Cells.u1) ((org.telegram.ui.Cells.h1) this.f14889a).f20966b).invalidate();
    }

    @Override
    public boolean j(z3.b r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: m.l.j(z3.b, long):boolean");
    }

    @Override
    public void k(Canvas canvas) {
        ir0 ir0Var = (ir0) this.f14889a;
        canvas.drawColor(ir0Var.getThemedColor(g6.f19601d6));
        if (SharedConfig.chatBlurEnabled()) {
            ir0Var.O0.b(canvas, -3);
        }
    }

    @Override
    public void l(l.k kVar) {
        h hVar = ((ActionMenuView) this.f14889a).K;
        if (hVar != null) {
            hVar.l(kVar);
        }
    }

    @Override
    public void m0(bh.a aVar) {
        aVar.a(((ir0) this.f14889a).getThemedColor(g6.f19601d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public long n(long j10, long j11) {
        return 0L;
    }

    @Override
    public boolean o(l.k kVar, MenuItem menuItem) {
        m mVar = ((ActionMenuView) this.f14889a).P;
        if (mVar != null) {
            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((h5) mVar).f13315b).W.f14851c).iterator();
            while (it.hasNext()) {
                if (((androidx.fragment.app.a0) it.next()).f1543a.p()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public void onComplete(Task task) {
        y8.e0 e0Var = (y8.e0) this.f14889a;
        if (task.isSuccessful()) {
            x8.m.L0(e0Var, true, (byte[]) task.getResult());
            return;
        }
        Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
        x8.m.L0(e0Var, false, null);
    }

    @Override
    public long p(long j10) {
        ArrayList arrayList = (ArrayList) this.f14889a;
        if (arrayList.isEmpty() || j10 < ((z3.b) arrayList.get(0)).f49252b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j11 = ((z3.b) arrayList.get(i10)).f49252b;
            int i11 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
            if (i11 == 0) {
                return j11;
            }
            if (i11 < 0) {
                z3.b bVar = (z3.b) arrayList.get(i10 - 1);
                long j12 = bVar.d;
                if (j12 != -9223372036854775807L && j12 <= j10) {
                    return j12;
                }
                return bVar.f49252b;
            }
        }
        z3.b bVar2 = (z3.b) e9.s.m(arrayList);
        long j13 = bVar2.d;
        if (j13 != -9223372036854775807L && j10 >= j13) {
            return j13;
        }
        return bVar2.f49252b;
    }

    @Override
    public void q(long j10) {
        ArrayList arrayList = (ArrayList) this.f14889a;
        int z10 = z(j10);
        if (z10 == 0) {
            return;
        }
        long j11 = ((z3.b) arrayList.get(z10 - 1)).d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            z10--;
        }
        arrayList.subList(0, z10).clear();
    }

    @Override
    public void r(int i10, int i11, CharSequence charSequence, boolean z10) {
        vi viVar = (vi) this.f14889a;
        if (viVar.o1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(viVar.o1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, viVar.o1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            viVar.o1().setText(spannableStringBuilder);
            viVar.o1().setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public boolean s() {
        return true;
    }

    @Override
    public void s0() {
        sc k10 = ((zh.r3) this.f14889a).getBulletinFactory().k(false);
        k10.f28815t = true;
        k10.j();
    }

    public void t(int i10, int i11, c3.p pVar) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        int i17;
        int i18;
        int i19;
        int i20;
        byte[] bArr;
        int i21;
        u3.f fVar = (u3.f) this.f14889a;
        u3.g gVar = fVar.f46158b;
        SparseArray sparseArray = fVar.f46160c;
        e2.x xVar = fVar.f46173k;
        e2.x xVar2 = fVar.f46169i;
        int i22 = 2;
        int i23 = 0;
        int i24 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 != 165) {
                if (i10 != 16877) {
                    if (i10 != 16981) {
                        if (i10 != 18402) {
                            if (i10 != 21419) {
                                if (i10 != 25506) {
                                    if (i10 == 30322) {
                                        fVar.h(i10);
                                        byte[] bArr2 = new byte[i11];
                                        fVar.f46186y.f46148x = bArr2;
                                        pVar.readFully(bArr2, 0, i11);
                                        return;
                                    }
                                    throw b2.x0.a(null, "Unexpected id: " + i10);
                                }
                                fVar.h(i10);
                                byte[] bArr3 = new byte[i11];
                                fVar.f46186y.f46137l = bArr3;
                                pVar.readFully(bArr3, 0, i11);
                                return;
                            }
                            Arrays.fill(xVar.f8414a, (byte) 0);
                            pVar.readFully(xVar.f8414a, 4 - i11, i11);
                            xVar.N(0);
                            fVar.A = (int) xVar.C();
                            return;
                        }
                        byte[] bArr4 = new byte[i11];
                        pVar.readFully(bArr4, 0, i11);
                        fVar.h(i10);
                        fVar.f46186y.f46136k = new c3.h0(1, 0, 0, bArr4);
                        return;
                    }
                    fVar.h(i10);
                    byte[] bArr5 = new byte[i11];
                    fVar.f46186y.f46135j = bArr5;
                    pVar.readFully(bArr5, 0, i11);
                    return;
                }
                fVar.h(i10);
                u3.e eVar = fVar.f46186y;
                int i25 = eVar.h;
                if (i25 != 1685485123 && i25 != 1685480259) {
                    pVar.r(i11);
                    return;
                }
                byte[] bArr6 = new byte[i11];
                eVar.P = bArr6;
                pVar.readFully(bArr6, 0, i11);
                return;
            } else if (fVar.O == 2) {
                u3.e eVar2 = (u3.e) sparseArray.get(fVar.U);
                int i26 = fVar.X;
                e2.x xVar3 = fVar.f46178p;
                if (i26 == 4 && "V_VP9".equals(eVar2.f46130c)) {
                    xVar3.K(i11);
                    pVar.readFully(xVar3.f8414a, 0, i11);
                    return;
                }
                pVar.r(i11);
                return;
            } else {
                return;
            }
        }
        if (fVar.O == 0) {
            fVar.U = (int) gVar.b(pVar, false, true, 8);
            fVar.V = gVar.f46190c;
            fVar.Q = -9223372036854775807L;
            fVar.O = 1;
            xVar2.K(0);
        }
        u3.e eVar3 = (u3.e) sparseArray.get(fVar.U);
        if (eVar3 == null) {
            pVar.r(i11 - fVar.V);
            fVar.O = 0;
            return;
        }
        eVar3.f46127a0.getClass();
        if (fVar.O == 1) {
            fVar.l(pVar, 3);
            int i27 = (xVar2.f8414a[2] & 6) >> 1;
            byte b10 = 255;
            if (i27 == 0) {
                fVar.S = 1;
                int[] iArr = fVar.T;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                fVar.T = iArr;
                iArr[0] = (i11 - fVar.V) - 3;
            } else {
                fVar.l(pVar, 4);
                int i28 = (xVar2.f8414a[3] & 255) + 1;
                fVar.S = i28;
                int[] iArr2 = fVar.T;
                if (iArr2 == null) {
                    iArr2 = new int[i28];
                } else if (iArr2.length < i28) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i28)];
                }
                fVar.T = iArr2;
                if (i27 == 2) {
                    int i29 = fVar.S;
                    Arrays.fill(iArr2, 0, i29, ((i11 - fVar.V) - 4) / i29);
                } else if (i27 == 1) {
                    int i30 = 0;
                    int i31 = 0;
                    int i32 = 4;
                    while (true) {
                        i18 = fVar.S - 1;
                        if (i30 >= i18) {
                            break;
                        }
                        fVar.T[i30] = 0;
                        while (true) {
                            i19 = i32 + 1;
                            fVar.l(pVar, i19);
                            int i33 = xVar2.f8414a[i32] & 255;
                            int[] iArr3 = fVar.T;
                            i20 = iArr3[i30] + i33;
                            iArr3[i30] = i20;
                            if (i33 != 255) {
                                break;
                            }
                            i32 = i19;
                        }
                        i31 += i20;
                        i30++;
                        i32 = i19;
                    }
                    fVar.T[i18] = ((i11 - fVar.V) - i32) - i31;
                } else if (i27 == 3) {
                    int i34 = 0;
                    int i35 = 0;
                    int i36 = 4;
                    while (true) {
                        int i37 = fVar.S - i24;
                        if (i34 < i37) {
                            fVar.T[i34] = i23;
                            int i38 = i36 + 1;
                            fVar.l(pVar, i38);
                            if (xVar2.f8414a[i36] != 0) {
                                int i39 = i23;
                                while (true) {
                                    if (i39 < 8) {
                                        int i40 = i24 << (7 - i39);
                                        i15 = i22;
                                        if ((xVar2.f8414a[i36] & i40) != 0) {
                                            int i41 = i38 + i39;
                                            fVar.l(pVar, i41);
                                            i16 = i24;
                                            j10 = xVar2.f8414a[i36] & b10 & (~i40);
                                            while (i38 < i41) {
                                                j10 = (j10 << 8) | (xVar2.f8414a[i38] & b10);
                                                i38++;
                                                i41 = i41;
                                                b10 = 255;
                                            }
                                            i17 = i41;
                                            if (i34 > 0) {
                                                j10 -= (1 << ((i39 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i39++;
                                            i22 = i15;
                                            b10 = 255;
                                        }
                                    } else {
                                        i15 = i22;
                                        i16 = i24;
                                        j10 = 0;
                                        i17 = i38;
                                        break;
                                    }
                                }
                                if (j10 < -2147483648L || j10 > 2147483647L) {
                                    break;
                                }
                                int i42 = (int) j10;
                                int[] iArr4 = fVar.T;
                                if (i34 != 0) {
                                    i42 += iArr4[i34 - 1];
                                }
                                iArr4[i34] = i42;
                                i35 += i42;
                                i34++;
                                i23 = i39;
                                i22 = i15;
                                i24 = i16;
                                i36 = i17;
                                b10 = 255;
                            } else {
                                throw b2.x0.a(null, "No valid varint length mask found");
                            }
                        } else {
                            i12 = i22;
                            i13 = i23;
                            i14 = i24;
                            fVar.T[i37] = ((i11 - fVar.V) - i36) - i35;
                            break;
                        }
                    }
                    throw b2.x0.a(null, "EBML lacing sample size out of range.");
                } else {
                    throw b2.x0.a(null, "Unexpected lacing value: " + i27);
                }
            }
            i12 = 2;
            i13 = 0;
            i14 = 1;
            int i43 = xVar2.f8414a[i14] & 255;
            fVar.P = fVar.n(i43 | (bArr[i13] << 8)) + fVar.M;
            if (eVar3.e != i14 && (i10 != 163 || (xVar2.f8414a[i12] & 128) != 128)) {
                i21 = i13;
            } else {
                i21 = 1;
            }
            fVar.W = i21;
            fVar.O = i12;
            fVar.R = i13;
        }
        if (i10 == 163) {
            while (true) {
                int i44 = fVar.R;
                if (i44 < fVar.S) {
                    fVar.i(eVar3, ((fVar.R * eVar3.f46132f) / 1000) + fVar.P, fVar.W, fVar.o(pVar, eVar3, fVar.T[i44], false), 0);
                    fVar.R++;
                } else {
                    fVar.O = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i45 = fVar.R;
                if (i45 < fVar.S) {
                    int[] iArr5 = fVar.T;
                    iArr5[i45] = fVar.o(pVar, eVar3, iArr5[i45], true);
                    fVar.R++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public long u() {
        return 0L;
    }

    @Override
    public void v(Object obj) {
        ((g8.c) obj).onLocationResult((LocationResult) this.f14889a);
    }

    @Override
    public long w(long j10) {
        return 1L;
    }

    @Override
    public long x(long j10, long j11) {
        return 1L;
    }

    public int z(long j10) {
        ArrayList arrayList = (ArrayList) this.f14889a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j10 < ((z3.b) arrayList.get(i10)).f49252b) {
                return i10;
            }
        }
        return arrayList.size();
    }

    public l(int i10) {
        switch (i10) {
            case 23:
                this.f14889a = new ArrayList();
                return;
            default:
                this.f14889a = new o2.d(1.0f, 5, 0, false);
                return;
        }
    }

    @Override
    public float get() {
        gu0 gu0Var = (gu0) this.f14889a;
        int i10 = gu0Var.P1;
        qg.m currentBrush = gu0Var.W0.getCurrentBrush();
        if (currentBrush == null) {
            return qg.s0.e(i10).f43312i;
        }
        return qg.s0.e(i10).f(String.valueOf(qg.m.f43227a.indexOf(currentBrush)), currentBrush.d());
    }

    public l(int i10, int i11, int... iArr) {
        w60[] w60VarArr = new w60[(iArr.length / 2) + 1];
        this.f14889a = w60VarArr;
        w60 w60Var = new w60(i10, i11);
        int i12 = 0;
        w60VarArr[0] = w60Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((w60[]) this.f14889a)[i13] = new w60(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    @Override
    public void U() {
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void V0(MrzRecognizer.Result result) {
    }

    @Override
    public void y(String str) {
    }

    @Override
    public long c(long j10, long j11) {
        return j11;
    }

    @Override
    public void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void m(TLRPC.TL_document tL_document, String str, Object obj) {
    }
}
