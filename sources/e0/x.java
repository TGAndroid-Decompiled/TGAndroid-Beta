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
    public final ArrayList f10305e = new ArrayList();
    public final ArrayList f10306f = new ArrayList();
    public final j0 f10307g;
    public CharSequence h;
    public Boolean f10308i;

    public x() {
        ?? obj = new Object();
        obj.f10260a = "";
        obj.f10261b = null;
        obj.f10262c = null;
        obj.d = null;
        obj.f10263e = false;
        obj.f10264f = false;
        this.f10307g = obj;
    }

    @Override
    public final void a(Bundle bundle) {
        super.a(bundle);
        j0 j0Var = this.f10307g;
        bundle.putCharSequence("android.selfDisplayName", j0Var.f10260a);
        bundle.putBundle("android.messagingStyleUser", j0Var.c());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.f10308i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.f10305e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", w.a(arrayList));
        }
        ArrayList arrayList2 = this.f10306f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", w.a(arrayList2));
        }
        Boolean bool = this.f10308i;
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
        return this.f10305e;
    }

    public final SpannableStringBuilder e(w wVar) {
        p0.b bVar;
        CharSequence charSequence;
        String str = p0.b.f55105b;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            bVar = p0.b.f55107e;
        } else {
            bVar = p0.b.d;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        j0 j0Var = wVar.f10302c;
        CharSequence charSequence2 = "";
        if (j0Var == null) {
            charSequence = "";
        } else {
            charSequence = j0Var.f10260a;
        }
        int i7 = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.f10307g.f10260a;
            int i10 = this.f10309a.f10296w;
            if (i10 != 0) {
                i7 = i10;
            }
        }
        SpannableStringBuilder c10 = bVar.c(charSequence);
        spannableStringBuilder.append((CharSequence) c10);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i7), null), spannableStringBuilder.length() - c10.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence3 = wVar.f10300a;
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
        if (!TextUtils.isEmpty(j0Var.f10260a)) {
            this.f10307g = j0Var;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
