package e0;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
public final class y extends z {
    public final ArrayList e = new ArrayList();
    public final ArrayList f8289f = new ArrayList();
    public final n0 f8290g;
    public CharSequence h;
    public Boolean f8291i;

    public y() {
        ?? obj = new Object();
        obj.f8252a = "";
        obj.f8253b = null;
        obj.f8254c = null;
        obj.d = null;
        obj.e = false;
        obj.f8255f = false;
        this.f8290g = obj;
    }

    @Override
    public final void a(Bundle bundle) {
        super.a(bundle);
        n0 n0Var = this.f8290g;
        bundle.putCharSequence("android.selfDisplayName", n0Var.f8252a);
        bundle.putBundle("android.messagingStyleUser", n0Var.c());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.f8291i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", x.a(arrayList));
        }
        ArrayList arrayList2 = this.f8289f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", x.a(arrayList2));
        }
        Boolean bool = this.f8291i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override
    public final void b(e0.g0 r10) {
        throw new UnsupportedOperationException("Method not decompiled: e0.y.b(e0.g0):void");
    }

    @Override
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    public final List d() {
        return this.e;
    }

    public final SpannableStringBuilder e(x xVar) {
        p0.b bVar;
        CharSequence charSequence;
        String str = p0.b.f42820b;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            bVar = p0.b.e;
        } else {
            bVar = p0.b.d;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        n0 n0Var = xVar.f8287c;
        CharSequence charSequence2 = "";
        if (n0Var == null) {
            charSequence = "";
        } else {
            charSequence = n0Var.f8252a;
        }
        int i10 = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.f8290g.f8252a;
            int i11 = this.f8292a.f8281w;
            if (i11 != 0) {
                i10 = i11;
            }
        }
        SpannableStringBuilder c10 = bVar.c(charSequence);
        spannableStringBuilder.append((CharSequence) c10);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i10), null), spannableStringBuilder.length() - c10.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence3 = xVar.f8285a;
        if (charSequence3 != null) {
            charSequence2 = charSequence3;
        }
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) bVar.c(charSequence2));
        return spannableStringBuilder;
    }

    public final void f(String str) {
        this.h = str;
    }

    public y(n0 n0Var) {
        if (!TextUtils.isEmpty(n0Var.f8252a)) {
            this.f8290g = n0Var;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
