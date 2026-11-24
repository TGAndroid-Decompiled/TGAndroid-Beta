package defpackage;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public final class qia {
    public Context a;
    public String b;
    public Intent[] c;
    public ComponentName d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public IconCompat h;
    public n58[] i;
    public Set j;
    public td6 k;
    public boolean l;
    public int m;
    public PersistableBundle n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new pia(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final Intent b() {
        Intent[] intentArr = this.c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo c() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.a, this.b).setShortLabel(this.e).setIntents(this.c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(pme.a(iconCompat, this.a));
        }
        if (!TextUtils.isEmpty(this.f)) {
            intents.setLongLabel(this.f);
        }
        if (!TextUtils.isEmpty(this.g)) {
            intents.setDisabledMessage(this.g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.m);
        PersistableBundle persistableBundle = this.n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            n58[] n58VarArr = this.i;
            if (n58VarArr != null && n58VarArr.length > 0) {
                int length = n58VarArr.length;
                Person[] personArr = new Person[length];
                while (i < length) {
                    n58 n58Var = this.i[i];
                    n58Var.getClass();
                    personArr[i] = fp.G(n58Var);
                    i++;
                }
                intents.setPersons(personArr);
            }
            td6 td6Var = this.k;
            if (td6Var != null) {
                intents.setLocusId(td6Var.b);
            }
            intents.setLongLived(this.l);
        } else {
            PersistableBundle persistableBundle2 = this.n;
            if (persistableBundle2 == null) {
                persistableBundle2 = new PersistableBundle();
                this.n = persistableBundle2;
            }
            n58[] n58VarArr2 = this.i;
            if (n58VarArr2 != null && n58VarArr2.length > 0) {
                persistableBundle2.putInt("extraPersonCount", n58VarArr2.length);
                while (i < this.i.length) {
                    PersistableBundle persistableBundle3 = this.n;
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i2 = i + 1;
                    sb.append(i2);
                    String sb2 = sb.toString();
                    n58 n58Var2 = this.i[i];
                    n58Var2.getClass();
                    PersistableBundle persistableBundle4 = new PersistableBundle();
                    CharSequence charSequence = n58Var2.a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle4.putString("name", str);
                    persistableBundle4.putString("uri", n58Var2.c);
                    persistableBundle4.putString("key", n58Var2.d);
                    persistableBundle4.putBoolean("isBot", n58Var2.e);
                    persistableBundle4.putBoolean("isImportant", n58Var2.f);
                    persistableBundle3.putPersistableBundle(sb2, persistableBundle4);
                    i = i2;
                }
            }
            td6 td6Var2 = this.k;
            if (td6Var2 != null) {
                this.n.putString("extraLocusId", td6Var2.a);
            }
            this.n.putBoolean("extraLongLived", this.l);
            intents.setExtras(this.n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            s4.k(intents);
        }
        return intents.build();
    }
}
