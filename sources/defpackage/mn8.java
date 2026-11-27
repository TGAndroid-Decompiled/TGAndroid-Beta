package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PrivacyControlActivity;
public final class mn8 extends c79 {
    public final Context c;
    public final PrivacyControlActivity d;

    public mn8(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int b = f89Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b == privacyControlActivity.d0) {
            i7 = ((e) privacyControlActivity).currentAccount;
            if (!lv2.r(i7).t(3)) {
                return true;
            }
        }
        i = privacyControlActivity.currentPhotoForRestRow;
        if (b != i && b != privacyControlActivity.b0) {
            i2 = privacyControlActivity.photoForRestRow;
            if (b != i2) {
                i3 = privacyControlActivity.readRow;
                if (b != i3) {
                    i4 = privacyControlActivity.showGiftIconRow;
                    if (b != i4 && b != privacyControlActivity.g0 && b != privacyControlActivity.p0 && b != privacyControlActivity.q0 && b != privacyControlActivity.r0 && b != privacyControlActivity.o0 && b != privacyControlActivity.n0) {
                        if (privacyControlActivity.E != 12 || !privacyControlActivity.y0()) {
                            i5 = privacyControlActivity.nobodyRow;
                            if (b != i5 && b != privacyControlActivity.Q && b != privacyControlActivity.i0) {
                                i6 = privacyControlActivity.everybodyRow;
                                if (b != i6 && b != privacyControlActivity.V && b != privacyControlActivity.U) {
                                    return false;
                                }
                                return true;
                            }
                            return true;
                        }
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

    public final int E(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            long longValue = ((Long) arrayList.get(i2)).longValue();
            if (longValue > 0) {
                i++;
            } else {
                TLRPC.Chat M0 = this.d.getMessagesController().M0(Long.valueOf(-longValue));
                if (M0 != null) {
                    i += M0.participants_count;
                }
            }
        }
        return i;
    }

    @Override
    public final int b() {
        return this.d.t0;
    }

    @Override
    public final int d(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        PrivacyControlActivity privacyControlActivity = this.d;
        if (i != privacyControlActivity.U && i != privacyControlActivity.V && i != privacyControlActivity.d0 && i != privacyControlActivity.g0) {
            if (i != privacyControlActivity.W && i != privacyControlActivity.R && i != privacyControlActivity.S && i != privacyControlActivity.l0 && i != privacyControlActivity.e0 && i != privacyControlActivity.b0 && i != privacyControlActivity.f0 && i != privacyControlActivity.h0) {
                i2 = privacyControlActivity.setBirthdayRow;
                if (i != i2 && i != privacyControlActivity.m0 && i != privacyControlActivity.s0) {
                    if (i != privacyControlActivity.P && i != privacyControlActivity.j0 && i != privacyControlActivity.T && i != privacyControlActivity.c0 && i != privacyControlActivity.X) {
                        i3 = privacyControlActivity.giftTypesHeaderRow;
                        if (i != i3) {
                            i4 = privacyControlActivity.everybodyRow;
                            if (i != i4 && i != privacyControlActivity.Q) {
                                i5 = privacyControlActivity.nobodyRow;
                                if (i != i5 && i != privacyControlActivity.i0 && i != privacyControlActivity.Y && i != privacyControlActivity.Z) {
                                    if (i == privacyControlActivity.O) {
                                        return 4;
                                    }
                                    if (i != privacyControlActivity.a0) {
                                        i6 = privacyControlActivity.photoForRestRow;
                                        if (i != i6) {
                                            i7 = privacyControlActivity.currentPhotoForRestRow;
                                            if (i != i7) {
                                                i8 = privacyControlActivity.readRow;
                                                if (i != i8) {
                                                    i9 = privacyControlActivity.showGiftIconRow;
                                                    if (i != i9 && i != privacyControlActivity.p0 && i != privacyControlActivity.q0 && i != privacyControlActivity.r0 && i != privacyControlActivity.n0 && i != privacyControlActivity.o0) {
                                                        i10 = privacyControlActivity.priceRow;
                                                        if (i == i10) {
                                                            return 9;
                                                        }
                                                        if (i == privacyControlActivity.k0) {
                                                            return 10;
                                                        }
                                                        return 0;
                                                    }
                                                    return 8;
                                                }
                                                return 8;
                                            }
                                            return 7;
                                        }
                                        return 6;
                                    }
                                    return 5;
                                }
                                return 3;
                            }
                            return 3;
                        }
                        return 2;
                    }
                    return 2;
                }
                return 1;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(defpackage.f89 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn8.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        int i2;
        int i3;
        vnb vnbVar;
        vnb vnbVar2;
        vnb vnbVar3;
        View view;
        Context context = this.c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i) {
            case 0:
                qmb qmbVar = new qmb(context);
                qmbVar.setCanDisable(true);
                view = qmbVar;
                break;
            case 1:
                view = new ilb(context);
                break;
            case 2:
                view = new mf5(context);
                break;
            case 3:
                view = new i29(context, null);
                break;
            case 4:
                view = privacyControlActivity.d;
                break;
            case 5:
            default:
                view = new sca(context, (uh9) null);
                break;
            case 6:
                skb skbVar = new skb(privacyControlActivity.getParentActivity());
                privacyControlActivity.w0 = skbVar;
                if (privacyControlActivity.z0 == null) {
                    skbVar.o(2131232052, ob6.a0(null, null, 2131745245, new Object[0]), false);
                } else {
                    skbVar.o(2131232052, ob6.a0("UpdatePhotoForRest", null, 2131743472, new Object[0]), true);
                }
                privacyControlActivity.w0.setBackgroundDrawable(aob.L0(false));
                privacyControlActivity.w0.g(aob.v6, aob.u6);
                privacyControlActivity.v0 = new b29(2131623965, hl.L(50.0f), hl.L(50.0f), false, null);
                privacyControlActivity.w0.e.setTranslationX(-hl.L(8.0f));
                privacyControlActivity.w0.e.setAnimation(privacyControlActivity.v0);
                view = privacyControlActivity.w0;
                break;
            case 7:
                privacyControlActivity.x0 = new de0(privacyControlActivity.getParentActivity());
                privacyControlActivity.y0 = new au2(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.z0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.A0;
                    de0 de0Var = privacyControlActivity.x0;
                    if (photo != null) {
                        jn5 i4 = jn5.i(photoSize, photo);
                        i3 = ((e) privacyControlActivity).currentAccount;
                        de0Var.m(i4, "50_50", null, yac.h(i3).f());
                    } else {
                        jn5 e = jn5.e(photoSize.location);
                        i2 = ((e) privacyControlActivity).currentAccount;
                        de0Var.m(e, "50_50", null, yac.h(i2).f());
                    }
                }
                privacyControlActivity.y0.addView(privacyControlActivity.x0, tre.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.y0.k(ob6.M0(2131746016, null), false);
                privacyControlActivity.y0.getImageView().setVisibility(0);
                privacyControlActivity.y0.setBackgroundDrawable(aob.L0(false));
                au2 au2Var = privacyControlActivity.y0;
                int i5 = aob.p7;
                au2Var.g(i5, i5);
                view = privacyControlActivity.y0;
                break;
            case 8:
                vnbVar = ((e) privacyControlActivity).resourceProvider;
                view = new wkb(context, vnbVar);
                break;
            case 9:
                vnbVar2 = ((e) privacyControlActivity).resourceProvider;
                view = new bna(context, vnbVar2);
                break;
            case 10:
                FrameLayout frameLayout = new FrameLayout(context);
                vnbVar3 = ((e) privacyControlActivity).resourceProvider;
                c51 c51Var = new c51(vnbVar3, context, true);
                c51Var.setRoundRadius(24);
                wm2 wm2Var = new wm2(2131232248, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131746481, null));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(wm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                c51Var.i(spannableStringBuilder, false, true);
                c51Var.setOnClickListener(new jn8(this, (byte) 0));
                frameLayout.addView(c51Var, tre.d(-1, 48.0f, 119, 18.0f, 0.0f, 18.0f, 16.0f));
                view = frameLayout;
                break;
        }
        return new f89(view);
    }
}
