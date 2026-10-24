package l2;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.b0;
import androidx.recyclerview.widget.RecyclerView;
import b2.u0;
import b2.w0;
import c3.k0;
import c3.v;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import ki.t1;
import m.g3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.j0;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.hr0;
import org.telegram.ui.Components.j91;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.xh0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.it0;
import org.telegram.ui.ta1;
import qg.s1;
import rg.w1;
import s4.b1;
import s4.e1;
import s4.h1;
import s4.o0;
import tc.u;
import y8.e0;
import zh.n0;
import zh.r0;
public class f implements l.i, i, fp0, ne.f, bh.h, j91, com.google.android.gms.common.api.internal.o, w1, h1, r, OnCompleteListener {
    public final int f15905a;
    public final Object f15906b;

    public f(Object obj, int i10) {
        this.f15905a = i10;
        this.f15906b = obj;
    }

    public static void N(String str, TreeMap treeMap) {
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
    public long A(long j10) {
        return 1L;
    }

    @Override
    public long B(long j10, long j11) {
        return 1L;
    }

    public void C() {
        HashMap hashMap = (HashMap) this.f15906b;
        for (Map.Entry entry : hashMap.entrySet()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) entry.getValue());
        }
        hashMap.clear();
    }

    public s0.d D(int i10) {
        return null;
    }

    @Override
    public void E() {
        ((k9) this.f15906b).f27955a.invalidate();
    }

    public s0.d F(int i10) {
        return null;
    }

    public void G(int i10, long j10) {
        u3.f fVar = (u3.f) this.f15906b;
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
                                                fVar.f48023y.e = -1;
                                                return;
                                            }
                                            fVar.h(i10);
                                            fVar.f48023y.e = 5;
                                            return;
                                        }
                                        fVar.h(i10);
                                        fVar.f48023y.e = 3;
                                        return;
                                    }
                                    fVar.h(i10);
                                    fVar.f48023y.e = 1;
                                    return;
                                }
                                fVar.h(i10);
                                fVar.f48023y.e = 2;
                                return;
                            case 136:
                                fVar.h(i10);
                                u3.e eVar = fVar.f48023y;
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
                                fVar.f48023y.Q = (int) j10;
                                return;
                            case 176:
                                fVar.h(i10);
                                fVar.f48023y.f47976n = (int) j10;
                                return;
                            case 179:
                                if (!fVar.f48024z) {
                                    fVar.g(i10);
                                    fVar.E = fVar.n(j10);
                                    return;
                                }
                                return;
                            case 186:
                                fVar.h(i10);
                                fVar.f48023y.f47977o = (int) j10;
                                return;
                            case 215:
                                fVar.h(i10);
                                fVar.f48023y.d = (int) j10;
                                return;
                            case 231:
                                fVar.M = fVar.n(j10);
                                return;
                            case 238:
                                fVar.X = (int) j10;
                                return;
                            case 247:
                                if (!fVar.f48024z) {
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
                                fVar.f48023y.h = (int) j10;
                                return;
                            case 16980:
                                if (j10 != 3) {
                                    throw w0.a(null, "ContentCompAlgo " + j10 + " not supported");
                                }
                                return;
                            case 17029:
                                if (j10 < 1 || j10 > 2) {
                                    throw w0.a(null, "DocTypeReadVersion " + j10 + " not supported");
                                }
                                return;
                            case 17143:
                                if (j10 != 1) {
                                    throw w0.a(null, "EBMLReadVersion " + j10 + " not supported");
                                }
                                return;
                            case 18401:
                                if (j10 != 5) {
                                    throw w0.a(null, "ContentEncAlgo " + j10 + " not supported");
                                }
                                return;
                            case 18408:
                                if (j10 != 1) {
                                    throw w0.a(null, "AESSettingsCipherMode " + j10 + " not supported");
                                }
                                return;
                            case 21420:
                                fVar.B = j10 + fVar.f48018s;
                                return;
                            case 21432:
                                int i12 = (int) j10;
                                fVar.h(i10);
                                if (i12 != 0) {
                                    if (i12 != 1) {
                                        if (i12 != 3) {
                                            if (i12 == 15) {
                                                fVar.f48023y.f47986y = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f48023y.f47986y = 1;
                                        return;
                                    }
                                    fVar.f48023y.f47986y = 2;
                                    return;
                                }
                                fVar.f48023y.f47986y = 0;
                                return;
                            case 21680:
                                fVar.h(i10);
                                fVar.f48023y.f47979q = (int) j10;
                                return;
                            case 21682:
                                fVar.h(i10);
                                fVar.f48023y.f47981s = (int) j10;
                                return;
                            case 21690:
                                fVar.h(i10);
                                fVar.f48023y.f47980r = (int) j10;
                                return;
                            case 21930:
                                fVar.h(i10);
                                u3.e eVar2 = fVar.f48023y;
                                if (j10 == 1) {
                                    z10 = true;
                                }
                                eVar2.X = z10;
                                return;
                            case 21938:
                                fVar.h(i10);
                                u3.e eVar3 = fVar.f48023y;
                                eVar3.f47987z = true;
                                eVar3.f47978p = (int) j10;
                                return;
                            case 21998:
                                fVar.h(i10);
                                fVar.f48023y.f47970g = (int) j10;
                                return;
                            case 22186:
                                fVar.h(i10);
                                fVar.f48023y.T = j10;
                                return;
                            case 22203:
                                fVar.h(i10);
                                fVar.f48023y.U = j10;
                                return;
                            case 25188:
                                fVar.h(i10);
                                fVar.f48023y.R = (int) j10;
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
                                                fVar.f48023y.f47982t = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f48023y.f47982t = 2;
                                        return;
                                    }
                                    fVar.f48023y.f47982t = 1;
                                    return;
                                }
                                fVar.f48023y.f47982t = 0;
                                return;
                            case 2352003:
                                fVar.h(i10);
                                fVar.f48023y.f47969f = (int) j10;
                                return;
                            case 2807729:
                                fVar.f48019t = j10;
                                return;
                            default:
                                switch (i10) {
                                    case 21945:
                                        fVar.h(i10);
                                        int i14 = (int) j10;
                                        if (i14 != 1) {
                                            if (i14 == 2) {
                                                fVar.f48023y.C = 1;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f48023y.C = 2;
                                        return;
                                    case 21946:
                                        fVar.h(i10);
                                        int g10 = b2.n.g((int) j10);
                                        if (g10 != -1) {
                                            fVar.f48023y.B = g10;
                                            return;
                                        }
                                        return;
                                    case 21947:
                                        fVar.h(i10);
                                        fVar.f48023y.f47987z = true;
                                        int f7 = b2.n.f((int) j10);
                                        if (f7 != -1) {
                                            fVar.f48023y.A = f7;
                                            return;
                                        }
                                        return;
                                    case 21948:
                                        fVar.h(i10);
                                        fVar.f48023y.D = (int) j10;
                                        return;
                                    case 21949:
                                        fVar.h(i10);
                                        fVar.f48023y.E = (int) j10;
                                        return;
                                    default:
                                        return;
                                }
                        }
                    } else if (j10 != 1) {
                        throw w0.a(null, "ContentEncodingScope " + j10 + " not supported");
                    }
                } else if (j10 != 0) {
                    throw w0.a(null, "ContentEncodingOrder " + j10 + " not supported");
                }
            } else if (!fVar.f48024z) {
                fVar.g(i10);
                if (fVar.G == -1) {
                    fVar.G = j10;
                }
            }
        } else if (!fVar.f48024z) {
            fVar.g(i10);
            if (fVar.H == -1) {
                fVar.H = j10;
            }
        }
    }

    public void H(int i10) {
        boolean z10;
        TLRPC.TL_exportedNoPaidMessagesToken c10;
        r0 r0Var = ((n0) this.f15906b).e;
        if (r0Var != null) {
            int i11 = r0Var.f52558a;
            if (r0Var.d != i10) {
                boolean z11 = true;
                if (r0Var.f52560c.d && i10 == 2) {
                    i10 = 1;
                }
                r0Var.d = i10;
                SharedPreferences.Editor edit = MessagesController.getMainSettings(i11).edit();
                if (r0Var.d == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                edit.putBoolean("qrNoPaidPermanent", z10).apply();
                int i12 = r0Var.d;
                if (i12 == 0) {
                    if (r0Var.f52562n != 0) {
                        ConnectionsManager.getInstance(i11).cancelRequest(r0Var.f52562n, true);
                        r0Var.f52562n = 0;
                        return;
                    }
                    return;
                }
                if (i12 == 2 && (c10 = r0Var.c()) != null) {
                    r0Var.f52561f = c10;
                    r0Var.f52559b.setFreeLink(r0Var.d(c10));
                }
                if (r0Var.d != 1) {
                    z11 = false;
                }
                r0Var.l(false, z11);
            }
        }
    }

    public void I(float f7) {
        l91 l91Var = (l91) this.f15906b;
        if (f7 == 1.0f) {
            View[] viewArr = l91Var.e;
            View[] viewArr2 = l91Var.e;
            if (viewArr[1] != null) {
                l91Var.F();
                l91Var.h.put(l91Var.f28283f[1], viewArr2[1]);
                l91Var.removeView(viewArr2[1]);
                l91Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            l91Var.z(l91Var.f28281b);
            return;
        }
        View[] viewArr3 = l91Var.e;
        View[] viewArr4 = l91Var.e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (l91Var.f28289y) {
            l91Var.E(view, (1.0f - f7) * viewArr3[0].getMeasuredWidth());
            View view2 = viewArr4[0];
            l91Var.E(view2, (-view2.getMeasuredWidth()) * f7);
        } else {
            l91Var.E(view, (1.0f - f7) * (-viewArr3[0].getMeasuredWidth()));
            View view3 = viewArr4[0];
            l91Var.E(view3, view3.getMeasuredWidth() * f7);
        }
        l91Var.w(false);
    }

    @Override
    public void J(bh.a aVar) {
        aVar.a(((hr0) this.f15906b).getThemedColor(k6.f21184d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public void L(float f7, boolean z10) {
        int i10 = this.f15905a;
        Object obj = this.f15906b;
        switch (i10) {
            case 5:
                ng.h hVar = (ng.h) obj;
                float f10 = hVar.f17523b;
                float y3 = k3.y(hVar.f17524c, f10, f7, f10);
                hVar.d = y3;
                if (z10) {
                    q6 q6Var = hVar.e;
                    q6Var.getClass();
                    q6Var.c(null, y3);
                }
                hVar.invalidate();
                return;
            default:
                ta1 ta1Var = (ta1) ((j0) obj);
                int i11 = (int) (k6.f21415q * 100.0f);
                int i12 = (int) (f7 * 100.0f);
                k6.f21415q = f7;
                if (i11 != i12) {
                    ThemeActivity themeActivity = ta1Var.f41983f.e;
                    vl0 vl0Var = (vl0) themeActivity.f34202b.K(themeActivity.f34209f0);
                    if (vl0Var != null) {
                        ((e9) vl0Var.f46342a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (k6.f21415q * 100.0f))));
                    }
                    k6.E(true);
                    return;
                }
                return;
        }
    }

    public boolean O(int i10, int i11, Bundle bundle) {
        return false;
    }

    public void P(b1 b1Var, u0 u0Var, u0 u0Var2) {
        int i10;
        int i11;
        boolean z10;
        b1 T;
        int i12;
        RecyclerView recyclerView = (RecyclerView) this.f15906b;
        recyclerView.f3610b.k(b1Var);
        recyclerView.h(b1Var);
        b1Var.q(false);
        e1 e1Var = (e1) recyclerView.f3613c0;
        e1Var.getClass();
        int i13 = u0Var.f4060a;
        int i14 = u0Var.f4061b;
        View view = b1Var.f46342a;
        if (u0Var2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = u0Var2.f4060a;
        }
        int i15 = i10;
        if (u0Var2 == null) {
            i11 = view.getTop();
        } else {
            i11 = u0Var2.f4061b;
        }
        int i16 = i11;
        if (!b1Var.j() && (i13 != i15 || i14 != i16)) {
            view.layout(i15, i16, view.getWidth() + i15, view.getHeight() + i16);
            z10 = e1Var.r(b1Var, u0Var, i13, i14, i15, i16);
        } else {
            int i17 = b1Var.h;
            int i18 = -1;
            if (i17 != -1) {
                for (int i19 = 0; i19 < recyclerView.getChildCount(); i19++) {
                    View childAt = recyclerView.getChildAt(i19);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i12 = T.h) >= 0 && i12 < i17 && i12 > i18) {
                        i18 = i12;
                    }
                }
            }
            b1Var.f46347i = (b1Var.h - i18) + (i18 * 1000);
            e1Var.s(b1Var, u0Var);
            z10 = true;
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    public void Q(int i10, long j10, long j11) {
        u3.f fVar = (u3.f) this.f15906b;
        fVar.f48009j0.getClass();
        if (i10 != 160) {
            if (i10 != 174) {
                if (i10 != 183) {
                    if (i10 != 187) {
                        if (i10 != 19899) {
                            if (i10 != 20533) {
                                if (i10 != 21968) {
                                    if (i10 != 408125543) {
                                        if (i10 != 475249515) {
                                            if (i10 == 524531317 && !fVar.f48024z) {
                                                if (fVar.d && fVar.K != -1) {
                                                    fVar.J = true;
                                                    return;
                                                }
                                                fVar.f48009j0.g0(new v(fVar.v));
                                                fVar.f48024z = true;
                                                return;
                                            }
                                            return;
                                        } else if (!fVar.f48024z) {
                                            fVar.D = true;
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    long j12 = fVar.f48018s;
                                    if (j12 != -1 && j12 != j10) {
                                        throw w0.a(null, "Multiple Segment elements not supported");
                                    }
                                    fVar.f48018s = j10;
                                    fVar.f48017r = j11;
                                    return;
                                }
                                fVar.h(i10);
                                fVar.f48023y.f47987z = true;
                                return;
                            }
                            fVar.h(i10);
                            fVar.f48023y.f47971i = true;
                            return;
                        }
                        fVar.A = -1;
                        fVar.B = -1L;
                        return;
                    } else if (!fVar.f48024z) {
                        fVar.g(i10);
                        fVar.E = -9223372036854775807L;
                        return;
                    } else {
                        return;
                    }
                } else if (!fVar.f48024z) {
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
            obj.f47976n = -1;
            obj.f47977o = -1;
            obj.f47978p = -1;
            obj.f47979q = -1;
            obj.f47980r = -1;
            obj.f47981s = 0;
            obj.f47982t = -1;
            obj.f47983u = 0.0f;
            obj.v = 0.0f;
            obj.f47984w = 0.0f;
            obj.f47985x = null;
            obj.f47986y = -1;
            obj.f47987z = false;
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
            fVar.f48023y = obj;
            obj.f47963a = fVar.f48021w;
            return;
        }
        fVar.Y = false;
        fVar.Z = 0L;
    }

    public void R(int i10, String str) {
        u3.f fVar = (u3.f) this.f15906b;
        if (i10 != 134) {
            if (i10 != 17026) {
                if (i10 != 21358) {
                    if (i10 != 2274716) {
                        return;
                    }
                    fVar.h(i10);
                    fVar.f48023y.Z = str;
                    return;
                }
                fVar.h(i10);
                fVar.f48023y.f47965b = str;
                return;
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw w0.a(null, "DocType " + str + " not supported");
            } else {
                fVar.f48021w = str.equals("webm");
                return;
            }
        }
        fVar.h(i10);
        fVar.f48023y.f47967c = str;
    }

    public void S(b1 b1Var) {
        RecyclerView recyclerView = (RecyclerView) this.f15906b;
        s4.n0 n0Var = recyclerView.f3638x;
        View view = b1Var.f46342a;
        qf.e eVar = recyclerView.f3610b;
        g3 g3Var = n0Var.f46434a;
        t1 t1Var = (t1) g3Var.f16265b;
        int indexOfChild = ((RecyclerView) t1Var.f15585b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((ad.d) g3Var.f16266c).G(indexOfChild)) {
                g3Var.X(view);
            }
            t1Var.Y(indexOfChild);
        }
        eVar.g(view);
    }

    public void T(ba.a aVar, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list != null && (str = (String) list.get(0)) != null && str.length() != 0) {
            synchronized (((u) this.f15906b).f47413c) {
            }
            throw new tc.n(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), aVar);
        }
    }

    @Override
    public void U(float f7) {
        it0 it0Var = (it0) this.f15906b;
        qg.u0.e(it0Var.P1).k(String.valueOf(qg.m.f44983a.indexOf(it0Var.W0.getCurrentBrush())), f7);
        s1 s1Var = it0Var.K1;
        s1Var.f45067c = f7;
        it0Var.s0(s1Var, null);
    }

    public Object V() {
        if (n7.a.f17317b == null) {
            n7.a.f17317b = new Exception();
        }
        synchronized (n7.a.f17316a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override
    public int Y() {
        switch (this.f15905a) {
            case 5:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        s6.f fVar = new s6.f(0, (TaskCompletionSource) obj2);
        s6.e eVar = (s6.e) ((s6.h) obj).u();
        Parcel H0 = eVar.H0();
        k7.a.d(H0, fVar);
        k7.a.c(H0, (s6.a) this.f15906b);
        eVar.I0(H0, 1);
    }

    @Override
    public long b(long j10) {
        return 0L;
    }

    @Override
    public int d(View view) {
        return s4.n0.x(view) - ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).leftMargin;
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
    public m2.j g(long j10) {
        return (m2.j) this.f15906b;
    }

    @Override
    public float get() {
        it0 it0Var = (it0) this.f15906b;
        int i10 = it0Var.P1;
        qg.m currentBrush = it0Var.W0.getCurrentBrush();
        if (currentBrush == null) {
            return qg.u0.e(i10).f45095i;
        }
        return qg.u0.e(i10).f(String.valueOf(qg.m.f44983a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f15905a) {
            case 5:
                ng.h hVar = (ng.h) this.f15906b;
                float f7 = hVar.f17523b;
                return String.valueOf(Math.round((hVar.f17522a.getProgress() * (hVar.f17524c - f7)) + f7));
            default:
                return " ";
        }
    }

    @Override
    public void h(Object obj) {
        ((g8.c) obj).onLocationResult((LocationResult) this.f15906b);
    }

    @Override
    public void i(l.k kVar) {
        k2.w0 w0Var = ((ActionMenuView) this.f15906b).K;
        if (w0Var != null) {
            w0Var.i(kVar);
        }
    }

    public void j(int i10, int i11, c3.r rVar) {
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
        u3.f fVar = (u3.f) this.f15906b;
        u3.g gVar = fVar.f47995b;
        SparseArray sparseArray = fVar.f47997c;
        x xVar = fVar.f48010k;
        x xVar2 = fVar.f48006i;
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
                                        fVar.f48023y.f47985x = bArr2;
                                        rVar.readFully(bArr2, 0, i11);
                                        return;
                                    }
                                    throw w0.a(null, "Unexpected id: " + i10);
                                }
                                fVar.h(i10);
                                byte[] bArr3 = new byte[i11];
                                fVar.f48023y.f47974l = bArr3;
                                rVar.readFully(bArr3, 0, i11);
                                return;
                            }
                            Arrays.fill(xVar.f8298a, (byte) 0);
                            rVar.readFully(xVar.f8298a, 4 - i11, i11);
                            xVar.N(0);
                            fVar.A = (int) xVar.C();
                            return;
                        }
                        byte[] bArr4 = new byte[i11];
                        rVar.readFully(bArr4, 0, i11);
                        fVar.h(i10);
                        fVar.f48023y.f47973k = new k0(1, 0, 0, bArr4);
                        return;
                    }
                    fVar.h(i10);
                    byte[] bArr5 = new byte[i11];
                    fVar.f48023y.f47972j = bArr5;
                    rVar.readFully(bArr5, 0, i11);
                    return;
                }
                fVar.h(i10);
                u3.e eVar = fVar.f48023y;
                int i25 = eVar.h;
                if (i25 != 1685485123 && i25 != 1685480259) {
                    rVar.r(i11);
                    return;
                }
                byte[] bArr6 = new byte[i11];
                eVar.P = bArr6;
                rVar.readFully(bArr6, 0, i11);
                return;
            } else if (fVar.O == 2) {
                u3.e eVar2 = (u3.e) sparseArray.get(fVar.U);
                int i26 = fVar.X;
                x xVar3 = fVar.f48015p;
                if (i26 == 4 && "V_VP9".equals(eVar2.f47967c)) {
                    xVar3.K(i11);
                    rVar.readFully(xVar3.f8298a, 0, i11);
                    return;
                }
                rVar.r(i11);
                return;
            } else {
                return;
            }
        }
        if (fVar.O == 0) {
            fVar.U = (int) gVar.b(rVar, false, true, 8);
            fVar.V = gVar.f48027c;
            fVar.Q = -9223372036854775807L;
            fVar.O = 1;
            xVar2.K(0);
        }
        u3.e eVar3 = (u3.e) sparseArray.get(fVar.U);
        if (eVar3 == null) {
            rVar.r(i11 - fVar.V);
            fVar.O = 0;
            return;
        }
        eVar3.f47964a0.getClass();
        if (fVar.O == 1) {
            fVar.l(rVar, 3);
            int i27 = (xVar2.f8298a[2] & 6) >> 1;
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
                fVar.l(rVar, 4);
                int i28 = (xVar2.f8298a[3] & 255) + 1;
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
                            fVar.l(rVar, i19);
                            int i33 = xVar2.f8298a[i32] & 255;
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
                            fVar.l(rVar, i38);
                            if (xVar2.f8298a[i36] != 0) {
                                int i39 = i23;
                                while (true) {
                                    if (i39 < 8) {
                                        int i40 = i24 << (7 - i39);
                                        i15 = i22;
                                        if ((xVar2.f8298a[i36] & i40) != 0) {
                                            int i41 = i38 + i39;
                                            fVar.l(rVar, i41);
                                            i16 = i24;
                                            j10 = xVar2.f8298a[i36] & b10 & (~i40);
                                            while (i38 < i41) {
                                                j10 = (j10 << 8) | (xVar2.f8298a[i38] & b10);
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
                                throw w0.a(null, "No valid varint length mask found");
                            }
                        } else {
                            i12 = i22;
                            i13 = i23;
                            i14 = i24;
                            fVar.T[i37] = ((i11 - fVar.V) - i36) - i35;
                            break;
                        }
                    }
                    throw w0.a(null, "EBML lacing sample size out of range.");
                } else {
                    throw w0.a(null, "Unexpected lacing value: " + i27);
                }
            }
            i12 = 2;
            i13 = 0;
            i14 = 1;
            int i43 = xVar2.f8298a[i14] & 255;
            fVar.P = fVar.n(i43 | (bArr[i13] << 8)) + fVar.M;
            if (eVar3.e != i14 && (i10 != 163 || (xVar2.f8298a[i12] & 128) != 128)) {
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
                    fVar.i(eVar3, ((fVar.R * eVar3.f47969f) / 1000) + fVar.P, fVar.W, fVar.o(rVar, eVar3, fVar.T[i44], false), 0);
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
                    iArr5[i45] = fVar.o(rVar, eVar3, iArr5[i45], true);
                    fVar.R++;
                } else {
                    return;
                }
            }
        }
    }

    public boolean l(int i10) {
        d91 d91Var = ((l91) this.f15906b).L;
        if (d91Var == null) {
            return false;
        }
        return d91Var.c(i10);
    }

    @Override
    public int m() {
        return ((s4.n0) this.f15906b).D();
    }

    @Override
    public long n(long j10, long j11) {
        return 0L;
    }

    @Override
    public int o() {
        s4.n0 n0Var = (s4.n0) this.f15906b;
        return n0Var.f46443m - n0Var.E();
    }

    @Override
    public void onComplete(Task task) {
        e0 e0Var = (e0) this.f15906b;
        if (task.isSuccessful()) {
            x8.m.L0(e0Var, true, (byte[]) task.getResult());
            return;
        }
        Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
        x8.m.L0(e0Var, false, null);
    }

    @Override
    public boolean p(l.k kVar, MenuItem menuItem) {
        m.l lVar = ((ActionMenuView) this.f15906b).P;
        if (lVar != null) {
            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((le.b) lVar).f16072b).W.f16266c).iterator();
            while (it.hasNext()) {
                if (((b0) it.next()).f3171a.p()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void q(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.f15906b).remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    @Override
    public boolean r() {
        return false;
    }

    @Override
    public boolean s() {
        return true;
    }

    @Override
    public View t(int i10) {
        return ((s4.n0) this.f15906b).q(i10);
    }

    @Override
    public boolean u(float f7) {
        return false;
    }

    @Override
    public void v() {
        int i10 = this.f15905a;
    }

    @Override
    public long w() {
        return 0L;
    }

    @Override
    public int y(View view) {
        return s4.n0.y(view) + ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).rightMargin;
    }

    @Override
    public void z(Canvas canvas) {
        hr0 hr0Var = (hr0) this.f15906b;
        canvas.drawColor(hr0Var.getThemedColor(k6.f21184d6));
        if (SharedConfig.chatBlurEnabled()) {
            hr0Var.P0.b(canvas, -3);
        }
    }

    public f(s6.g gVar, s6.a aVar) {
        this.f15905a = 22;
        this.f15906b = aVar;
    }

    public f(int i10) {
        this.f15905a = i10;
        switch (i10) {
            case 19:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f15906b = new xh0(this);
                    return;
                } else {
                    this.f15906b = new xh0(this);
                    return;
                }
            default:
                this.f15906b = new HashMap();
                return;
        }
    }

    private final void K() {
    }

    private final void M() {
    }

    @Override
    public void a() {
    }

    @Override
    public void x() {
    }

    @Override
    public void k(boolean z10) {
    }

    @Override
    public long c(long j10, long j11) {
        return j11;
    }
}
