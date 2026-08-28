package mh;

import android.content.Context;
import android.os.Bundle;
import kh.b8;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class l1 extends sa {
    public final int T;
    public final String U;
    public z41 V;
    public final i1 W;
    public boolean X;
    public boolean Y;
    public final bg.y0 Z;

    public l1(android.content.Context r27, int r28, long r29, org.telegram.tgnet.TLRPC.TL_messages_preparedInlineMessage r31, java.io.File r32, org.telegram.tgnet.TLRPC.WebPage r33, org.telegram.ui.ActionBar.b6 r34, org.telegram.ui.web.t r35, bg.y0 r36) {
        throw new UnsupportedOperationException("Method not decompiled: mh.l1.<init>(android.content.Context, int, long, org.telegram.tgnet.TLRPC$TL_messages_preparedInlineMessage, java.io.File, org.telegram.tgnet.TLRPC$WebPage, org.telegram.ui.ActionBar.b6, org.telegram.ui.web.t, bg.y0):void");
    }

    public static mh.k1 O(int r4, long r5, org.telegram.tgnet.TLRPC.BotInlineResult r7, org.telegram.tgnet.TLRPC.TL_photo r8, org.telegram.tgnet.TLRPC.TL_document r9, org.telegram.tgnet.TLRPC.WebPage r10) {
        throw new UnsupportedOperationException("Method not decompiled: mh.l1.O(int, long, org.telegram.tgnet.TLRPC$BotInlineResult, org.telegram.tgnet.TLRPC$TL_photo, org.telegram.tgnet.TLRPC$TL_document, org.telegram.tgnet.TLRPC$WebPage):mh.k1");
    }

    public static void P(Context context, int i9, long j10, String str, b6 b6Var, org.telegram.ui.web.t tVar, bg.y0 y0Var) {
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
        c2Var.q(500L);
        TLRPC.TL_messages_getPreparedInlineMessage tL_messages_getPreparedInlineMessage = new TLRPC.TL_messages_getPreparedInlineMessage();
        tL_messages_getPreparedInlineMessage.bot = MessagesController.getInstance(i9).getInputUser(j10);
        tL_messages_getPreparedInlineMessage.f22478id = str;
        ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getPreparedInlineMessage, new z0(i9, c2Var, context, j10, b6Var, tVar, y0Var));
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (!this.X && !this.Y) {
            this.Y = true;
            bg.y0 y0Var = this.Z;
            if (y0Var != null) {
                y0Var.run("USER_DECLINED", null);
            }
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        int h;
        super.onCreate(bundle);
        wk0 wk0Var = this.d;
        if (wk0Var.getAdapter() == null) {
            h = 0;
        } else {
            h = wk0Var.getAdapter().h();
        }
        wk0Var.u0(Math.max(h - 1, 0));
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(wk0Var, getContext(), this.T, 0, true, new b8(this, 8), this.resourcesProvider);
        this.V = z41Var;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.BotShareMessage);
    }
}
