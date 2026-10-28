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
    public final ArrayList f9601f = new ArrayList();
    public final l0 f9602g;
    public CharSequence h;
    public Boolean f9603i;

    public x() {
        ?? obj = new Object();
        obj.f9564a = "";
        obj.f9565b = null;
        obj.f9566c = null;
        obj.d = null;
        obj.e = false;
        obj.f9567f = false;
        this.f9602g = obj;
    }

    @Override
    public final void a(Bundle bundle) {
        super.a(bundle);
        l0 l0Var = this.f9602g;
        bundle.putCharSequence("android.selfDisplayName", l0Var.f9564a);
        bundle.putBundle("android.messagingStyleUser", l0Var.c());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.f9603i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", w.a(arrayList));
        }
        ArrayList arrayList2 = this.f9601f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", w.a(arrayList2));
        }
        Boolean bool = this.f9603i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override
    public final void b(e0.e0 r10) {
        throw new UnsupportedOperationException("Method not decompiled: e0.x.b(e0.e0):void");
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
        String str = p0.b.f46508b;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            bVar = p0.b.e;
        } else {
            bVar = p0.b.d;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        l0 l0Var = wVar.f9599c;
        CharSequence charSequence2 = "";
        if (l0Var == null) {
            charSequence = "";
        } else {
            charSequence = l0Var.f9564a;
        }
        int i10 = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.f9602g.f9564a;
            int i11 = this.f9604a.f9593w;
            if (i11 != 0) {
                i10 = i11;
            }
        }
        SpannableStringBuilder c10 = bVar.c(charSequence);
        spannableStringBuilder.append((CharSequence) c10);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i10), null), spannableStringBuilder.length() - c10.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence3 = wVar.f9597a;
        if (charSequence3 != null) {
            charSequence2 = charSequence3;
        }
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) bVar.c(charSequence2));
        return spannableStringBuilder;
    }

    public final void f(String str) {
        this.h = str;
    }

    public x(l0 l0Var) {
        if (!TextUtils.isEmpty(l0Var.f9564a)) {
            this.f9602g = l0Var;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
