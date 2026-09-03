package jh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.c9;
import org.telegram.ui.ve;
public final class e {
    public final p2 f9400a;
    public final TLRPC.Chat f9401b;
    public final int f9402c;
    public FrameLayout d;
    public b e;
    public LinearLayout f9403f;
    public TextView f9404g;
    public ImageView h;
    public c f9405i;
    public TLRPC.ChatFull f9406j;
    public int f9407k;
    public int f9408l = -1;
    public d f9409m;

    public e(TLRPC.Chat chat, p2 p2Var) {
        this.f9400a = p2Var;
        this.f9401b = chat;
        this.f9402c = p2Var.getCurrentAccount();
    }

    public final void a(boolean z4, boolean z10) {
        boolean z11;
        if (this.d.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z4 != z11) {
            if (z4) {
                int i10 = this.f9408l;
                p2 p2Var = this.f9400a;
                TLRPC.Chat chat = this.f9401b;
                if (i10 == -1 && chat != null) {
                    this.f9408l = p2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f19159id);
                }
                int i11 = this.f9407k;
                int i12 = this.f9408l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        p2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f19159id, 0);
                    }
                } else {
                    return;
                }
            }
            d dVar = this.f9409m;
            if (dVar != null) {
                dVar.g(z4, z10);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new l6(this.f9404g, 4, null, null, null, null, j6.f19924fe));
        arrayList.add(new l6(this.h, 8, null, null, null, null, j6.f19889de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            p2 p2Var = this.f9400a;
            FrameLayout frameLayout = new FrameLayout(p2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(j6.K0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final e f9399b;

                {
                    this.f9399b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            e eVar = this.f9399b;
                            p2 p2Var2 = eVar.f9400a;
                            if (eVar.f9405i == null) {
                                eVar.f9405i = new c(eVar, p2Var2, eVar.f9401b.f19159id);
                            }
                            p2Var2.showDialog(eVar.f9405i);
                            return;
                        default:
                            e eVar2 = this.f9399b;
                            eVar2.f9400a.getMessagesController().setChatPendingRequestsOnClose(eVar2.f9401b.f19159id, eVar2.f9407k);
                            eVar2.f9408l = eVar2.f9407k;
                            eVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(p2Var.getParentActivity());
            this.f9403f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f9403f, b6.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            b bVar = new b(0, p2Var.getParentActivity(), false);
            this.e = bVar;
            bVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            c9 c9Var = this.e.f24231a;
            for (int i10 = 0; i10 < c9Var.f23877c.length; i10++) {
                c9Var.l(0, null, 0);
            }
            this.f9403f.addView(this.e, b6.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(p2Var.getParentActivity());
            this.f9404g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f9404g.setGravity(16);
            this.f9404g.setSingleLine();
            this.f9404g.setText((CharSequence) null);
            this.f9404g.setTextColor(p2Var.getThemedColor(j6.f19924fe));
            this.f9404g.setTypeface(AndroidUtilities.bold());
            this.f9403f.addView(this.f9404g, b6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(p2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(j6.f0(p2Var.getThemedColor(j6.f20239x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(p2Var.getThemedColor(j6.f19889de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final e f9399b;

                {
                    this.f9399b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            e eVar = this.f9399b;
                            p2 p2Var2 = eVar.f9400a;
                            if (eVar.f9405i == null) {
                                eVar.f9405i = new c(eVar, p2Var2, eVar.f9401b.f19159id);
                            }
                            p2Var2.showDialog(eVar.f9405i);
                            return;
                        default:
                            e eVar2 = this.f9399b;
                            eVar2.f9400a.getMessagesController().setChatPendingRequestsOnClose(eVar2.f9401b.f19159id, eVar2.f9407k);
                            eVar2.f9408l = eVar2.f9407k;
                            eVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, b6.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f9406j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(ve veVar) {
        this.f9409m = veVar;
    }

    public final void e(int i10, List list, boolean z4) {
        if (this.d != null) {
            p2 p2Var = this.f9400a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f9401b;
                if (chat != null) {
                    p2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f19159id, 0);
                    this.f9408l = 0;
                }
                a(false, z4);
                this.f9407k = 0;
            } else if (this.f9407k != i10) {
                this.f9407k = i10;
                this.f9404g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
                a(true, z4);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User user = p2Var.getMessagesController().getUser((Long) list.get(i11));
                        if (user != null) {
                            this.e.b(i11, user, this.f9402c);
                        }
                    }
                    this.e.setCount(min);
                    this.e.a(true);
                }
            }
        }
    }
}
