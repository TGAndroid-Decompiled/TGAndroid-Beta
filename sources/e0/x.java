package e0;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
public final class x extends y {
    public final ArrayList e = new ArrayList();
    public final ArrayList f8167f = new ArrayList();
    public final m0 f8168g;
    public CharSequence h;
    public Boolean f8169i;

    public x() {
        ?? obj = new Object();
        obj.f8130a = "";
        obj.f8131b = null;
        obj.f8132c = null;
        obj.d = null;
        obj.e = false;
        obj.f8133f = false;
        this.f8168g = obj;
    }

    @Override
    public final void a(Bundle bundle) {
        super.a(bundle);
        m0 m0Var = this.f8168g;
        bundle.putCharSequence("android.selfDisplayName", m0Var.f8130a);
        bundle.putBundle("android.messagingStyleUser", m0Var.c());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.f8169i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", w.a(arrayList));
        }
        ArrayList arrayList2 = this.f8167f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", w.a(arrayList2));
        }
        Boolean bool = this.f8169i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override
    public final void b(e0.f0 r10) {
        throw new UnsupportedOperationException("Method not decompiled: e0.x.b(e0.f0):void");
    }

    @Override
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    public final List d() {
        return this.e;
    }

    public final SpannableStringBuilder e(w wVar) {
        p0.b bVar;
        CharSequence charSequence;
        String str = p0.b.f43909b;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            bVar = p0.b.e;
        } else {
            bVar = p0.b.d;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        m0 m0Var = wVar.f8165c;
        CharSequence charSequence2 = "";
        if (m0Var == null) {
            charSequence = "";
        } else {
            charSequence = m0Var.f8130a;
        }
        int i10 = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.f8168g.f8130a;
            int i11 = this.f8170a.f8159w;
            if (i11 != 0) {
                i10 = i11;
            }
        }
        SpannableStringBuilder c10 = bVar.c(charSequence);
        spannableStringBuilder.append((CharSequence) c10);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i10), null), spannableStringBuilder.length() - c10.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence3 = wVar.f8163a;
        if (charSequence3 != null) {
            charSequence2 = charSequence3;
        }
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) bVar.c(charSequence2));
        return spannableStringBuilder;
    }

    public final void f(String str) {
        this.h = str;
    }

    public x(m0 m0Var) {
        if (!TextUtils.isEmpty(m0Var.f8130a)) {
            this.f8168g = m0Var;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
