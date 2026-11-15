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
    public final ArrayList f9958e = new ArrayList();
    public final ArrayList f9959f = new ArrayList();
    public final j0 f9960g;
    public CharSequence h;
    public Boolean f9961i;

    public x() {
        ?? obj = new Object();
        obj.f9913a = "";
        obj.f9914b = null;
        obj.f9915c = null;
        obj.d = null;
        obj.f9916e = false;
        obj.f9917f = false;
        this.f9960g = obj;
    }

    @Override
    public final void a(Bundle bundle) {
        super.a(bundle);
        j0 j0Var = this.f9960g;
        bundle.putCharSequence("android.selfDisplayName", j0Var.f9913a);
        bundle.putBundle("android.messagingStyleUser", j0Var.c());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.f9961i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.f9958e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", w.a(arrayList));
        }
        ArrayList arrayList2 = this.f9959f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", w.a(arrayList2));
        }
        Boolean bool = this.f9961i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override
    public final void b(a4.k r10) {
        throw new UnsupportedOperationException("Method not decompiled: e0.x.b(a4.k):void");
    }

    @Override
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    public final List d() {
        return this.f9958e;
    }

    public final SpannableStringBuilder e(w wVar) {
        p0.b bVar;
        CharSequence charSequence;
        String str = p0.b.f54491b;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            bVar = p0.b.f54493e;
        } else {
            bVar = p0.b.d;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        j0 j0Var = wVar.f9955c;
        CharSequence charSequence2 = "";
        if (j0Var == null) {
            charSequence = "";
        } else {
            charSequence = j0Var.f9913a;
        }
        int i7 = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.f9960g.f9913a;
            int i10 = this.f9962a.f9949w;
            if (i10 != 0) {
                i7 = i10;
            }
        }
        SpannableStringBuilder c10 = bVar.c(charSequence);
        spannableStringBuilder.append((CharSequence) c10);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i7), null), spannableStringBuilder.length() - c10.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence3 = wVar.f9953a;
        if (charSequence3 != null) {
            charSequence2 = charSequence3;
        }
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) bVar.c(charSequence2));
        return spannableStringBuilder;
    }

    public final void f(String str) {
        this.h = str;
    }

    public x(j0 j0Var) {
        if (!TextUtils.isEmpty(j0Var.f9913a)) {
            this.f9960g = j0Var;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
