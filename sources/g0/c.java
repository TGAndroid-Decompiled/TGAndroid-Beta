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

    public Context f6331a;

    public String f6332b;

    public Intent[] f6333c;
    public ComponentName d;

    public CharSequence f6334e;

    public CharSequence f6335f;

    public CharSequence f6336g;
    public IconCompat h;

    public p0[] f6337i;

    public Set f6338j;

    public h f6339k;

    public boolean f6340l;

    public int f6341m;

    public PersistableBundle f6342n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f6332b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f6333c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f6331a, this.f6332b).setShortLabel(this.f6334e).setIntents(this.f6333c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f6331a));
        }
        if (!TextUtils.isEmpty(this.f6335f)) {
            intents.setLongLabel(this.f6335f);
        }
        if (!TextUtils.isEmpty(this.f6336g)) {
            intents.setDisabledMessage(this.f6336g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f6338j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f6341m);
        PersistableBundle persistableBundle = this.f6342n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            p0[] p0VarArr = this.f6337i;
            if (p0VarArr != null && p0VarArr.length > 0) {
                int length = p0VarArr.length;
                Person[] personArr = new Person[length];
                while (i10 < length) {
                    p0 p0Var = this.f6337i[i10];
                    p0Var.getClass();
                    personArr[i10] = d1.f.D(p0Var);
                    i10++;
                }
                intents.setPersons(personArr);
            }
            h hVar = this.f6339k;
            if (hVar != null) {
                intents.setLocusId(hVar.f5602b);
            }
            intents.setLongLived(this.f6340l);
        } else {
            if (this.f6342n == null) {
                this.f6342n = new PersistableBundle();
            }
            p0[] p0VarArr2 = this.f6337i;
            if (p0VarArr2 != null && p0VarArr2.length > 0) {
                this.f6342n.putInt("extraPersonCount", p0VarArr2.length);
                while (i10 < this.f6337i.length) {
                    PersistableBundle persistableBundle2 = this.f6342n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i11 = i10 + 1;
                    sb2.append(i11);
                    String string = sb2.toString();
                    p0 p0Var2 = this.f6337i[i10];
                    p0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = p0Var2.f5106a;
                    persistableBundle3.putString("name", charSequence != null ? charSequence.toString() : null);
                    persistableBundle3.putString("uri", p0Var2.f5108c);
                    persistableBundle3.putString("key", p0Var2.d);
                    persistableBundle3.putBoolean("isBot", p0Var2.f5109e);
                    persistableBundle3.putBoolean("isImportant", p0Var2.f5110f);
                    persistableBundle2.putPersistableBundle(string, persistableBundle3);
                    i10 = i11;
                }
            }
            h hVar2 = this.f6339k;
            if (hVar2 != null) {
                this.f6342n.putString("extraLocusId", hVar2.f5601a);
            }
            this.f6342n.putBoolean("extraLongLived", this.f6340l);
            intents.setExtras(this.f6342n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.f(intents);
        }
        return intents.build();
    }
}
