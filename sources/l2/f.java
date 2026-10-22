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
import c3.i0;
import c3.t;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.d9;
import org.telegram.ui.Cells.k0;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.vh0;
import org.telegram.ui.Components.w81;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.gt0;
import org.telegram.ui.pa1;
import qg.v0;
import rg.v1;
import s4.b1;
import s4.e1;
import s4.h1;
import s4.n0;
import s4.o0;
import tc.u;
import y8.e0;
import zh.r0;
public class f implements l.i, i, cp0, ne.f, bh.h, c91, com.google.android.gms.common.api.internal.o, v1, h1, r, OnCompleteListener {
    public final int f15842a;
    public final Object f15843b;

    public f(Object obj, int i10) {
        this.f15842a = i10;
        this.f15843b = obj;
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

    public void A(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.f15843b).remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    @Override
    public int B(View view) {
        return n0.y(view) + ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).rightMargin;
    }

    public void C() {
        HashMap hashMap = (HashMap) this.f15843b;
        for (Map.Entry entry : hashMap.entrySet()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) entry.getValue());
        }
        hashMap.clear();
    }

    public s0.c D(int i10) {
        return null;
    }

    public s0.c E(int i10) {
        return null;
    }

    @Override
    public void F() {
        ((m9) this.f15843b).f28453a.invalidate();
    }

    public void G(int i10, long j10) {
        u3.f fVar = (u3.f) this.f15843b;
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
                                                fVar.f47583y.e = -1;
                                                return;
                                            }
                                            fVar.h(i10);
                                            fVar.f47583y.e = 5;
                                            return;
                                        }
                                        fVar.h(i10);
                                        fVar.f47583y.e = 3;
                                        return;
                                    }
                                    fVar.h(i10);
                                    fVar.f47583y.e = 1;
                                    return;
                                }
                                fVar.h(i10);
                                fVar.f47583y.e = 2;
                                return;
                            case 136:
                                fVar.h(i10);
                                u3.e eVar = fVar.f47583y;
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
                                fVar.f47583y.Q = (int) j10;
                                return;
                            case 176:
                                fVar.h(i10);
                                fVar.f47583y.f47536n = (int) j10;
                                return;
                            case 179:
                                if (!fVar.f47584z) {
                                    fVar.g(i10);
                                    fVar.E = fVar.n(j10);
                                    return;
                                }
                                return;
                            case 186:
                                fVar.h(i10);
                                fVar.f47583y.f47537o = (int) j10;
                                return;
                            case 215:
                                fVar.h(i10);
                                fVar.f47583y.d = (int) j10;
                                return;
                            case 231:
                                fVar.M = fVar.n(j10);
                                return;
                            case 238:
                                fVar.X = (int) j10;
                                return;
                            case 247:
                                if (!fVar.f47584z) {
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
                                fVar.f47583y.h = (int) j10;
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
                                fVar.B = j10 + fVar.f47578s;
                                return;
                            case 21432:
                                int i12 = (int) j10;
                                fVar.h(i10);
                                if (i12 != 0) {
                                    if (i12 != 1) {
                                        if (i12 != 3) {
                                            if (i12 == 15) {
                                                fVar.f47583y.f47546y = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f47583y.f47546y = 1;
                                        return;
                                    }
                                    fVar.f47583y.f47546y = 2;
                                    return;
                                }
                                fVar.f47583y.f47546y = 0;
                                return;
                            case 21680:
                                fVar.h(i10);
                                fVar.f47583y.f47539q = (int) j10;
                                return;
                            case 21682:
                                fVar.h(i10);
                                fVar.f47583y.f47541s = (int) j10;
                                return;
                            case 21690:
                                fVar.h(i10);
                                fVar.f47583y.f47540r = (int) j10;
                                return;
                            case 21930:
                                fVar.h(i10);
                                u3.e eVar2 = fVar.f47583y;
                                if (j10 == 1) {
                                    z10 = true;
                                }
                                eVar2.X = z10;
                                return;
                            case 21938:
                                fVar.h(i10);
                                u3.e eVar3 = fVar.f47583y;
                                eVar3.f47547z = true;
                                eVar3.f47538p = (int) j10;
                                return;
                            case 21998:
                                fVar.h(i10);
                                fVar.f47583y.f47530g = (int) j10;
                                return;
                            case 22186:
                                fVar.h(i10);
                                fVar.f47583y.T = j10;
                                return;
                            case 22203:
                                fVar.h(i10);
                                fVar.f47583y.U = j10;
                                return;
                            case 25188:
                                fVar.h(i10);
                                fVar.f47583y.R = (int) j10;
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
                                                fVar.f47583y.f47542t = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f47583y.f47542t = 2;
                                        return;
                                    }
                                    fVar.f47583y.f47542t = 1;
                                    return;
                                }
                                fVar.f47583y.f47542t = 0;
                                return;
                            case 2352003:
                                fVar.h(i10);
                                fVar.f47583y.f47529f = (int) j10;
                                return;
                            case 2807729:
                                fVar.f47579t = j10;
                                return;
                            default:
                                switch (i10) {
                                    case 21945:
                                        fVar.h(i10);
                                        int i14 = (int) j10;
                                        if (i14 != 1) {
                                            if (i14 == 2) {
                                                fVar.f47583y.C = 1;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f47583y.C = 2;
                                        return;
                                    case 21946:
                                        fVar.h(i10);
                                        int g10 = b2.n.g((int) j10);
                                        if (g10 != -1) {
                                            fVar.f47583y.B = g10;
                                            return;
                                        }
                                        return;
                                    case 21947:
                                        fVar.h(i10);
                                        fVar.f47583y.f47547z = true;
                                        int f7 = b2.n.f((int) j10);
                                        if (f7 != -1) {
                                            fVar.f47583y.A = f7;
                                            return;
                                        }
                                        return;
                                    case 21948:
                                        fVar.h(i10);
                                        fVar.f47583y.D = (int) j10;
                                        return;
                                    case 21949:
                                        fVar.h(i10);
                                        fVar.f47583y.E = (int) j10;
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
            } else if (!fVar.f47584z) {
                fVar.g(i10);
                if (fVar.G == -1) {
                    fVar.G = j10;
                }
            }
        } else if (!fVar.f47584z) {
            fVar.g(i10);
            if (fVar.H == -1) {
                fVar.H = j10;
            }
        }
    }

    public void H(int i10) {
        boolean z10;
        TLRPC.TL_exportedNoPaidMessagesToken c10;
        r0 r0Var = ((zh.n0) this.f15843b).e;
        if (r0Var != null) {
            int i11 = r0Var.f52096a;
            if (r0Var.d != i10) {
                boolean z11 = true;
                if (r0Var.f52098c.d && i10 == 2) {
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
                    if (r0Var.f52100n != 0) {
                        ConnectionsManager.getInstance(i11).cancelRequest(r0Var.f52100n, true);
                        r0Var.f52100n = 0;
                        return;
                    }
                    return;
                }
                if (i12 == 2 && (c10 = r0Var.c()) != null) {
                    r0Var.f52099f = c10;
                    r0Var.f52097b.setFreeLink(r0Var.d(c10));
                }
                if (r0Var.d != 1) {
                    z11 = false;
                }
                r0Var.l(false, z11);
            }
        }
    }

    public void I(float f7) {
        e91 e91Var = (e91) this.f15843b;
        if (f7 == 1.0f) {
            View[] viewArr = e91Var.e;
            View[] viewArr2 = e91Var.e;
            if (viewArr[1] != null) {
                e91Var.F();
                e91Var.h.put(e91Var.f25867f[1], viewArr2[1]);
                e91Var.removeView(viewArr2[1]);
                e91Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            e91Var.z(e91Var.f25865b);
            return;
        }
        View[] viewArr3 = e91Var.e;
        View[] viewArr4 = e91Var.e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (e91Var.f25873y) {
            e91Var.E(view, (1.0f - f7) * viewArr3[0].getMeasuredWidth());
            View view2 = viewArr4[0];
            e91Var.E(view2, (-view2.getMeasuredWidth()) * f7);
        } else {
            e91Var.E(view, (1.0f - f7) * (-viewArr3[0].getMeasuredWidth()));
            View view3 = viewArr4[0];
            e91Var.E(view3, view3.getMeasuredWidth() * f7);
        }
        e91Var.w(false);
    }

    @Override
    public void J(bh.a aVar) {
        aVar.a(((fr0) this.f15843b).getThemedColor(h6.f20993d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public void L(float f7, boolean z10) {
        int i10 = this.f15842a;
        Object obj = this.f15843b;
        switch (i10) {
            case 5:
                ng.h hVar = (ng.h) obj;
                float f10 = hVar.f17460b;
                float y3 = k3.y(hVar.f17461c, f10, f7, f10);
                hVar.d = y3;
                if (z10) {
                    s6 s6Var = hVar.e;
                    s6Var.getClass();
                    s6Var.c(null, y3);
                }
                hVar.invalidate();
                return;
            default:
                pa1 pa1Var = (pa1) ((k0) obj);
                int i11 = (int) (h6.f21224q * 100.0f);
                int i12 = (int) (f7 * 100.0f);
                h6.f21224q = f7;
                if (i11 != i12) {
                    ThemeActivity themeActivity = pa1Var.e.e;
                    tl0 tl0Var = (tl0) themeActivity.f33902b.K(themeActivity.f33909f0);
                    if (tl0Var != null) {
                        ((d9) tl0Var.f45920a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (h6.f21224q * 100.0f))));
                    }
                    h6.E(true);
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
        RecyclerView recyclerView = (RecyclerView) this.f15843b;
        recyclerView.f3603b.k(b1Var);
        recyclerView.h(b1Var);
        b1Var.q(false);
        e1 e1Var = (e1) recyclerView.f3606c0;
        e1Var.getClass();
        int i13 = u0Var.f4053a;
        int i14 = u0Var.f4054b;
        View view = b1Var.f45920a;
        if (u0Var2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = u0Var2.f4053a;
        }
        int i15 = i10;
        if (u0Var2 == null) {
            i11 = view.getTop();
        } else {
            i11 = u0Var2.f4054b;
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
            b1Var.f45925i = (b1Var.h - i18) + (i18 * 1000);
            e1Var.s(b1Var, u0Var);
            z10 = true;
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    public void Q(int i10, long j10, long j11) {
        u3.f fVar = (u3.f) this.f15843b;
        fVar.f47569j0.getClass();
        if (i10 != 160) {
            if (i10 != 174) {
                if (i10 != 183) {
                    if (i10 != 187) {
                        if (i10 != 19899) {
                            if (i10 != 20533) {
                                if (i10 != 21968) {
                                    if (i10 != 408125543) {
                                        if (i10 != 475249515) {
                                            if (i10 == 524531317 && !fVar.f47584z) {
                                                if (fVar.d && fVar.K != -1) {
                                                    fVar.J = true;
                                                    return;
                                                }
                                                fVar.f47569j0.g0(new t(fVar.v));
                                                fVar.f47584z = true;
                                                return;
                                            }
                                            return;
                                        } else if (!fVar.f47584z) {
                                            fVar.D = true;
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    long j12 = fVar.f47578s;
                                    if (j12 != -1 && j12 != j10) {
                                        throw w0.a(null, "Multiple Segment elements not supported");
                                    }
                                    fVar.f47578s = j10;
                                    fVar.f47577r = j11;
                                    return;
                                }
                                fVar.h(i10);
                                fVar.f47583y.f47547z = true;
                                return;
                            }
                            fVar.h(i10);
                            fVar.f47583y.f47531i = true;
                            return;
                        }
                        fVar.A = -1;
                        fVar.B = -1L;
                        return;
                    } else if (!fVar.f47584z) {
                        fVar.g(i10);
                        fVar.E = -9223372036854775807L;
                        return;
                    } else {
                        return;
                    }
                } else if (!fVar.f47584z) {
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
            obj.f47536n = -1;
            obj.f47537o = -1;
            obj.f47538p = -1;
            obj.f47539q = -1;
            obj.f47540r = -1;
            obj.f47541s = 0;
            obj.f47542t = -1;
            obj.f47543u = 0.0f;
            obj.v = 0.0f;
            obj.f47544w = 0.0f;
            obj.f47545x = null;
            obj.f47546y = -1;
            obj.f47547z = false;
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
            fVar.f47583y = obj;
            obj.f47523a = fVar.f47581w;
            return;
        }
        fVar.Y = false;
        fVar.Z = 0L;
    }

    public void R(int i10, String str) {
        u3.f fVar = (u3.f) this.f15843b;
        if (i10 != 134) {
            if (i10 != 17026) {
                if (i10 != 21358) {
                    if (i10 != 2274716) {
                        return;
                    }
                    fVar.h(i10);
                    fVar.f47583y.Z = str;
                    return;
                }
                fVar.h(i10);
                fVar.f47583y.f47525b = str;
                return;
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw w0.a(null, "DocType " + str + " not supported");
            } else {
                fVar.f47581w = str.equals("webm");
                return;
            }
        }
        fVar.h(i10);
        fVar.f47583y.f47527c = str;
    }

    public void S(b1 b1Var) {
        RecyclerView recyclerView = (RecyclerView) this.f15843b;
        n0 n0Var = recyclerView.f3631x;
        View view = b1Var.f45920a;
        qf.e eVar = recyclerView.f3603b;
        g3 g3Var = n0Var.f46012a;
        t1 t1Var = (t1) g3Var.f16202b;
        int indexOfChild = ((RecyclerView) t1Var.f15525b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((ad.d) g3Var.f16203c).F(indexOfChild)) {
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
            synchronized (((u) this.f15843b).f46978c) {
            }
            throw new tc.n(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), aVar);
        }
    }

    @Override
    public void U(float f7) {
        gt0 gt0Var = (gt0) this.f15843b;
        v0.e(gt0Var.P1).k(String.valueOf(qg.m.f44564a.indexOf(gt0Var.W0.getCurrentBrush())), f7);
        qg.t1 t1Var = gt0Var.K1;
        t1Var.f44662c = f7;
        gt0Var.t0(t1Var, null);
    }

    public Object V() {
        if (n7.a.f17254b == null) {
            n7.a.f17254b = new Exception();
        }
        synchronized (n7.a.f17253a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override
    public int Y() {
        switch (this.f15842a) {
            case 5:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public long a(long j10) {
        return 0L;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        s6.f fVar = new s6.f(0, (TaskCompletionSource) obj2);
        s6.e eVar = (s6.e) ((s6.h) obj).u();
        Parcel H0 = eVar.H0();
        k7.a.d(H0, fVar);
        k7.a.c(H0, (s6.a) this.f15843b);
        eVar.I0(H0, 1);
    }

    @Override
    public void b(Canvas canvas) {
        fr0 fr0Var = (fr0) this.f15843b;
        canvas.drawColor(fr0Var.getThemedColor(h6.f20993d6));
        if (SharedConfig.chatBlurEnabled()) {
            fr0Var.P0.b(canvas, -3);
        }
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
        return (m2.j) this.f15843b;
    }

    @Override
    public float get() {
        gt0 gt0Var = (gt0) this.f15843b;
        int i10 = gt0Var.P1;
        qg.m currentBrush = gt0Var.W0.getCurrentBrush();
        if (currentBrush == null) {
            return v0.e(i10).f44685i;
        }
        return v0.e(i10).f(String.valueOf(qg.m.f44564a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f15842a) {
            case 5:
                ng.h hVar = (ng.h) this.f15843b;
                float f7 = hVar.f17460b;
                return String.valueOf(Math.round((hVar.f17459a.getProgress() * (hVar.f17461c - f7)) + f7));
            default:
                return " ";
        }
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public int j(View view) {
        return n0.x(view) - ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).leftMargin;
    }

    @Override
    public boolean k(float f7) {
        return false;
    }

    @Override
    public int l() {
        return ((n0) this.f15843b).D();
    }

    @Override
    public void n(l.k kVar) {
        k2.w0 w0Var = ((ActionMenuView) this.f15843b).K;
        if (w0Var != null) {
            w0Var.n(kVar);
        }
    }

    @Override
    public void o(Object obj) {
        ((g8.c) obj).onLocationResult((LocationResult) this.f15843b);
    }

    @Override
    public void onComplete(Task task) {
        e0 e0Var = (e0) this.f15843b;
        if (task.isSuccessful()) {
            x8.m.L0(e0Var, true, (byte[]) task.getResult());
            return;
        }
        Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
        x8.m.L0(e0Var, false, null);
    }

    @Override
    public long p(long j10, long j11) {
        return 0L;
    }

    @Override
    public boolean q(l.k kVar, MenuItem menuItem) {
        m.l lVar = ((ActionMenuView) this.f15843b).P;
        if (lVar != null) {
            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((le.b) lVar).f16009b).W.f16203c).iterator();
            while (it.hasNext()) {
                if (((b0) it.next()).f3164a.p()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int r() {
        n0 n0Var = (n0) this.f15843b;
        return n0Var.f46021m - n0Var.E();
    }

    @Override
    public boolean s() {
        return true;
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
        u3.f fVar = (u3.f) this.f15843b;
        u3.g gVar = fVar.f47555b;
        SparseArray sparseArray = fVar.f47557c;
        x xVar = fVar.f47570k;
        x xVar2 = fVar.f47566i;
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
                                        fVar.f47583y.f47545x = bArr2;
                                        pVar.readFully(bArr2, 0, i11);
                                        return;
                                    }
                                    throw w0.a(null, "Unexpected id: " + i10);
                                }
                                fVar.h(i10);
                                byte[] bArr3 = new byte[i11];
                                fVar.f47583y.f47534l = bArr3;
                                pVar.readFully(bArr3, 0, i11);
                                return;
                            }
                            Arrays.fill(xVar.f8291a, (byte) 0);
                            pVar.readFully(xVar.f8291a, 4 - i11, i11);
                            xVar.N(0);
                            fVar.A = (int) xVar.C();
                            return;
                        }
                        byte[] bArr4 = new byte[i11];
                        pVar.readFully(bArr4, 0, i11);
                        fVar.h(i10);
                        fVar.f47583y.f47533k = new i0(1, 0, 0, bArr4);
                        return;
                    }
                    fVar.h(i10);
                    byte[] bArr5 = new byte[i11];
                    fVar.f47583y.f47532j = bArr5;
                    pVar.readFully(bArr5, 0, i11);
                    return;
                }
                fVar.h(i10);
                u3.e eVar = fVar.f47583y;
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
                x xVar3 = fVar.f47575p;
                if (i26 == 4 && "V_VP9".equals(eVar2.f47527c)) {
                    xVar3.K(i11);
                    pVar.readFully(xVar3.f8291a, 0, i11);
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
            fVar.V = gVar.f47587c;
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
        eVar3.f47524a0.getClass();
        if (fVar.O == 1) {
            fVar.l(pVar, 3);
            int i27 = (xVar2.f8291a[2] & 6) >> 1;
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
                int i28 = (xVar2.f8291a[3] & 255) + 1;
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
                            int i33 = xVar2.f8291a[i32] & 255;
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
                            if (xVar2.f8291a[i36] != 0) {
                                int i39 = i23;
                                while (true) {
                                    if (i39 < 8) {
                                        int i40 = i24 << (7 - i39);
                                        i15 = i22;
                                        if ((xVar2.f8291a[i36] & i40) != 0) {
                                            int i41 = i38 + i39;
                                            fVar.l(pVar, i41);
                                            i16 = i24;
                                            j10 = xVar2.f8291a[i36] & b10 & (~i40);
                                            while (i38 < i41) {
                                                j10 = (j10 << 8) | (xVar2.f8291a[i38] & b10);
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
            int i43 = xVar2.f8291a[i14] & 255;
            fVar.P = fVar.n(i43 | (bArr[i13] << 8)) + fVar.M;
            if (eVar3.e != i14 && (i10 != 163 || (xVar2.f8291a[i12] & 128) != 128)) {
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
                    fVar.i(eVar3, ((fVar.R * eVar3.f47529f) / 1000) + fVar.P, fVar.W, fVar.o(pVar, eVar3, fVar.T[i44], false), 0);
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
    public void v() {
        int i10 = this.f15842a;
    }

    @Override
    public long w(long j10) {
        return 1L;
    }

    @Override
    public View x(int i10) {
        return ((n0) this.f15843b).q(i10);
    }

    @Override
    public long y(long j10, long j11) {
        return 1L;
    }

    public boolean z(int i10) {
        w81 w81Var = ((e91) this.f15843b).L;
        if (w81Var == null) {
            return false;
        }
        return w81Var.c(i10);
    }

    public f(s6.g gVar, s6.a aVar) {
        this.f15842a = 22;
        this.f15843b = aVar;
    }

    public f(int i10) {
        this.f15842a = i10;
        switch (i10) {
            case 19:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f15843b = new vh0(this);
                    return;
                } else {
                    this.f15843b = new vh0(this);
                    return;
                }
            default:
                this.f15843b = new HashMap();
                return;
        }
    }

    private final void K() {
    }

    private final void M() {
    }

    @Override
    public void c() {
    }

    @Override
    public void m() {
    }

    @Override
    public void h(boolean z10) {
    }

    @Override
    public long d(long j10, long j11) {
        return j11;
    }
}
