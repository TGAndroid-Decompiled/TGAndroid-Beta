package g0;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import e0.p0;
import f0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public final class c {
    public Context f8458a;
    public String f8459b;
    public Intent[] f8460c;
    public ComponentName d;
    public CharSequence e;
    public CharSequence f8461f;
    public CharSequence f8462g;
    public IconCompat h;
    public p0[] f8463i;
    public Set f8464j;
    public h f8465k;
    public boolean f8466l;
    public int f8467m;
    public PersistableBundle f8468n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f8459b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f8460c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f8458a, this.f8459b).setShortLabel(this.e).setIntents(this.f8460c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f8458a));
        }
        if (!TextUtils.isEmpty(this.f8461f)) {
            intents.setLongLabel(this.f8461f);
        }
        if (!TextUtils.isEmpty(this.f8462g)) {
            intents.setDisabledMessage(this.f8462g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f8464j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f8467m);
        PersistableBundle persistableBundle = this.f8468n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            p0[] p0VarArr = this.f8463i;
            if (p0VarArr != null && p0VarArr.length > 0) {
                int length = p0VarArr.length;
                Person[] personArr = new Person[length];
                while (i10 < length) {
                    p0 p0Var = this.f8463i[i10];
                    p0Var.getClass();
                    personArr[i10] = b5.d.E(p0Var);
                    i10++;
                }
                intents.setPersons(personArr);
            }
            h hVar = this.f8465k;
            if (hVar != null) {
                intents.setLocusId(hVar.f7672b);
            }
            intents.setLongLived(this.f8466l);
        } else {
            if (this.f8468n == null) {
                this.f8468n = new PersistableBundle();
            }
            p0[] p0VarArr2 = this.f8463i;
            if (p0VarArr2 != null && p0VarArr2.length > 0) {
                this.f8468n.putInt("extraPersonCount", p0VarArr2.length);
                while (i10 < this.f8463i.length) {
                    PersistableBundle persistableBundle2 = this.f8468n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i11 = i10 + 1;
                    sb2.append(i11);
                    String sb3 = sb2.toString();
                    p0 p0Var2 = this.f8463i[i10];
                    p0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = p0Var2.f7124a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", p0Var2.f7126c);
                    persistableBundle3.putString("key", p0Var2.d);
                    persistableBundle3.putBoolean("isBot", p0Var2.e);
                    persistableBundle3.putBoolean("isImportant", p0Var2.f7127f);
                    persistableBundle2.putPersistableBundle(sb3, persistableBundle3);
                    i10 = i11;
                }
            }
            h hVar2 = this.f8465k;
            if (hVar2 != null) {
                this.f8468n.putString("extraLocusId", hVar2.f7671a);
            }
            this.f8468n.putBoolean("extraLongLived", this.f8466l);
            intents.setExtras(this.f8468n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.h(intents);
        }
        return intents.build();
    }
}
