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
public final class xy1 {
    public final d a;
    public final TLRPC.Chat b;
    public final int c;
    public FrameLayout d;
    public uy1 e;
    public LinearLayout f;
    public TextView g;
    public ImageView h;
    public vy1 i;
    public TLRPC.ChatFull j;
    public int k;
    public int l = -1;
    public wy1 m;

    public xy1(d dVar, TLRPC.Chat chat) {
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
                    na7 messagesController = dVar.getMessagesController();
                    long j = chat.id;
                    i = messagesController.X3.getInt("chatPendingRequests" + j, 0);
                    this.l = i;
                }
                if (this.k != i) {
                    if (i != 0 && chat != null) {
                        dVar.getMessagesController().I4(0, chat.id);
                    }
                } else {
                    return;
                }
            }
            wy1 wy1Var = this.m;
            if (wy1Var != null) {
                wy1Var.h(z, z2);
            }
        }
    }

    public final FrameLayout b() {
        if (this.d == null) {
            d dVar = this.a;
            FrameLayout frameLayout = new FrameLayout(dVar.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(bkb.L0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final xy1 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    xy1 xy1Var = this.b;
                    switch (b) {
                        case 0:
                            d dVar2 = xy1Var.a;
                            vy1 vy1Var = xy1Var.i;
                            if (vy1Var == null) {
                                vy1Var = new vy1(xy1Var, dVar2, xy1Var.b.id);
                                xy1Var.i = vy1Var;
                            }
                            dVar2.showDialog(vy1Var);
                            return;
                        default:
                            xy1Var.a.getMessagesController().I4(xy1Var.k, xy1Var.b.id);
                            xy1Var.l = xy1Var.k;
                            xy1Var.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(dVar.getParentActivity());
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f, nme.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            uy1 uy1Var = new uy1((byte) 0, dVar.getParentActivity(), false);
            this.e = uy1Var;
            uy1Var.setAvatarsTextSize(gl.L(18.0f));
            gc0 gc0Var = this.e.a;
            for (int i = 0; i < gc0Var.c.length; i++) {
                gc0Var.j(0, 0, null);
            }
            this.f.addView(this.e, nme.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(dVar.getParentActivity());
            this.g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.g.setGravity(16);
            this.g.setSingleLine();
            this.g.setText((CharSequence) null);
            zkb.X(this.g, bkb.Ve, dVar.getResourceProvider());
            this.g.setTypeface(gl.o());
            this.f.addView(this.g, nme.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.h = new ImageView(dVar.getParentActivity());
            int i2 = bkb.w7;
            int themedColor = dVar.getThemedColor(i2);
            ff0 f0 = bkb.f0(436207615 & themedColor, 1, gl.L(14.0f));
            int i3 = themedColor >>> 24;
            ImageView imageView = this.h;
            if (i3 == 255) {
                zkb.R(imageView, f0, null, zkb.g(i2, 25), dVar.getResourceProvider());
            } else {
                imageView.setBackground(f0);
            }
            zkb.s(this.h, bkb.Te, dVar.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.h.setContentDescription(k96.M0(2131752029, null));
            this.h.setImageResource(2131231987);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final xy1 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    xy1 xy1Var = this.b;
                    switch (b) {
                        case 0:
                            d dVar2 = xy1Var.a;
                            vy1 vy1Var = xy1Var.i;
                            if (vy1Var == null) {
                                vy1Var = new vy1(xy1Var, dVar2, xy1Var.b.id);
                                xy1Var.i = vy1Var;
                            }
                            dVar2.showDialog(vy1Var);
                            return;
                        default:
                            xy1Var.a.getMessagesController().I4(xy1Var.k, xy1Var.b.id);
                            xy1Var.l = xy1Var.k;
                            xy1Var.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, nme.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
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
                    dVar.getMessagesController().I4(0, chat.id);
                    this.l = 0;
                }
                a(false, z);
                this.k = 0;
            } else if (this.k != i) {
                this.k = i;
                this.g.setText(k96.G(i, "JoinUsersRequests", new Object[0]));
                a(true, z);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i2 = 0; i2 < min; i2++) {
                        TLRPC.User V1 = dVar.getMessagesController().V1((Long) list.get(i2));
                        if (V1 != null) {
                            this.e.b(i2, this.c, V1);
                        }
                    }
                    this.e.setCount(min);
                    this.e.a(true);
                }
            }
        }
    }
}
