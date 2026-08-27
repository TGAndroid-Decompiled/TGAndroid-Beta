package fh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.a9;
import org.telegram.ui.oe;

public final class e {

    public final n2 f6105a;

    public final TLRPC.Chat f6106b;

    public final int f6107c;
    public FrameLayout d;

    public b f6108e;

    public LinearLayout f6109f;

    public TextView f6110g;
    public ImageView h;

    public c f6111i;

    public TLRPC.ChatFull f6112j;

    public int f6113k;

    public int f6114l = -1;

    public d f6115m;

    public e(TLRPC.Chat chat, n2 n2Var) {
        this.f6105a = n2Var;
        this.f6106b = chat;
        this.f6107c = n2Var.getCurrentAccount();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == (this.d.getVisibility() == 0)) {
            return;
        }
        if (z10) {
            int i10 = this.f6114l;
            n2 n2Var = this.f6105a;
            TLRPC.Chat chat = this.f6106b;
            if (i10 == -1 && chat != null) {
                this.f6114l = n2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f22380id);
            }
            int i11 = this.f6113k;
            int i12 = this.f6114l;
            if (i11 == i12) {
                return;
            }
            if (i12 != 0 && chat != null) {
                n2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f22380id, 0);
            }
        }
        d dVar = this.f6115m;
        if (dVar != null) {
            dVar.e(z10, z11);
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new i6(this.f6110g, 4, null, null, null, null, g6.f23097fe));
        arrayList.add(new i6(this.h, 8, null, null, null, null, g6.f23061de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            n2 n2Var = this.f6105a;
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(g6.K0(false));
            final int i10 = 0;
            this.d.setOnClickListener(new View.OnClickListener(this) {

                public final e f6103b;

                {
                    this.f6103b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            e eVar = this.f6103b;
                            n2 n2Var2 = eVar.f6105a;
                            if (eVar.f6111i == null) {
                                eVar.f6111i = new c(eVar, n2Var2, eVar.f6106b.f22380id);
                            }
                            n2Var2.showDialog(eVar.f6111i);
                            break;
                        default:
                            e eVar2 = this.f6103b;
                            eVar2.f6105a.getMessagesController().setChatPendingRequestsOnClose(eVar2.f6106b.f22380id, eVar2.f6113k);
                            eVar2.f6114l = eVar2.f6113k;
                            eVar2.a(false, true);
                            break;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(n2Var.getParentActivity());
            this.f6109f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f6109f, z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            int i11 = 0;
            b bVar = new b(i11, n2Var.getParentActivity(), false);
            this.f6108e = bVar;
            bVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            a9 a9Var = this.f6108e.f27049a;
            for (int i12 = 0; i12 < a9Var.f26664c.length; i12++) {
                a9Var.l(0, null, 0);
            }
            this.f6109f.addView(this.f6108e, z5.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(n2Var.getParentActivity());
            this.f6110g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f6110g.setGravity(16);
            this.f6110g.setSingleLine();
            this.f6110g.setText((CharSequence) null);
            this.f6110g.setTextColor(n2Var.getThemedColor(g6.f23097fe));
            this.f6110g.setTypeface(AndroidUtilities.bold());
            this.f6109f.addView(this.f6110g, z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(n2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(g6.f0(n2Var.getThemedColor(g6.f23407x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(n2Var.getThemedColor(g6.f23061de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            final int i13 = 1;
            this.h.setOnClickListener(new View.OnClickListener(this) {

                public final e f6103b;

                {
                    this.f6103b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            e eVar = this.f6103b;
                            n2 n2Var2 = eVar.f6105a;
                            if (eVar.f6111i == null) {
                                eVar.f6111i = new c(eVar, n2Var2, eVar.f6106b.f22380id);
                            }
                            n2Var2.showDialog(eVar.f6111i);
                            break;
                        default:
                            e eVar2 = this.f6103b;
                            eVar2.f6105a.getMessagesController().setChatPendingRequestsOnClose(eVar2.f6106b.f22380id, eVar2.f6113k);
                            eVar2.f6114l = eVar2.f6113k;
                            eVar2.a(false, true);
                            break;
                    }
                }
            });
            this.d.addView(this.h, z5.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f6112j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(oe oeVar) {
        this.f6115m = oeVar;
    }

    public final void e(int i10, List list, boolean z10) {
        if (this.d == null) {
            return;
        }
        n2 n2Var = this.f6105a;
        if (i10 <= 0) {
            TLRPC.Chat chat = this.f6106b;
            if (chat != null) {
                n2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f22380id, 0);
                this.f6114l = 0;
            }
            a(false, z10);
            this.f6113k = 0;
            return;
        }
        if (this.f6113k != i10) {
            this.f6113k = i10;
            this.f6110g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
            a(true, z10);
            if (list == null || list.isEmpty()) {
                return;
            }
            int iMin = Math.min(3, list.size());
            for (int i11 = 0; i11 < iMin; i11++) {
                TLRPC.User user = n2Var.getMessagesController().getUser((Long) list.get(i11));
                if (user != null) {
                    this.f6108e.b(i11, user, this.f6107c);
                }
            }
            this.f6108e.setCount(iMin);
            this.f6108e.a(true);
        }
    }
}
