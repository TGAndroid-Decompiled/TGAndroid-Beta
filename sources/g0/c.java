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
    public Context f9325a;
    public String f9326b;
    public Intent[] f9327c;
    public ComponentName d;
    public CharSequence e;
    public CharSequence f9328f;
    public CharSequence f9329g;
    public IconCompat h;
    public p0[] f9330i;
    public Set f9331j;
    public h f9332k;
    public boolean f9333l;
    public int f9334m;
    public PersistableBundle f9335n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f9326b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f9327c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f9325a, this.f9326b).setShortLabel(this.e).setIntents(this.f9327c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f9325a));
        }
        if (!TextUtils.isEmpty(this.f9328f)) {
            intents.setLongLabel(this.f9328f);
        }
        if (!TextUtils.isEmpty(this.f9329g)) {
            intents.setDisabledMessage(this.f9329g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f9331j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f9334m);
        PersistableBundle persistableBundle = this.f9335n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            p0[] p0VarArr = this.f9330i;
            if (p0VarArr != null && p0VarArr.length > 0) {
                int length = p0VarArr.length;
                Person[] personArr = new Person[length];
                while (i10 < length) {
                    p0 p0Var = this.f9330i[i10];
                    p0Var.getClass();
                    personArr[i10] = b5.d.E(p0Var);
                    i10++;
                }
                intents.setPersons(personArr);
            }
            h hVar = this.f9332k;
            if (hVar != null) {
                intents.setLocusId(hVar.f8788b);
            }
            intents.setLongLived(this.f9333l);
        } else {
            if (this.f9335n == null) {
                this.f9335n = new PersistableBundle();
            }
            p0[] p0VarArr2 = this.f9330i;
            if (p0VarArr2 != null && p0VarArr2.length > 0) {
                this.f9335n.putInt("extraPersonCount", p0VarArr2.length);
                while (i10 < this.f9330i.length) {
                    PersistableBundle persistableBundle2 = this.f9335n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i11 = i10 + 1;
                    sb2.append(i11);
                    String sb3 = sb2.toString();
                    p0 p0Var2 = this.f9330i[i10];
                    p0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = p0Var2.f7819a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", p0Var2.f7821c);
                    persistableBundle3.putString("key", p0Var2.d);
                    persistableBundle3.putBoolean("isBot", p0Var2.e);
                    persistableBundle3.putBoolean("isImportant", p0Var2.f7822f);
                    persistableBundle2.putPersistableBundle(sb3, persistableBundle3);
                    i10 = i11;
                }
            }
            h hVar2 = this.f9332k;
            if (hVar2 != null) {
                this.f9335n.putString("extraLocusId", hVar2.f8787a);
            }
            this.f9335n.putBoolean("extraLongLived", this.f9333l);
            intents.setExtras(this.f9335n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.h(intents);
        }
        return intents.build();
    }
}
