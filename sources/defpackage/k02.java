package defpackage;

import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class k02 {
    public final d a;
    public final TLRPC.Chat b;
    public final int c;
    public FrameLayout d;
    public h02 e;
    public LinearLayout f;
    public TextView g;
    public ImageView h;
    public i02 i;
    public TLRPC.ChatFull j;
    public int k;
    public int l = -1;
    public j02 m;

    public k02(d dVar, TLRPC.Chat chat) {
        this.a = dVar;
        this.b = chat;
        this.c = dVar.getCurrentAccount();
    }

    public final void a(boolean z, boolean z2) {
        boolean z3;
        if (this.d.getVisibility() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z != z3) {
            if (z) {
                int i = this.l;
                d dVar = this.a;
                TLRPC.Chat chat = this.b;
                if (i == -1 && chat != null) {
                    oc7 messagesController = dVar.getMessagesController();
                    long j = chat.id;
                    i = messagesController.X3.getInt("chatPendingRequests" + j, 0);
                    this.l = i;
                }
                if (this.k != i) {
                    if (i != 0 && chat != null) {
                        dVar.getMessagesController().L4(0, chat.id);
                    }
                } else {
                    return;
                }
            }
            j02 j02Var = this.m;
            if (j02Var != null) {
                j02Var.e(z, z2);
            }
        }
    }

    public final FrameLayout b() {
        if (this.d == null) {
            d dVar = this.a;
            FrameLayout frameLayout = new FrameLayout(dVar.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(cmb.L0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final k02 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    k02 k02Var = this.b;
                    switch (b) {
                        case 0:
                            d dVar2 = k02Var.a;
                            i02 i02Var = k02Var.i;
                            if (i02Var == null) {
                                i02Var = new i02(k02Var, dVar2, k02Var.b.id);
                                k02Var.i = i02Var;
                            }
                            dVar2.showDialog(i02Var);
                            return;
                        default:
                            k02Var.a.getMessagesController().L4(k02Var.k, k02Var.b.id);
                            k02Var.l = k02Var.k;
                            k02Var.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(dVar.getParentActivity());
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f, qoe.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            h02 h02Var = new h02((byte) 0, dVar.getParentActivity(), false);
            this.e = h02Var;
            h02Var.setAvatarsTextSize(gm.L(18.0f));
            gd0 gd0Var = this.e.a;
            for (int i = 0; i < gd0Var.c.length; i++) {
                gd0Var.j(0, 0, null);
            }
            this.f.addView(this.e, qoe.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(dVar.getParentActivity());
            this.g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.g.setGravity(16);
            this.g.setSingleLine();
            this.g.setText((CharSequence) null);
            anb.X(this.g, cmb.Ve, dVar.getResourceProvider());
            this.g.setTypeface(gm.o());
            this.f.addView(this.g, qoe.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.h = new ImageView(dVar.getParentActivity());
            int i2 = cmb.w7;
            int themedColor = dVar.getThemedColor(i2);
            fg0 f0 = cmb.f0(436207615 & themedColor, 1, gm.L(14.0f));
            int i3 = themedColor >>> 24;
            ImageView imageView = this.h;
            if (i3 == 255) {
                anb.R(imageView, f0, null, anb.g(i2, 25), dVar.getResourceProvider());
            } else {
                imageView.setBackground(f0);
            }
            anb.s(this.h, cmb.Te, dVar.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.h.setContentDescription(jb6.M0(2131751978, null));
            this.h.setImageResource(2131231988);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final k02 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    k02 k02Var = this.b;
                    switch (b) {
                        case 0:
                            d dVar2 = k02Var.a;
                            i02 i02Var = k02Var.i;
                            if (i02Var == null) {
                                i02Var = new i02(k02Var, dVar2, k02Var.b.id);
                                k02Var.i = i02Var;
                            }
                            dVar2.showDialog(i02Var);
                            return;
                        default:
                            k02Var.a.getMessagesController().L4(k02Var.k, k02Var.b.id);
                            k02Var.l = k02Var.k;
                            k02Var.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, qoe.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.j;
            if (chatFull != null) {
                c(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void c(int i, List list, boolean z) {
        if (this.d != null) {
            d dVar = this.a;
            if (i <= 0) {
                TLRPC.Chat chat = this.b;
                if (chat != null) {
                    dVar.getMessagesController().L4(0, chat.id);
                    this.l = 0;
                }
                a(false, z);
                this.k = 0;
            } else if (this.k != i) {
                this.k = i;
                this.g.setText(jb6.G(i, "JoinUsersRequests", new Object[0]));
                a(true, z);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i2 = 0; i2 < min; i2++) {
                        TLRPC.User W1 = dVar.getMessagesController().W1((Long) list.get(i2));
                        if (W1 != null) {
                            this.e.b(i2, this.c, W1);
                        }
                    }
                    this.e.setCount(min);
                    this.e.a(true);
                }
            }
        }
    }
}
