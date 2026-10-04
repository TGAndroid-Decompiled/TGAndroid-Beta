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
    public Context f10136a;
    public String f10137b;
    public Intent[] f10138c;
    public ComponentName d;
    public CharSequence f10139e;
    public CharSequence f10140f;
    public CharSequence f10141g;
    public IconCompat h;
    public p0[] f10142i;
    public Set f10143j;
    public h f10144k;
    public boolean f10145l;
    public int f10146m;
    public PersistableBundle f10147n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f10137b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f10138c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f10136a, this.f10137b).setShortLabel(this.f10139e).setIntents(this.f10138c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f10136a));
        }
        if (!TextUtils.isEmpty(this.f10140f)) {
            intents.setLongLabel(this.f10140f);
        }
        if (!TextUtils.isEmpty(this.f10141g)) {
            intents.setDisabledMessage(this.f10141g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f10143j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f10146m);
        PersistableBundle persistableBundle = this.f10147n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            p0[] p0VarArr = this.f10142i;
            if (p0VarArr != null && p0VarArr.length > 0) {
                int length = p0VarArr.length;
                Person[] personArr = new Person[length];
                while (i10 < length) {
                    p0 p0Var = this.f10142i[i10];
                    p0Var.getClass();
                    personArr[i10] = b5.d.E(p0Var);
                    i10++;
                }
                intents.setPersons(personArr);
            }
            h hVar = this.f10144k;
            if (hVar != null) {
                intents.setLocusId(hVar.f9542b);
            }
            intents.setLongLived(this.f10145l);
        } else {
            if (this.f10147n == null) {
                this.f10147n = new PersistableBundle();
            }
            p0[] p0VarArr2 = this.f10142i;
            if (p0VarArr2 != null && p0VarArr2.length > 0) {
                this.f10147n.putInt("extraPersonCount", p0VarArr2.length);
                while (i10 < this.f10142i.length) {
                    PersistableBundle persistableBundle2 = this.f10147n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i11 = i10 + 1;
                    sb2.append(i11);
                    String sb3 = sb2.toString();
                    p0 p0Var2 = this.f10142i[i10];
                    p0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = p0Var2.f8467a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", p0Var2.f8469c);
                    persistableBundle3.putString("key", p0Var2.d);
                    persistableBundle3.putBoolean("isBot", p0Var2.f8470e);
                    persistableBundle3.putBoolean("isImportant", p0Var2.f8471f);
                    persistableBundle2.putPersistableBundle(sb3, persistableBundle3);
                    i10 = i11;
                }
            }
            h hVar2 = this.f10144k;
            if (hVar2 != null) {
                this.f10147n.putString("extraLocusId", hVar2.f9541a);
            }
            this.f10147n.putBoolean("extraLongLived", this.f10145l);
            intents.setExtras(this.f10147n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.h(intents);
        }
        return intents.build();
    }
}
