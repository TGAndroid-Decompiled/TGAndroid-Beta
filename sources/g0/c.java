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
    public Context f9312a;
    public String f9313b;
    public Intent[] f9314c;
    public ComponentName d;
    public CharSequence e;
    public CharSequence f9315f;
    public CharSequence f9316g;
    public IconCompat h;
    public p0[] f9317i;
    public Set f9318j;
    public h f9319k;
    public boolean f9320l;
    public int f9321m;
    public PersistableBundle f9322n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f9313b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f9314c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f9312a, this.f9313b).setShortLabel(this.e).setIntents(this.f9314c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f9312a));
        }
        if (!TextUtils.isEmpty(this.f9315f)) {
            intents.setLongLabel(this.f9315f);
        }
        if (!TextUtils.isEmpty(this.f9316g)) {
            intents.setDisabledMessage(this.f9316g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f9318j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f9321m);
        PersistableBundle persistableBundle = this.f9322n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            p0[] p0VarArr = this.f9317i;
            if (p0VarArr != null && p0VarArr.length > 0) {
                int length = p0VarArr.length;
                Person[] personArr = new Person[length];
                while (i10 < length) {
                    p0 p0Var = this.f9317i[i10];
                    p0Var.getClass();
                    personArr[i10] = b5.d.E(p0Var);
                    i10++;
                }
                intents.setPersons(personArr);
            }
            h hVar = this.f9319k;
            if (hVar != null) {
                intents.setLocusId(hVar.f8775b);
            }
            intents.setLongLived(this.f9320l);
        } else {
            if (this.f9322n == null) {
                this.f9322n = new PersistableBundle();
            }
            p0[] p0VarArr2 = this.f9317i;
            if (p0VarArr2 != null && p0VarArr2.length > 0) {
                this.f9322n.putInt("extraPersonCount", p0VarArr2.length);
                while (i10 < this.f9317i.length) {
                    PersistableBundle persistableBundle2 = this.f9322n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i11 = i10 + 1;
                    sb2.append(i11);
                    String sb3 = sb2.toString();
                    p0 p0Var2 = this.f9317i[i10];
                    p0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = p0Var2.f7806a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", p0Var2.f7808c);
                    persistableBundle3.putString("key", p0Var2.d);
                    persistableBundle3.putBoolean("isBot", p0Var2.e);
                    persistableBundle3.putBoolean("isImportant", p0Var2.f7809f);
                    persistableBundle2.putPersistableBundle(sb3, persistableBundle3);
                    i10 = i11;
                }
            }
            h hVar2 = this.f9319k;
            if (hVar2 != null) {
                this.f9322n.putString("extraLocusId", hVar2.f8774a);
            }
            this.f9322n.putBoolean("extraLongLived", this.f9320l);
            intents.setExtras(this.f9322n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.h(intents);
        }
        return intents.build();
    }
}
