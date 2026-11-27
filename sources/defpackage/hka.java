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
public final class hka {
    public Context a;
    public String b;
    public Intent[] c;
    public ComponentName d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public IconCompat h;
    public b78[] i;
    public Set j;
    public yd6 k;
    public boolean l;
    public int m;
    public PersistableBundle n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new gka(context, (ShortcutInfo) it.next()).a());
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
            intents.setIcon(jpe.a(iconCompat, this.a));
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
            b78[] b78VarArr = this.i;
            if (b78VarArr != null && b78VarArr.length > 0) {
                int length = b78VarArr.length;
                Person[] personArr = new Person[length];
                while (i < length) {
                    b78 b78Var = this.i[i];
                    b78Var.getClass();
                    personArr[i] = go.G(b78Var);
                    i++;
                }
                intents.setPersons(personArr);
            }
            yd6 yd6Var = this.k;
            if (yd6Var != null) {
                intents.setLocusId(yd6Var.b);
            }
            intents.setLongLived(this.l);
        } else {
            PersistableBundle persistableBundle2 = this.n;
            if (persistableBundle2 == null) {
                persistableBundle2 = new PersistableBundle();
                this.n = persistableBundle2;
            }
            b78[] b78VarArr2 = this.i;
            if (b78VarArr2 != null && b78VarArr2.length > 0) {
                persistableBundle2.putInt("extraPersonCount", b78VarArr2.length);
                while (i < this.i.length) {
                    PersistableBundle persistableBundle3 = this.n;
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i2 = i + 1;
                    sb.append(i2);
                    String sb2 = sb.toString();
                    b78 b78Var2 = this.i[i];
                    b78Var2.getClass();
                    PersistableBundle persistableBundle4 = new PersistableBundle();
                    CharSequence charSequence = b78Var2.a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle4.putString("name", str);
                    persistableBundle4.putString("uri", b78Var2.c);
                    persistableBundle4.putString("key", b78Var2.d);
                    persistableBundle4.putBoolean("isBot", b78Var2.e);
                    persistableBundle4.putBoolean("isImportant", b78Var2.f);
                    persistableBundle3.putPersistableBundle(sb2, persistableBundle4);
                    i = i2;
                }
            }
            yd6 yd6Var2 = this.k;
            if (yd6Var2 != null) {
                this.n.putString("extraLocusId", yd6Var2.a);
            }
            this.n.putBoolean("extraLongLived", this.l);
            intents.setExtras(this.n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            t4.k(intents);
        }
        return intents.build();
    }
}
