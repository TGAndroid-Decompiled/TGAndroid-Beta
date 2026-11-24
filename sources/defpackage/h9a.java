package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.SessionsActivity;
public final class h9a extends q59 {
    public final Context c;
    public final SessionsActivity d;

    public h9a(SessionsActivity sessionsActivity, Context context) {
        this.d = sessionsActivity;
        this.c = context;
        C(true);
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i;
        int i2;
        int b = u69Var.b();
        SessionsActivity sessionsActivity = this.d;
        i = sessionsActivity.terminateAllSessionsRow;
        if (b != i) {
            if (b < sessionsActivity.K || b >= sessionsActivity.L) {
                if (b < sessionsActivity.M || b >= sessionsActivity.N) {
                    if ((b < sessionsActivity.G || b >= sessionsActivity.H) && b != sessionsActivity.y) {
                        i2 = sessionsActivity.ttlRow;
                        if (b != i2) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.d.S;
    }

    @Override
    public final long c(int i) {
        int i2;
        int i3;
        int hash;
        SessionsActivity sessionsActivity = this.d;
        i2 = sessionsActivity.terminateAllSessionsRow;
        if (i == i2) {
            hash = Objects.hash(0, 0);
        } else if (i == sessionsActivity.E) {
            hash = Objects.hash(0, 1);
        } else if (i == sessionsActivity.O) {
            hash = Objects.hash(0, 2);
        } else if (i == sessionsActivity.I) {
            hash = Objects.hash(0, 3);
        } else if (i == sessionsActivity.R) {
            hash = Objects.hash(0, 4);
        } else if (i == sessionsActivity.U) {
            hash = Objects.hash(0, 5);
        } else if (i == sessionsActivity.P) {
            hash = Objects.hash(0, 6);
        } else if (i == sessionsActivity.x) {
            hash = Objects.hash(0, 7);
        } else if (i == sessionsActivity.J) {
            hash = Objects.hash(0, 8);
        } else if (i == sessionsActivity.F) {
            hash = Objects.hash(0, 9);
        } else if (i == sessionsActivity.T) {
            hash = Objects.hash(0, 10);
        } else if (i == sessionsActivity.y) {
            hash = Objects.hash(0, 11);
        } else {
            int i4 = sessionsActivity.K;
            if (i >= i4 && i < sessionsActivity.L) {
                TLObject tLObject = (TLObject) sessionsActivity.d.get(i - i4);
                if (tLObject instanceof TLRPC.TL_authorization) {
                    hash = Objects.hash(1, Long.valueOf(((TLRPC.TL_authorization) tLObject).hash));
                } else {
                    if (tLObject instanceof TLRPC.TL_webAuthorization) {
                        hash = Objects.hash(1, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject).hash));
                    }
                    hash = Objects.hash(0, -1);
                }
            } else {
                int i5 = sessionsActivity.M;
                if (i >= i5 && i < sessionsActivity.N) {
                    hash = Objects.hash(3, Long.valueOf(((TL_account.TL_connectedBot) sessionsActivity.f.get(i - i5)).bot_id));
                } else {
                    int i6 = sessionsActivity.G;
                    if (i >= i6 && i < sessionsActivity.H) {
                        TLObject tLObject2 = (TLObject) sessionsActivity.e.get(i - i6);
                        if (tLObject2 instanceof TLRPC.TL_authorization) {
                            hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_authorization) tLObject2).hash));
                        } else {
                            if (tLObject2 instanceof TLRPC.TL_webAuthorization) {
                                hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject2).hash));
                            }
                            hash = Objects.hash(0, -1);
                        }
                    } else if (i != sessionsActivity.Q) {
                        i3 = sessionsActivity.ttlRow;
                        if (i == i3) {
                            hash = Objects.hash(0, 13);
                        }
                        hash = Objects.hash(0, -1);
                    } else {
                        hash = Objects.hash(0, 12);
                    }
                }
            }
        }
        return hash;
    }

    @Override
    public final int d(int i) {
        int i2;
        int i3;
        SessionsActivity sessionsActivity = this.d;
        i2 = sessionsActivity.terminateAllSessionsRow;
        if (i != i2) {
            if (i != sessionsActivity.E && i != sessionsActivity.O && i != sessionsActivity.I && i != sessionsActivity.R && i != sessionsActivity.U && i != sessionsActivity.P) {
                if (i != sessionsActivity.x && i != sessionsActivity.J && i != sessionsActivity.F && i != sessionsActivity.T) {
                    if (i != sessionsActivity.y) {
                        if (i < sessionsActivity.K || i >= sessionsActivity.L) {
                            if (i < sessionsActivity.M || i >= sessionsActivity.N) {
                                if (i < sessionsActivity.G || i >= sessionsActivity.H) {
                                    if (i != sessionsActivity.Q) {
                                        i3 = sessionsActivity.ttlRow;
                                        if (i == i3) {
                                            return 6;
                                        }
                                        return 0;
                                    }
                                    return 5;
                                }
                                return 4;
                            }
                            return 4;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        int i2;
        String G;
        int i3 = u69Var.f;
        boolean z = false;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 5) {
                        View view = u69Var.a;
                        if (i3 != 6) {
                            q7a q7aVar = (q7a) view;
                            SessionsActivity sessionsActivity = this.d;
                            if (i == sessionsActivity.y) {
                                TLRPC.TL_authorization tL_authorization = sessionsActivity.h;
                                if (tL_authorization == null) {
                                    tL_authorization = new TLRPC.TL_authorization();
                                    tL_authorization.flags = 1;
                                    tL_authorization.current = true;
                                    tL_authorization.platform = "Android";
                                    tL_authorization.device_model = Build.MANUFACTURER + " " + Build.MODEL;
                                    StringBuilder sb = new StringBuilder("SDK ");
                                    sb.append(Build.VERSION.SDK_INT);
                                    tL_authorization.system_version = sb.toString();
                                    tL_authorization.app_name = "Telegram Android";
                                    tL_authorization.app_version = "";
                                    try {
                                        PackageInfo packageInfo = a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0);
                                        tL_authorization.app_version = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                                        boolean z2 = e21.a;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(tL_authorization.app_version);
                                        sb2.append(" beta");
                                        tL_authorization.app_version = sb2.toString();
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                    }
                                    tL_authorization.country = "";
                                    tL_authorization.region = "";
                                    tL_authorization.ip = "";
                                }
                                if (!this.d.d.isEmpty() || !this.d.e.isEmpty() || this.d.Q != -1) {
                                    z = true;
                                }
                                q7aVar.c(tL_authorization, z);
                                return;
                            }
                            int i4 = sessionsActivity.K;
                            if (i >= i4 && i < sessionsActivity.L) {
                                TLObject tLObject = (TLObject) sessionsActivity.d.get(i - i4);
                                if (i != this.d.L - 1) {
                                    z = true;
                                }
                                q7aVar.c(tLObject, z);
                                return;
                            }
                            int i5 = sessionsActivity.M;
                            if (i >= i5 && i < sessionsActivity.N) {
                                int i6 = i - i5;
                                ArrayList arrayList = sessionsActivity.f;
                                if (arrayList != null && i6 >= 0 && i6 < arrayList.size()) {
                                    TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.d.f.get(i6);
                                    SessionsActivity sessionsActivity2 = this.d;
                                    if (i != sessionsActivity2.N - 1 && i != sessionsActivity2.L - 1) {
                                        z = true;
                                    }
                                    q7aVar.c(tL_connectedBot, z);
                                    return;
                                }
                                return;
                            }
                            int i7 = sessionsActivity.G;
                            if (i >= i7 && i < sessionsActivity.H) {
                                TLObject tLObject2 = (TLObject) sessionsActivity.e.get(i - i7);
                                if (i != this.d.H - 1) {
                                    z = true;
                                }
                                q7aVar.c(tLObject2, z);
                                return;
                            }
                            return;
                        }
                        vkb vkbVar = (vkb) view;
                        int i8 = this.d.s;
                        if (i8 > 30 && i8 <= 183) {
                            G = jb6.G(i8 / 30, "Months", new Object[0]);
                        } else if (i8 == 365) {
                            G = jb6.G(i8 / 365, "Years", new Object[0]);
                        } else {
                            G = jb6.G(i8 / 7, "Weeks", new Object[0]);
                        }
                        vkbVar.c(jb6.M0(2131749029, null), G, true, false);
                        return;
                    }
                    return;
                }
                jf5 jf5Var = (jf5) u69Var.a;
                SessionsActivity sessionsActivity3 = this.d;
                if (i == sessionsActivity3.x) {
                    jf5Var.setText(jb6.M0(2131751630, null));
                    return;
                } else if (i == sessionsActivity3.J) {
                    if (!sessionsActivity3.w) {
                        jf5Var.setText(jb6.M0(2131747499, null));
                        return;
                    } else {
                        jf5Var.setText(jb6.M0(2131747496, null));
                        return;
                    }
                } else if (i == sessionsActivity3.F) {
                    jf5Var.setText(jb6.M0(2131748496, null));
                    return;
                } else if (i == sessionsActivity3.T) {
                    jf5Var.setText(jb6.M0(2131743891, null));
                    return;
                } else {
                    return;
                }
            }
            njb njbVar = (njb) u69Var.a;
            njbVar.setFixedSize(0);
            SessionsActivity sessionsActivity4 = this.d;
            if (i == sessionsActivity4.E) {
                if (!sessionsActivity4.w) {
                    njbVar.setText(jb6.M0(2131752011, null));
                    return;
                } else {
                    njbVar.setText(jb6.M0(2131752010, null));
                    return;
                }
            } else if (i == sessionsActivity4.O) {
                if (!sessionsActivity4.w) {
                    if (sessionsActivity4.d.isEmpty()) {
                        njbVar.setText("");
                        return;
                    } else {
                        njbVar.setText(jb6.M0(2131745288, null));
                        return;
                    }
                }
                njbVar.setText(jb6.M0(2131743888, null));
                return;
            } else if (i == sessionsActivity4.I) {
                njbVar.setText(jb6.M0(2131748495, null));
                return;
            } else if (i == sessionsActivity4.R || i == sessionsActivity4.U || i == sessionsActivity4.P) {
                njbVar.setText("");
                njbVar.setFixedSize(12);
                return;
            } else {
                return;
            }
        }
        xib xibVar = (xib) u69Var.a;
        i2 = this.d.terminateAllSessionsRow;
        if (i == i2) {
            int i9 = cmb.o7;
            xibVar.g(i9, i9);
            xibVar.setTag(Integer.valueOf(i9));
            if (!this.d.w) {
                xibVar.o(2131232074, jb6.M0(2131743893, null), false);
            } else {
                xibVar.o(2131232074, jb6.M0(2131743892, null), false);
            }
        } else if (i == this.d.Q) {
            int i10 = cmb.p6;
            xibVar.g(i10, i10);
            xibVar.setTag(Integer.valueOf(i10));
            xibVar.o(2131232326, jb6.M0(2131753859, null), !this.d.d.isEmpty());
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        int i9;
        float f2;
        int i10;
        float f3;
        int i11;
        int i12;
        float f4;
        int i13;
        float f5;
        int i14;
        int i15;
        int i16;
        int i17;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    SessionsActivity sessionsActivity = this.d;
                    if (i != 5) {
                        if (i != 6) {
                            boolean z = sessionsActivity.w;
                            ?? frameLayout2 = new FrameLayout(context);
                            frameLayout2.s = new ln((View) frameLayout2);
                            frameLayout2.x = z8c.t0;
                            LinearLayout linearLayout = new LinearLayout(context);
                            frameLayout2.w = linearLayout;
                            int i18 = 0;
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            frameLayout2.a = z;
                            int i19 = 72;
                            int i20 = 15;
                            int i21 = 21;
                            int i22 = 3;
                            if (z) {
                                boolean z2 = jb6.a0;
                                if (z2) {
                                    i14 = 5;
                                } else {
                                    i14 = 3;
                                }
                                int i23 = i14 | 48;
                                if (z2) {
                                    i15 = 15;
                                } else {
                                    i15 = 49;
                                }
                                float f6 = i15;
                                if (z2) {
                                    i20 = 49;
                                }
                                frameLayout2.addView(linearLayout, qoe.d(-1, 30.0f, i23, f6, 11.0f, i20, 0.0f));
                                pc0 pc0Var = new pc0((ylb) null);
                                frameLayout2.n = pc0Var;
                                pc0Var.s(gm.L(10.0f));
                                bf0 bf0Var = new bf0(context);
                                frameLayout2.h = bf0Var;
                                bf0Var.setRoundRadius(gm.L(10.0f));
                                boolean z3 = jb6.a0;
                                if (z3) {
                                    i16 = 5;
                                } else {
                                    i16 = 3;
                                }
                                int i24 = i16 | 48;
                                if (z3) {
                                    i17 = 0;
                                } else {
                                    i17 = 21;
                                }
                                float f7 = i17;
                                if (z3) {
                                    i18 = 21;
                                }
                                frameLayout2.addView(bf0Var, qoe.d(20, 20.0f, i24, f7, 13.0f, i18, 0.0f));
                            } else {
                                bf0 bf0Var2 = new bf0(context);
                                frameLayout2.f = bf0Var2;
                                bf0Var2.setRoundRadius(gm.L(10.0f));
                                boolean z4 = jb6.a0;
                                if (z4) {
                                    i2 = 5;
                                } else {
                                    i2 = 3;
                                }
                                int i25 = i2 | 48;
                                if (z4) {
                                    i3 = 0;
                                } else {
                                    i3 = 16;
                                }
                                float f8 = i3;
                                if (z4) {
                                    i4 = 16;
                                } else {
                                    i4 = 0;
                                }
                                frameLayout2.addView(bf0Var2, qoe.d(42, 42.0f, i25, f8, 9.0f, i4, 0.0f));
                                frameLayout2.n = new pc0((ylb) null);
                                bf0 bf0Var3 = new bf0(context);
                                frameLayout2.h = bf0Var3;
                                bf0Var3.setRoundRadius(gm.L(10.0f));
                                boolean z5 = jb6.a0;
                                if (z5) {
                                    i5 = 5;
                                } else {
                                    i5 = 3;
                                }
                                int i26 = i5 | 48;
                                if (z5) {
                                    i6 = 0;
                                } else {
                                    i6 = 16;
                                }
                                float f9 = i6;
                                if (z5) {
                                    i18 = 16;
                                }
                                frameLayout2.addView(bf0Var3, qoe.d(42, 42.0f, i26, f9, 9.0f, i18, 0.0f));
                                boolean z6 = jb6.a0;
                                if (z6) {
                                    i7 = 5;
                                } else {
                                    i7 = 3;
                                }
                                int i27 = i7 | 48;
                                if (z6) {
                                    i8 = 15;
                                } else {
                                    i8 = 72;
                                }
                                float f10 = i8;
                                if (z6) {
                                    i20 = 72;
                                }
                                frameLayout2.addView(linearLayout, qoe.d(-1, 30.0f, i27, f10, 6.333f, i20, 0.0f));
                            }
                            TextView textView = new TextView(context);
                            frameLayout2.b = textView;
                            int i28 = cmb.F6;
                            anb.X(textView, i28, null);
                            if (!z) {
                                f = 15.0f;
                            } else {
                                f = 16.0f;
                            }
                            textView.setTextSize(1, f);
                            textView.setLines(1);
                            textView.setTypeface(gm.o());
                            textView.setMaxLines(1);
                            textView.setSingleLine(true);
                            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                            textView.setEllipsize(truncateAt);
                            if (jb6.a0) {
                                i9 = 5;
                            } else {
                                i9 = 3;
                            }
                            textView.setGravity(i9 | 48);
                            TextView textView2 = new TextView(context);
                            frameLayout2.c = textView2;
                            float f11 = 13.0f;
                            if (!z) {
                                f2 = 12.0f;
                            } else {
                                f2 = 13.0f;
                            }
                            textView2.setTextSize(1, f2);
                            if (jb6.a0) {
                                i10 = 3;
                            } else {
                                i10 = 5;
                            }
                            textView2.setGravity(i10 | 48);
                            if (jb6.a0) {
                                linearLayout.addView(textView2, qoe.t(-2, -1, 51, 0, 2, 0, 0));
                                linearLayout.addView(textView, qoe.q(0, -1, 1.0f, 53, 10, 0, 0, 0));
                            } else {
                                linearLayout.addView(textView, qoe.q(0, -1, 1.0f, 51, 0, 0, 10, 0));
                                linearLayout.addView(textView2, qoe.t(-2, -1, 53, 0, 2, 0, 0));
                            }
                            if (jb6.a0) {
                                if (z) {
                                    i19 = 21;
                                }
                            } else {
                                if (z) {
                                    i19 = 21;
                                }
                                i21 = i19;
                                i19 = 21;
                            }
                            TextView textView3 = new TextView(context);
                            frameLayout2.d = textView3;
                            anb.X(textView3, i28, null);
                            if (!z) {
                                f3 = 13.0f;
                            } else {
                                f3 = 14.0f;
                            }
                            wi8.w(textView3, 1, f3, 1, 1);
                            textView3.setSingleLine(true);
                            textView3.setEllipsize(truncateAt);
                            if (jb6.a0) {
                                i11 = 5;
                            } else {
                                i11 = 3;
                            }
                            textView3.setGravity(i11 | 48);
                            if (jb6.a0) {
                                i12 = 5;
                            } else {
                                i12 = 3;
                            }
                            int i29 = i12 | 48;
                            float f12 = i21;
                            if (!z) {
                                f4 = 28.0f;
                            } else {
                                f4 = 36.0f;
                            }
                            float f13 = i19;
                            frameLayout2.addView(textView3, qoe.d(-1, -2.0f, i29, f12, f4, f13, 0.0f));
                            TextView textView4 = new TextView(context);
                            frameLayout2.e = textView4;
                            anb.X(textView4, cmb.z6, null);
                            if (z) {
                                f11 = 14.0f;
                            }
                            wi8.w(textView4, 1, f11, 1, 1);
                            textView4.setSingleLine(true);
                            textView4.setEllipsize(truncateAt);
                            if (jb6.a0) {
                                i13 = 5;
                            } else {
                                i13 = 3;
                            }
                            textView4.setGravity(i13 | 48);
                            if (jb6.a0) {
                                i22 = 5;
                            }
                            int i30 = i22 | 48;
                            if (!z) {
                                f5 = 46.0f;
                            } else {
                                f5 = 59.0f;
                            }
                            frameLayout2.addView(textView4, qoe.d(-1, -2.0f, i30, f12, f5, f13, 0.0f));
                            frameLayout = frameLayout2;
                        } else {
                            frameLayout = new vkb(context);
                        }
                    } else {
                        frameLayout = new i9a(sessionsActivity, context);
                    }
                } else {
                    frameLayout = new jf5(context);
                }
            } else {
                frameLayout = new njb(context);
            }
        } else {
            frameLayout = new xib(context);
        }
        return new u69(frameLayout);
    }
}
