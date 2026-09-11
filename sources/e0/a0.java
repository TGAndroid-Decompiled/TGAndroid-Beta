package e0;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
public final class a0 extends b0 {
    public final ArrayList f8599e = new ArrayList();
    public final ArrayList f8600f = new ArrayList();
    public final p0 f8601g;
    public CharSequence h;
    public Boolean f8602i;

    public a0() {
        ?? obj = new Object();
        obj.f8667a = "";
        obj.f8668b = null;
        obj.f8669c = null;
        obj.d = null;
        obj.f8670e = false;
        obj.f8671f = false;
        this.f8601g = obj;
    }

    @Override
    public final void a(Bundle bundle) {
        super.a(bundle);
        p0 p0Var = this.f8601g;
        bundle.putCharSequence("android.selfDisplayName", p0Var.f8667a);
        bundle.putBundle("android.messagingStyleUser", p0Var.c());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.f8602i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.f8599e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", z.a(arrayList));
        }
        ArrayList arrayList2 = this.f8600f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", z.a(arrayList2));
        }
        Boolean bool = this.f8602i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override
    public final void b(e0.i0 r10) {
        throw new UnsupportedOperationException("Method not decompiled: e0.a0.b(e0.i0):void");
    }

    @Override
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    public final List d() {
        return this.f8599e;
    }

    public final SpannableStringBuilder e(z zVar) {
        p0.b bVar;
        CharSequence charSequence;
        String str = p0.b.f43626b;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            bVar = p0.b.f43628e;
        } else {
            bVar = p0.b.d;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        p0 p0Var = zVar.f8704c;
        CharSequence charSequence2 = "";
        if (p0Var == null) {
            charSequence = "";
        } else {
            charSequence = p0Var.f8667a;
        }
        int i10 = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.f8601g.f8667a;
            int i11 = this.f8603a.f8698w;
            if (i11 != 0) {
                i10 = i11;
            }
        }
        SpannableStringBuilder c10 = bVar.c(charSequence);
        spannableStringBuilder.append((CharSequence) c10);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i10), null), spannableStringBuilder.length() - c10.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence3 = zVar.f8702a;
        if (charSequence3 != null) {
            charSequence2 = charSequence3;
        }
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) bVar.c(charSequence2));
        return spannableStringBuilder;
    }

    public final void f(String str) {
        this.h = str;
    }

    public a0(p0 p0Var) {
        if (!TextUtils.isEmpty(p0Var.f8667a)) {
            this.f8601g = p0Var;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
