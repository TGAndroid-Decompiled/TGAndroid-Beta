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
    public final ArrayList f5651e = new ArrayList();
    public final ArrayList f5652f = new ArrayList();
    public final p0 f5653g;
    public CharSequence h;
    public Boolean f5654i;

    public a0() {
        ?? obj = new Object();
        obj.f5719a = "";
        obj.f5720b = null;
        obj.f5721c = null;
        obj.d = null;
        obj.f5722e = false;
        obj.f5723f = false;
        this.f5653g = obj;
    }

    @Override
    public final void a(Bundle bundle) {
        super.a(bundle);
        p0 p0Var = this.f5653g;
        bundle.putCharSequence("android.selfDisplayName", p0Var.f5719a);
        bundle.putBundle("android.messagingStyleUser", p0Var.c());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.f5654i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.f5651e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", z.a(arrayList));
        }
        ArrayList arrayList2 = this.f5652f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", z.a(arrayList2));
        }
        Boolean bool = this.f5654i;
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
        return this.f5651e;
    }

    public final SpannableStringBuilder e(z zVar) {
        p0.b bVar;
        CharSequence charSequence;
        String str = p0.b.f45404b;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            bVar = p0.b.f45406e;
        } else {
            bVar = p0.b.d;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        p0 p0Var = zVar.f5756c;
        CharSequence charSequence2 = "";
        if (p0Var == null) {
            charSequence = "";
        } else {
            charSequence = p0Var.f5719a;
        }
        int i10 = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.f5653g.f5719a;
            int i11 = this.f5655a.f5750w;
            if (i11 != 0) {
                i10 = i11;
            }
        }
        SpannableStringBuilder c3 = bVar.c(charSequence);
        spannableStringBuilder.append((CharSequence) c3);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i10), null), spannableStringBuilder.length() - c3.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence3 = zVar.f5754a;
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
        if (!TextUtils.isEmpty(p0Var.f5719a)) {
            this.f5653g = p0Var;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
