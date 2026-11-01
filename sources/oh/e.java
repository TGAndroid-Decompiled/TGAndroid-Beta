package oh;

import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.t8;
import org.telegram.ui.re;
import w7.b6;
public final class e {
    public final k2 f14248a;
    public final TLRPC.Chat f14249b;
    public final int f14250c;
    public FrameLayout d;
    public b e;
    public LinearLayout f14251f;
    public TextView f14252g;
    public ImageView h;
    public c f14253i;
    public TLRPC.ChatFull f14254j;
    public int f14255k;
    public int f14256l = -1;
    public d f14257m;

    public e(TLRPC.Chat chat, k2 k2Var) {
        this.f14248a = k2Var;
        this.f14249b = chat;
        this.f14250c = k2Var.getCurrentAccount();
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        if (this.d.getVisibility() == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                int i10 = this.f14256l;
                k2 k2Var = this.f14248a;
                TLRPC.Chat chat = this.f14249b;
                if (i10 == -1 && chat != null) {
                    wp messagesController = k2Var.getMessagesController();
                    long j10 = chat.f19794id;
                    this.f14256l = messagesController.f7.getInt("chatPendingRequests" + j10, 0);
                }
                int i11 = this.f14255k;
                int i12 = this.f14256l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        k2Var.getMessagesController().B4(0, chat.f19794id);
                    }
                } else {
                    return;
                }
            }
            d dVar = this.f14257m;
            if (dVar != null) {
                dVar.c(z10, z11);
            }
        }
    }

    public final FrameLayout b() {
        if (this.d == null) {
            k2 k2Var = this.f14248a;
            FrameLayout frameLayout = new FrameLayout(k2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(t6.N0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final e f14247b;

                {
                    this.f14247b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            e eVar = this.f14247b;
                            k2 k2Var2 = eVar.f14248a;
                            if (eVar.f14253i == null) {
                                eVar.f14253i = new c(eVar, k2Var2, eVar.f14249b.f19794id);
                            }
                            k2Var2.showDialog(eVar.f14253i);
                            return;
                        default:
                            e eVar2 = this.f14247b;
                            eVar2.f14248a.getMessagesController().B4(eVar2.f14255k, eVar2.f14249b.f19794id);
                            eVar2.f14256l = eVar2.f14255k;
                            eVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(k2Var.getParentActivity());
            this.f14251f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f14251f, b6.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            b bVar = new b(0, k2Var.getParentActivity(), false);
            this.e = bVar;
            bVar.setAvatarsTextSize(i0.L(18.0f));
            t8 t8Var = this.e.f30897a;
            for (int i10 = 0; i10 < t8Var.f30553c.length; i10++) {
                t8Var.j(0, 0, null);
            }
            this.f14251f.addView(this.e, b6.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(k2Var.getParentActivity());
            this.f14252g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f14252g.setGravity(16);
            this.f14252g.setSingleLine();
            this.f14252g.setText((CharSequence) null);
            a7.V(this.f14252g, t6.Te, k2Var.getResourceProvider());
            this.f14252g.setTypeface(i0.o());
            this.f14251f.addView(this.f14252g, b6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.h = new ImageView(k2Var.getParentActivity());
            int i11 = t6.f21297x7;
            int themedColor = k2Var.getThemedColor(i11);
            y h02 = t6.h0(436207615 & themedColor, 1, i0.L(14.0f));
            if ((themedColor >>> 24) == 255) {
                a7.R(this.h, h02, null, a7.h(i11, 25), k2Var.getResourceProvider());
            } else {
                this.h.setBackground(h02);
            }
            a7.t(this.h, t6.Re, k2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.h.setContentDescription(dd.L0(2131752041, null));
            this.h.setImageResource(2131231982);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final e f14247b;

                {
                    this.f14247b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            e eVar = this.f14247b;
                            k2 k2Var2 = eVar.f14248a;
                            if (eVar.f14253i == null) {
                                eVar.f14253i = new c(eVar, k2Var2, eVar.f14249b.f19794id);
                            }
                            k2Var2.showDialog(eVar.f14253i);
                            return;
                        default:
                            e eVar2 = this.f14247b;
                            eVar2.f14248a.getMessagesController().B4(eVar2.f14255k, eVar2.f14249b.f19794id);
                            eVar2.f14256l = eVar2.f14255k;
                            eVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, b6.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f14254j;
            if (chatFull != null) {
                d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void c(re reVar) {
        this.f14257m = reVar;
    }

    public final void d(int i10, List list, boolean z10) {
        if (this.d != null) {
            k2 k2Var = this.f14248a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f14249b;
                if (chat != null) {
                    k2Var.getMessagesController().B4(0, chat.f19794id);
                    this.f14256l = 0;
                }
                a(false, z10);
                this.f14255k = 0;
            } else if (this.f14255k != i10) {
                this.f14255k = i10;
                this.f14252g.setText(dd.G(i10, "JoinUsersRequests", new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User Z1 = k2Var.getMessagesController().Z1((Long) list.get(i11));
                        if (Z1 != null) {
                            this.e.b(i11, this.f14250c, Z1);
                        }
                    }
                    this.e.setCount(min);
                    this.e.a(true);
                }
            }
        }
    }
}
